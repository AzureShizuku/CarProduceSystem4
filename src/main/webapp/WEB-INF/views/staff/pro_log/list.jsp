<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>

<head>

<meta charset="utf-8">
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<meta name="renderer" content="webkit">

<title>生产记录</title>
<meta name="keywords" content="生产记录">
<meta name="description" content="生产记录">

<link href="${pageContext.request.contextPath}/static/admin/css/bootstrap.min.css?v=3.4.0" rel="stylesheet">
<link href="${pageContext.request.contextPath}/static/admin/font-awesome/css/font-awesome.css?v=4.3.0" rel="stylesheet">

<!-- Morris -->
<link href="${pageContext.request.contextPath}/static/admin/css/plugins/morris/morris-0.4.3.min.css?t=322" rel="stylesheet">

<!-- Gritter -->
<link href="${pageContext.request.contextPath}/static/admin/js/plugins/gritter/jquery.gritter.css?t=322" rel="stylesheet">

<link href="${pageContext.request.contextPath}/static/admin/css/animate.css?t=322" rel="stylesheet">
<link href="${pageContext.request.contextPath}/static/admin/css/style.css?v=2.2.0" rel="stylesheet">
<link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/static/page/myPagination.css" />

<c:set var="uri" value="${pageContext.request.contextPath}" />

<script type="text/javascript">
var uri='${uri}';
</script>
<style>
.bodyClass::-webkit-scrollbar {
display: none; /* Chrome Safari */
}
.bodyClass {
scrollbar-width: none; /* firefox */
-ms-overflow-style: none; /* IE 10+ */
overflow-x: hidden;
overflow-y: auto;
}

td{
text-align:center
}
td >div{
display:inline
}
th{
text-align:center
}
#batchUpdate{
width:40%
}
video{
width:200px !important;
}
audio{
width:200px !important;
}
</style>
</head>

<body class="bodyClass"  style="background-color:#f3f3f4">

<div class="modal inmodal"  id="bodyModal" tabindex="-1" role="dialog" aria-hidden="true" style="top:80px;left:-200px;">
	<div class="modal-dialog">
		<div class="modal-content animated bounceInRight">
			<div class="modal-header">
				<button type="button" class="close" data-dismiss="modal"><span aria-hidden="true">&times;</span><span class="sr-only">关闭</span>
				</button>
				<h4 class="modal-title"  id="bodyModalTile"></h4>
			</div>
			<div class="modal-body"  id="bodyModalContent">
			</div>
			<div class="modal-footer">
				<button type="button" class="btn btn-white" data-dismiss="modal">关闭</button>
			</div>
		</div>
	</div>
</div>
<div class="row wrapper border-bottom white-bg page-heading">
	<div class="col-lg-10">
		<h2>生产记录</h2>
	</div>
	<div class="col-lg-2">
	</div>
</div>
<div class="gray-bg dashbard-1" style="height:758px">
	<div class="row">
		<div class="col-lg-12">
			<div class="ibox float-e-margins">
				<div class="ibox-title">
					<div class="ibox-tools">
					</div>
				</div>
				<div class="ibox-content">
					<div class="row">
						<div class="col-lg-2">
							<label>生产编号</label>
							<input type="text" class="form-control" value="" placeholder="请输入生产编号" id="proNo" >
						</div>
						<div class="col-lg-2">
							<label>商品编号</label>
							<input type="text" class="form-control" value="" placeholder="请输入商品编号" id="stockProNo" >
						</div>
						<div class="col-lg-2">
							<label>商品名</label>
							<input type="text" class="form-control" value="" placeholder="请输入商品名" id="stockProName" >
						</div>
						<div class="col-lg-2">
							<label>入库状态</label>
							<select  id="inStatus"  class="form-control">
								<option value="">全部</option>
								<c:forEach items="${proStatusList}" var="item">
									<option value="${item.id}">${item.name}</option>
								</c:forEach>
							</select>
						</div>
						<div class="col-lg-1">
							<label style="visibility: hidden;display:block">1</label>
							<button type="button" onclick="ajaxList(1);" class="btn btn-primary">查询</button>
						</div>
					</div>
					<div class="row"  style="margin-top:5px;padding-left: 15px;">
						<c:if test="${user.staffType==5}">
							<a href="${pageContext.request.contextPath}/staff/pro_log/add" class="btn btn-primary">新增</a>
						</c:if>
					</div>
					<div class="row" style="margin-top:5px;margin-bottom:5px;padding-left: 15px;">
					</div>
					<div class="row" style="margin-top:5px;margin-bottom:5px;padding-left: 15px;"></div>
					<div class="table-responsive">
						<table class="table  table-striped table-bordered  table-hover">
							<thead>
								<tr>
									<th>生产编号</th>
									<th>商品编号</th>
									<th>商品名</th>
									<th>质检说明</th>
									<th>质检证书</th>
									<th>创建日期</th>
									<th>入库状态</th>
									<th style="width:200px;">操作</th>
								</tr>
							</thead>
							<tbody  id="pro_log_body">
							</tbody>
						</table>
						<div id="pro_log_bar" class="pagination" style="margin-top:20px;"></div>
					</div>
				</div>
			</div>
		</div>
	</div>
</div>
<!-- Mainly scripts -->
<script src="${pageContext.request.contextPath}/static/admin/js/jquery-2.1.1.min.js?t=322"></script>
<script src="${pageContext.request.contextPath}/static/admin/js/bootstrap.min.js?v=3.4.0"></script>
<script type="text/javascript" src="${pageContext.request.contextPath}/static/page/myPagination.js"></script>
<script type="text/javascript" src="${pageContext.request.contextPath}/static/common/utils/listutils.js?v=7914"></script>

<script>
$(function(){
	ajaxList(1);
});
var currentPage=1;
function ajaxList(page) {
	currentPage=page;
	var proNo = $("#proNo").val();
	var stockProNo = $("#stockProNo").val();
	var stockProName = $("#stockProName").val();
	var inStatus = $("#inStatus").val();
	var countRs = ajaxCount();
	if(countRs.totalPage<page){
		page = countRs.totalPage;
	}
	showLoading('${pageContext.request.contextPath}/static/common/loading.gif');
	$.ajax({
		type : 'get',
		url : "${pageContext.request.contextPath}/staff/pro_log/queryList",
		data : {
			"page":page,
			"proNo":proNo,
			"stockProNo":stockProNo,
			"stockProName":stockProName,
			"inStatus":inStatus
		},
		success : function(result) {
			hideLoading();
			var rows = result.list;//得到数据列
			var total = countRs.count;//得到数据总数
			var totalPage=countRs.totalPage;
			var html = '';
			for (var i = 0; i < rows.length; i++) {
				html += '<tr>' ;
				var proNoVal=setNullToEmpty(rows[i].proLog.proNo);
				html+='<td>'+ proNoVal+'</td>';
				var stockProNoVal=setNullToEmpty(rows[i].proLog.stockProNo);
				html+='<td>'+ stockProNoVal+'</td>';
				var stockProNameVal=setNullToEmpty(rows[i].proLog.stockProName);
				html+='<td>'+ stockProNameVal+'</td>';
				var checkIntroVal=setNullToEmpty(rows[i].proLog.checkIntro);
				html+='<td>'+ checkIntroVal+'</td>';
				var checkFileStr = rows[i].proLog.checkFile;
				if(checkFileStr!=null){
					var checkFileSplit = checkFileStr.split(";");
					var tmp = '';
					for(var j=0;j<checkFileSplit.length;j++){
						if(checkFileSplit[j]!=''){
							tmp+='<div ><a  href="javascript:void(0)" file-url="'+checkFileSplit[j]+'" onclick="downLoadFile(this)">点击下载质检证书</a></div>';
						}
					}
					html+='<td>'+tmp+'</td>';
					}else{
					html+='<td></td>';
				}
				var createDateVal=setNullToEmpty(rows[i].proLog.createDate);
				html+='<td>'+ createDateVal+'</td>';
				var inStatusVal=setNullToEmpty(rows[i].inStatusStr);
				html+='<td>'+inStatusVal+'</td>';
				html+='<td>';
				if(rows[i].proLog.inStatus=='1'&&'${user.staffType}'=='5'){
					html+='<a href="${pageContext.request.contextPath}/staff/pro_log/update?id='+rows[i].proLog.id+'" class="btn btn-success btnStyle">修改</a>';
				}
				if(rows[i].proLog.inStatus=='1'&&'${user.staffType}'=='5'){
					html+='<a href="javascript:void(0)" onclick="del(this)" data-id="'+rows[i].proLog.id+'" class="btn btn-danger btnStyle">删除</a>';
				}
				if(rows[i].proLog.inStatus=='1'){
					html+='<a href="javascript:void(0)" onclick="rk(this)" data-id="'+rows[i].proLog.id+'" act-type="1" class="btn btn-primary btnStyle">已入库</a>';
				}
				html+='</td>';
				html+='</tr>';
			}
			if (rows.length == 0) {
				html += '<tr><td></td><td></td><td></td><td></td><td>无数据</td><td></td><td></td><td></td></tr>';
			}
			$("#pro_log_body").html(html);
			new myPagination({
				id: 'pro_log_bar',
				curPage:page, //初始页码
				pageTotal:totalPage, //总页数
				pageAmount: 10,  //每页多少条
				dataTotal: total, //总共多少条数据
				pageSize: 10, //可选,分页个数
				showPageTotalFlag:true, //是否显示数据统计
				showSkipInputFlag:false, //是否支持跳转
				getPage: function (page) {
					ajaxList(page);
				}
			})
		}
	});
}
function ajaxCount() {
	var rs = null;
	var proNo = $("#proNo").val();
	var stockProNo = $("#stockProNo").val();
	var stockProName = $("#stockProName").val();
	var inStatus = $("#inStatus").val();
	$.ajax({
		type : 'get',
		url : "${pageContext.request.contextPath}/staff/pro_log/queryCount",
		async: false,
		data : {
			"proNo":proNo,
			"stockProNo":stockProNo,
			"stockProName":stockProName,
			"inStatus":inStatus
		},
		success : function(result) {
			rs = result;
		}
	});
	return rs;
}
function rk(e){
	var r=confirm("确认已入库该生产记录？");
	if(r==true){
		var id = $(e).attr("data-id");
		$.ajax({
			type : 'get',
			url : "${pageContext.request.contextPath}/staff/pro_log/rk",
			data : {
				"id":id
			},
			success : function(result) {
				alert(result.msg);
				if(result.code==1){
					ajaxList(currentPage);
				}
			}
		});
	}
}
function del(e){
	if(window.confirm('你确定要删除该生产记录吗')){
		var id = $(e).attr("data-id");
		$.ajax({
			type : 'get',
			url : "${pageContext.request.contextPath}/staff/pro_log/del",
			data : {
				"id":id
			},
			success : function(result) {
				alert(result.msg);
				if(result.code==1){
					ajaxList(currentPage);
				}
			}
		});
		return true;
		}else{
		return false;
	}
}
function downLoadFile(e){
	var url = $(e).attr("file-url");
	window.open(url);
}
function gotoPage(e){
	var url = $(e).attr("data-url");
	window.location.href=url;
}

</script>

</body>

</html>

