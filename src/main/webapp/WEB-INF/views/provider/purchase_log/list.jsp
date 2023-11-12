<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>

<head>

<meta charset="utf-8">
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<meta name="renderer" content="webkit">

<title>订货单</title>
<meta name="keywords" content="订货单">
<meta name="description" content="订货单">

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
		<h2>订货单</h2>
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
							<label>订货单编号</label>
							<input type="text" class="form-control" value="" placeholder="请输入订货单编号" id="no" >
						</div>
						<div class="col-lg-2">
							<label>物料名</label>
							<input type="text" class="form-control" value="" placeholder="请输入物料名" id="name" >
						</div>
						<div class="col-lg-2">
							<label>审核状态</label>
							<select  id="checkStatus"  class="form-control">
								<option value="">全部</option>
								<c:forEach items="${needStatusList}" var="item">
									<option value="${item.id}">${item.name}</option>
								</c:forEach>
							</select>
						</div>
						<div class="col-lg-2">
							<label>订货单类型</label>
							<select  id="purchaseStatus"  class="form-control">
								<option value="">全部</option>
								<c:forEach items="${purchaseStatusList}" var="item">
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
									<th>订货单编号</th>
									<th>物料名</th>
									<th>规格</th>
									<th>单位</th>
									<th>技术标准</th>
									<th>数量</th>
									<th>采购价格</th>
									<th>总金额</th>
									<th>交付日期</th>
									<th>审核状态</th>
									<th>审核备注</th>
									<th>供应商ID</th>
									<th>创建日期</th>
									<th>订货单类型</th>
									<th style="width:200px;">操作</th>
								</tr>
							</thead>
							<tbody  id="purchase_log_body">
							</tbody>
						</table>
						<div id="purchase_log_bar" class="pagination" style="margin-top:20px;"></div>
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
<script type="text/javascript" src="${pageContext.request.contextPath}/static/common/utils/listutils.js?v=7395"></script>

<script>
$(function(){
	ajaxList(1);
});
var currentPage=1;
function ajaxList(page) {
	currentPage=page;
	var no = $("#no").val();
	var name = $("#name").val();
	var checkStatus = $("#checkStatus").val();
	var purchaseStatus = $("#purchaseStatus").val();
	var countRs = ajaxCount();
	if(countRs.totalPage<page){
		page = countRs.totalPage;
	}
	showLoading('${pageContext.request.contextPath}/static/common/loading.gif');
	$.ajax({
		type : 'get',
		url : "${pageContext.request.contextPath}/provider/purchase_log/queryList",
		data : {
			"page":page,
			"no":no,
			"name":name,
			"checkStatus":checkStatus,
			"purchaseStatus":purchaseStatus
		},
		success : function(result) {
			hideLoading();
			var rows = result.list;//得到数据列
			var total = countRs.count;//得到数据总数
			var totalPage=countRs.totalPage;
			var html = '';
			for (var i = 0; i < rows.length; i++) {
				html += '<tr>' ;
				var noVal=setNullToEmpty(rows[i].purchaseLog.no);
				html+='<td>'+ noVal+'</td>';
				var nameVal=setNullToEmpty(rows[i].purchaseLog.name);
				html+='<td>'+ nameVal+'</td>';
				var ggVal=setNullToEmpty(rows[i].purchaseLog.gg);
				html+='<td>'+ ggVal+'</td>';
				var dwVal=setNullToEmpty(rows[i].purchaseLog.dw);
				html+='<td>'+ dwVal+'</td>';
				var jsbzVal=setNullToEmpty(rows[i].purchaseLog.jsbz);
				html+='<td>'+ jsbzVal+'</td>';
				var slVal=setNullToEmpty(rows[i].purchaseLog.sl);
				html+='<td>'+ slVal+'</td>';
				var priceVal=setNullToEmpty(rows[i].purchaseLog.price);
				html+='<td>￥'+priceVal+'</td>';
				var totalAmountVal=setNullToEmpty(rows[i].purchaseLog.totalAmount);
				html+='<td>'+ totalAmountVal+'</td>';
				var jfDateVal=setNullToEmpty(rows[i].purchaseLog.jfDate);
				html+='<td>'+ jfDateVal+'</td>';
				var checkStatusVal=setNullToEmpty(rows[i].checkStatusStr);
				html+='<td>'+checkStatusVal+'</td>';
				var checkRemarkVal=setNullToEmpty(rows[i].purchaseLog.checkRemark);
				html+='<td>'+ checkRemarkVal+'</td>';
				var providerIdVal=setNullToEmpty(rows[i].providerIdStr);
				html+='<td>'+ providerIdVal+'</td>';
				var createDateVal=setNullToEmpty(rows[i].purchaseLog.createDate);
				html+='<td>'+ createDateVal+'</td>';
				var purchaseStatusVal=setNullToEmpty(rows[i].purchaseStatusStr);
				html+='<td>'+purchaseStatusVal+'</td>';
				html+='<td>';
				if(rows[i].purchaseLog.checkStatus=='1'){
					html+='<a href="${pageContext.request.contextPath}/provider/purchase_log/jssq?id='+rows[i].purchaseLog.id+'" class="btn btn-primary btnStyle">接受申请</a>';
				}
				if(rows[i].purchaseLog.checkStatus=='1'){
					html+='<a href="${pageContext.request.contextPath}/provider/purchase_log/jjsq?id='+rows[i].purchaseLog.id+'" class="btn btn-danger btnStyle">拒绝申请</a>';
				}
				html+='</td>';
				html+='</tr>';
			}
			if (rows.length == 0) {
				html += '<tr><td></td><td></td><td></td><td></td><td></td><td></td><td></td><td>无数据</td><td></td><td></td><td></td><td></td><td></td><td></td><td></td></tr>';
			}
			$("#purchase_log_body").html(html);
			new myPagination({
				id: 'purchase_log_bar',
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
	var no = $("#no").val();
	var name = $("#name").val();
	var checkStatus = $("#checkStatus").val();
	var purchaseStatus = $("#purchaseStatus").val();
	$.ajax({
		type : 'get',
		url : "${pageContext.request.contextPath}/provider/purchase_log/queryCount",
		async: false,
		data : {
			"no":no,
			"name":name,
			"checkStatus":checkStatus,
			"purchaseStatus":purchaseStatus
		},
		success : function(result) {
			rs = result;
		}
	});
	return rs;
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

