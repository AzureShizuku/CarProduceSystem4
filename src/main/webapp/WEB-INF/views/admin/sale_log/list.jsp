<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>

<head>

<meta charset="utf-8">
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<meta name="renderer" content="webkit">

<title>销售订单</title>
<meta name="keywords" content="销售订单">
<meta name="description" content="销售订单">

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
		<h2>销售订单</h2>
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
							<label>订单编号</label>
							<input type="text" class="form-control" value="" placeholder="请输入订单编号" id="orderNo" >
						</div>
						<div class="col-lg-2">
							<label>商品编号</label>
							<input type="text" class="form-control" value="" placeholder="请输入商品编号" id="proNo" >
						</div>
						<div class="col-lg-2">
							<label>商品名</label>
							<input type="text" class="form-control" value="" placeholder="请输入商品名" id="proName" >
						</div>
						<div class="col-lg-1">
							<label style="visibility: hidden;display:block">1</label>
							<button type="button" onclick="ajaxList(1);" class="btn btn-primary">查询</button>
						</div>
					</div>
					<div class="row"  style="margin-top:5px;padding-left: 15px;">
						<a href="javascript:void(0);" onclick="export_sale()" class="btn btn-warning">批量导出</a>
					</div>
					<div class="row" style="margin-top:5px;margin-bottom:5px;padding-left: 15px;">
					</div>
					<div class="row" style="margin-top:5px;margin-bottom:5px;padding-left: 15px;"></div>
					<div class="table-responsive">
						<table class="table  table-striped table-bordered  table-hover">
							<thead>
								<tr>
									<th>订单编号</th>
									<th>商品编号</th>
									<th>商品名</th>
									<th>销售数量</th>
									<th>销售金额</th>
									<th>销售合同</th>
									<th>创建日期</th>
									<th>销售员工</th>
									<th style="width:200px;">操作</th>
								</tr>
							</thead>
							<tbody  id="sale_log_body">
							</tbody>
						</table>
						<div id="sale_log_bar" class="pagination" style="margin-top:20px;"></div>
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
<script type="text/javascript" src="${pageContext.request.contextPath}/static/common/utils/listutils.js?v=5754"></script>

<script>
$(function(){
	ajaxList(1);
});
var currentPage=1;
function ajaxList(page) {
	currentPage=page;
	var orderNo = $("#orderNo").val();
	var proNo = $("#proNo").val();
	var proName = $("#proName").val();
	var countRs = ajaxCount();
	if(countRs.totalPage<page){
		page = countRs.totalPage;
	}
	showLoading('${pageContext.request.contextPath}/static/common/loading.gif');
	$.ajax({
		type : 'get',
		url : "${pageContext.request.contextPath}/admin/sale_log/queryList",
		data : {
			"page":page,
			"orderNo":orderNo,
			"proNo":proNo,
			"proName":proName
		},
		success : function(result) {
			hideLoading();
			var rows = result.list;//得到数据列
			var total = countRs.count;//得到数据总数
			var totalPage=countRs.totalPage;
			var html = '';
			for (var i = 0; i < rows.length; i++) {
				html += '<tr>' ;
				var orderNoVal=setNullToEmpty(rows[i].saleLog.orderNo);
				html+='<td>'+ orderNoVal+'</td>';
				var proNoVal=setNullToEmpty(rows[i].saleLog.proNo);
				html+='<td>'+ proNoVal+'</td>';
				var proNameVal=setNullToEmpty(rows[i].saleLog.proName);
				html+='<td>'+ proNameVal+'</td>';
				var numVal=setNullToEmpty(rows[i].saleLog.num);
				html+='<td>'+ numVal+'</td>';
				var amountVal=setNullToEmpty(rows[i].saleLog.amount);
				html+='<td>'+ amountVal+'</td>';
				var htFileStr = rows[i].saleLog.htFile;
				if(htFileStr!=null){
					var htFileSplit = htFileStr.split(";");
					var tmp = '';
					for(var j=0;j<htFileSplit.length;j++){
						if(htFileSplit[j]!=''){
							tmp+='<div ><a  href="javascript:void(0)" file-url="'+htFileSplit[j]+'" onclick="downLoadFile(this)">点击下载销售合同</a></div>';
						}
					}
					html+='<td>'+tmp+'</td>';
					}else{
					html+='<td></td>';
				}
				var createDateVal=setNullToEmpty(rows[i].saleLog.createDate);
				html+='<td>'+ createDateVal+'</td>';
				var staffIdVal=setNullToEmpty(rows[i].staffIdStr);
				html+='<td>'+ staffIdVal+'</td>';
				html+='<td>';
				html+='<a href="javascript:void(0)" onclick="del(this)" data-id="'+rows[i].saleLog.id+'" class="btn btn-danger btnStyle">删除</a>';
				html+='</td>';
				html+='</tr>';
			}
			if (rows.length == 0) {
				html += '<tr><td></td><td></td><td></td><td></td><td>无数据</td><td></td><td></td><td></td><td></td></tr>';
			}
			$("#sale_log_body").html(html);
			new myPagination({
				id: 'sale_log_bar',
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
	var orderNo = $("#orderNo").val();
	var proNo = $("#proNo").val();
	var proName = $("#proName").val();
	$.ajax({
		type : 'get',
		url : "${pageContext.request.contextPath}/admin/sale_log/queryCount",
		async: false,
		data : {
			"orderNo":orderNo,
			"proNo":proNo,
			"proName":proName
		},
		success : function(result) {
			rs = result;
		}
	});
	return rs;
}
function del(e){
	if(window.confirm('你确定要删除该销售订单吗')){
		var id = $(e).attr("data-id");
		$.ajax({
			type : 'get',
			url : "${pageContext.request.contextPath}/admin/sale_log/del",
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
function export_sale(){
	var params = "";
	var orderNo = $("#orderNo").val();
	params+="orderNo="+orderNo+"&";
	var proNo = $("#proNo").val();
	params+="proNo="+proNo+"&";
	var proName = $("#proName").val();
	params+="proName="+proName+"&";
	var url = "${pageContext.request.contextPath}/admin/sale_log/export_sale?1=1&"+params+"";
	window.location.href=url;
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

