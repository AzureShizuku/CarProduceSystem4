<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>

<head>

<meta charset="utf-8">
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<meta name="renderer" content="webkit">

<title>修改-库存台账</title>
<meta name="keywords" content="修改-库存台账">
<meta name="description" content="修改-库存台账">

<link href="${pageContext.request.contextPath}/static/admin/css/bootstrap.min.css?v=3.4.0" rel="stylesheet">
<link href="${pageContext.request.contextPath}/static/admin/font-awesome/css/font-awesome.css?v=4.3.0" rel="stylesheet">

<!-- Morris -->
<link href="${pageContext.request.contextPath}/static/admin/css/plugins/morris/morris-0.4.3.min.css?t=322" rel="stylesheet">

<!-- Gritter -->
<link href="${pageContext.request.contextPath}/static/admin/js/plugins/gritter/jquery.gritter.css?t=322" rel="stylesheet">

<link href="${pageContext.request.contextPath}/static/admin/css/animate.css?t=322" rel="stylesheet">
<link href="${pageContext.request.contextPath}/static/admin/css/style.css?v=2.2.0" rel="stylesheet">

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

.dz-image>img{
width:120px;
height:120px;
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
		<h2>修改-库存台账 </h2>
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
					<div class="row"   style="width:80%;margin-left:10%">
						<div class="col-lg-6">
							<div class="form-group" id="proNoParentContent">
								<label>商品编号<span style="color:red">(*必填)</span></label>
								<input type="text" value="${data.proNo}" placeholder="请输入商品编号" id="proNo" class="form-control">
							</div>
							<div class="form-group" id="proNameParentContent">
								<label>商品名<span style="color:red">(*必填)</span></label>
								<input type="text" value="${data.proName}" placeholder="请输入商品名" id="proName" class="form-control">
							</div>
							<div class="form-group" id="ggParentContent">
								<label>规格<span style="color:red">(*必填)</span></label>
								<input type="text" value="${data.gg}" placeholder="请输入规格" id="gg" class="form-control">
							</div>
							<div class="form-group" id="dwParentContent">
								<label>单位<span style="color:red">(*必填)</span></label>
								<input type="text" value="${data.dw}" placeholder="请输入单位" id="dw" class="form-control">
							</div>
							<div class="form-group" id="priceParentContent">
								<label>单价<span style="color:red">(*必填)</span></label>
								<input type="text" value="${data.price}" placeholder="请输入单价(请输入数字)" id="price" class="form-control">
							</div>
							<div class="form-group" id="numParentContent">
								<label>数量<span style="color:red">(*必填)</span></label>
								<input type="text" value="${data.num}" placeholder="请输入数量(请输入数字)" id="num" class="form-control">
							</div>
							<div class="form-group">
								<button type="button" onclick="submitData();" class="btn btn-primary">提交</button>
								<button type="button"   onclick="javascript:history.back(-1);" class="btn btn-light">返回</button>
							</div>
						</div>
					</div>
				</div>
			</div>
		</div>
	</div>
</div>
<!-- Mainly scripts -->
<script src="${pageContext.request.contextPath}/static/admin/js/jquery-2.1.1.min.js?t=322"></script>
<script src="${pageContext.request.contextPath}/static/admin/js/bootstrap.min.js?v=3.4.0"></script>
<script type="text/javascript" src="${pageContext.request.contextPath}/static/common/utils/listutils.js?v=7497"></script>

<script>
$(function(){
})
function submitData(){
	var proNo= $('#proNo').val();
	var proName= $('#proName').val();
	var gg= $('#gg').val();
	var dw= $('#dw').val();
	var price= $('#price').val();
	var num= $('#num').val();
	if(price!=''){
		if(isNum(price)==false){
			alert("单价必须填入数字");
			return;
		}
	}
	if(num!=''){
		if(isIntNum(num)==false){
			alert("数量必须填入整数");
			return;
		}
	}
	$.ajax({
		type: 'post',
		url: '${pageContext.request.contextPath}/staff/stock_msg/update1_submit',
		data:{
			"id":'${data.id}',
			"proNo":proNo,
			"proName":proName,
			"gg":gg,
			"dw":dw,
			"price":price,
			"num":num
		},
		success: function(result) {
			if(result.code == 0){
				alert(result.msg);
				}else{
				alert(result.msg);
				window.location.href="${pageContext.request.contextPath}/staff/stock_msg";
			}
		}
	});
}

</script>

</body>

</html>

