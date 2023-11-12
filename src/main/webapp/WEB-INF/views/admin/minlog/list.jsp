<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>

<head>

<meta charset="utf-8">
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<meta name="renderer" content="webkit">

<title>物料入库单</title>
<meta name="keywords" content="物料入库单">
<meta name="description" content="物料入库单">

<link href="${pageContext.request.contextPath}/static/admin/css/bootstrap.min.css?v=3.4.0" rel="stylesheet">
<link href="${pageContext.request.contextPath}/static/admin/font-awesome/css/font-awesome.css?v=4.3.0" rel="stylesheet">

<!-- Morris -->
<link href="${pageContext.request.contextPath}/static/admin/css/plugins/morris/morris-0.4.3.min.css?t=322" rel="stylesheet">

<!-- Gritter -->
<link href="${pageContext.request.contextPath}/static/admin/js/plugins/gritter/jquery.gritter.css?t=322" rel="stylesheet">

<link href="${pageContext.request.contextPath}/static/admin/css/animate.css?t=322" rel="stylesheet">
<link href="${pageContext.request.contextPath}/static/admin/css/style.css?v=2.2.0" rel="stylesheet">
<link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/static/page/myPagination.css" />
<link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/static/selectsearch/jquery.searchableSelect.css" />

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
		<h2>物料入库单</h2>
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
							<label>物料ID</label>
							<select  id="materialId" style="height:30px;width:200px"  >
								<option value="">全部</option>
								<c:forEach items="${materialInfoList}" var="item">
									<option value="${item.id}">${item.name}</option>
								</c:forEach>
							</select>
						</div>
						<div class="col-lg-4"  style="margin-top:4px">
							<label>创建日期</label>
							<div style="height:40px;">
								<div style="width:49%;float:left">
									<input type="text" class="form-control  Wdate"  readonly="readonly"  value=""  onFocus="WdatePicker({startDate: '%y-%M-%d' ,dateFmt:'yyyy-MM-dd',alwaysUseStartDate: true })"  placeholder="请输入开始日期" id="createDate1">
								</div>
								<div style="width:49%;float:left;margin-left:2%">
									<input type="text" class="form-control  Wdate"  readonly="readonly"  value=""  onFocus="WdatePicker({startDate: '%y-%M-%d' ,dateFmt:'yyyy-MM-dd',alwaysUseStartDate: true })"  placeholder="请输入结束日期" id="createDate2">
								</div>
							</div>
						</div>
						<div class="col-lg-2">
							<label>是否确认</label>
							<select  id="isComfirm"  class="form-control">
								<option value="">全部</option>
								<c:forEach items="${isComfirmList}" var="item">
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
					</div>
					<div class="row" style="margin-top:5px;margin-bottom:5px;padding-left: 15px;">
					</div>
					<div class="row" style="margin-top:5px;margin-bottom:5px;padding-left: 15px;"></div>
					<div class="table-responsive">
						<table class="table  table-striped table-bordered  table-hover">
							<thead>
								<tr>
									<th>物料ID</th>
									<th>入库数量</th>
									<th>入库备注</th>
									<th>创建日期</th>
									<th>是否确认</th>
									<th style="width:200px;">操作</th>
								</tr>
							</thead>
							<tbody  id="minlog_body">
							</tbody>
						</table>
						<div id="minlog_bar" class="pagination" style="margin-top:20px;"></div>
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
<script type="text/javascript" src="${pageContext.request.contextPath}/static/datetime/4.8/skin/WdatePicker.css"></script>
<script type="text/javascript" src="${pageContext.request.contextPath}/static/datetime/4.8/WdatePicker.js"></script>
<script type="text/javascript" src="${pageContext.request.contextPath}/static/common/utils/listutils.js?v=2874"></script>
<script type="text/javascript" src="${pageContext.request.contextPath}/static/selectsearch/jquery.searchableSelect.js"></script>

<script>
$(function(){
	$('#materialId').next().remove();
	$('#materialId').searchableSelect();
	$(".searchable-select").css("width","100%");
	$(".searchable-select").css("height","35px");
	$(".searchable-select-holder").css("min-height","20px");
	$(".searchable-select-holder").css("height","35px");
	$(".searchable-select").css("min-width","40px");
	ajaxList(1);
});
var currentPage=1;
function ajaxList(page) {
	currentPage=page;
	var materialId =$('#materialId').val();
	var createDate1 =$('#createDate1').val();
	var createDate2 =$('#createDate2').val();
	var createDate1 = $("#createDate1").val();
	var createDate2 = $("#createDate2").val();
	var isComfirm = $("#isComfirm").val();
	var countRs = ajaxCount();
	if(countRs.totalPage<page){
		page = countRs.totalPage;
	}
	showLoading('${pageContext.request.contextPath}/static/common/loading.gif');
	$.ajax({
		type : 'get',
		url : "${pageContext.request.contextPath}/admin/minlog/queryList",
		data : {
			"page":page,
			"materialId":materialId,
			"createDate1":createDate1,
			"createDate2":createDate2,
			"isComfirm":isComfirm
		},
		success : function(result) {
			hideLoading();
			var rows = result.list;//得到数据列
			var total = countRs.count;//得到数据总数
			var totalPage=countRs.totalPage;
			var html = '';
			for (var i = 0; i < rows.length; i++) {
				html += '<tr>' ;
				var materialIdVal=setNullToEmpty(rows[i].materialIdStr);
				html+='<td>'+ materialIdVal+'</td>';
				var numVal=setNullToEmpty(rows[i].minlog.num);
				html+='<td>'+ numVal+'</td>';
				var inRemarkVal=setNullToEmpty(rows[i].minlog.inRemark);
				html+='<td>'+ inRemarkVal+'</td>';
				var createDateVal=setNullToEmpty(rows[i].minlog.createDate);
				html+='<td>'+ createDateVal+'</td>';
				var isComfirmVal=setNullToEmpty(rows[i].isComfirmStr);
				html+='<td>'+isComfirmVal+'</td>';
				html+='<td>';
				html+='<a href="javascript:void(0)" onclick="del(this)" data-id="'+rows[i].minlog.id+'" class="btn btn-danger btnStyle">删除</a>';
				html+='</td>';
				html+='</tr>';
			}
			if (rows.length == 0) {
				html += '<tr><td></td><td></td><td></td><td>无数据</td><td></td><td></td></tr>';
			}
			$("#minlog_body").html(html);
			new myPagination({
				id: 'minlog_bar',
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
	var materialId =$('#materialId').val();
	var createDate1 =$('#createDate1').val();
	var createDate2 =$('#createDate2').val();
	var createDate1 = $("#createDate1").val();
	var createDate2 = $("#createDate2").val();
	var isComfirm = $("#isComfirm").val();
	$.ajax({
		type : 'get',
		url : "${pageContext.request.contextPath}/admin/minlog/queryCount",
		async: false,
		data : {
			"materialId":materialId,
			"createDate1":createDate1,
			"createDate2":createDate2,
			"isComfirm":isComfirm
		},
		success : function(result) {
			rs = result;
		}
	});
	return rs;
}
function del(e){
	if(window.confirm('你确定要删除该物料入库单吗')){
		var id = $(e).attr("data-id");
		$.ajax({
			type : 'get',
			url : "${pageContext.request.contextPath}/admin/minlog/del",
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

