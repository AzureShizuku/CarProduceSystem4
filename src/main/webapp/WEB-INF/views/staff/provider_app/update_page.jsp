<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>

<head>

<meta charset="utf-8">
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<meta name="renderer" content="webkit">

<title>修改-供应商申请</title>
<meta name="keywords" content="修改-供应商申请">
<meta name="description" content="修改-供应商申请">

<link href="${pageContext.request.contextPath}/static/admin/css/bootstrap.min.css?v=3.4.0" rel="stylesheet">
<link href="${pageContext.request.contextPath}/static/admin/font-awesome/css/font-awesome.css?v=4.3.0" rel="stylesheet">

<!-- Morris -->
<link href="${pageContext.request.contextPath}/static/admin/css/plugins/morris/morris-0.4.3.min.css?t=322" rel="stylesheet">

<!-- Gritter -->
<link href="${pageContext.request.contextPath}/static/admin/js/plugins/gritter/jquery.gritter.css?t=322" rel="stylesheet">

<link href="${pageContext.request.contextPath}/static/admin/css/animate.css?t=322" rel="stylesheet">
<link href="${pageContext.request.contextPath}/static/admin/css/style.css?v=2.2.0" rel="stylesheet">
<link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/static/imgupload/css/dropzone.min.css">

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
		<h2>修改-供应商申请 </h2>
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
							<div class="form-group" id="nameParentContent">
								<label>厂家名<span style="color:red">(*必填)</span></label>
								<input type="text" value="${data.name}" placeholder="请输入厂家名" id="name" class="form-control">
							</div>
							<div class="form-group" id="contactNameParentContent">
								<label>联系人<span style="color:red">(*必填)</span></label>
								<input type="text" value="${data.contactName}" placeholder="请输入联系人" id="contactName" class="form-control">
							</div>
							<div class="form-group" id="celcontact_ParentContent">
								<label>联系电话<span style="color:red">(*必填)</span></label>
								<input type="text" value="${data.celcontact_}" placeholder="请输入联系电话" id="celcontact_" class="form-control">
							</div>
							<div class="form-group" id="addressParentContent">
								<label>地址<span style="color:red">(*必填)</span></label>
								<input type="text" value="${data.address}" placeholder="请输入地址" id="address" class="form-control">
							</div>
							<div class="form-group" id="gmParentContent">
								<label>厂家规模<span style="color:red">(*必填)</span></label>
								<input type="text" value="${data.gm}" placeholder="请输入厂家规模" id="gm" class="form-control">
							</div>
							<div class="form-group" id="proNamesParentContent">
								<label>生产产品<span style="color:red">(*必填)</span></label>
								<input type="text" value="${data.proNames}" placeholder="请输入生产产品" id="proNames" class="form-control">
							</div>
							<div class="form-group" id="proDetailParentContent">
								<label>产品报价单<span style="color:red">(*必填)</span></label>
								<div id="proDetail" class="dropzone" data-id="proDetail" max-num="1" file-type="4" max-size="1000" init-val="${data.proDetail}"></div>
							</div>
							<div class="form-group" id="evalTypeParentContent">
								<label>评价等级<span style="color:red">(*必填)</span></label>
								<select id="evalType"  class="form-control">
									<c:forEach items="${evalTypeList}" var="item">
										<c:if test="${item.id==data.evalType}">
											<option value="${item.id}" selected>${item.name}</option>
										</c:if>
										<c:if test="${item.id!=data.evalType}">
											<option value="${item.id}">${item.name}</option>
										</c:if>
									</c:forEach>
								</select>
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
<script type="text/javascript" src="${pageContext.request.contextPath}/static/imgupload/js/dropzone.min.js"></script>
<script type="text/javascript" src="${pageContext.request.contextPath}/static/imgupload/js/imgupload.js"></script>
<script type="text/javascript" src="${pageContext.request.contextPath}/static/common/utils/listutils.js?v=5451"></script>

<script>
$(function(){
	initAllDrop();
})
function submitData(){
	var name= $('#name').val();
	var contactName= $('#contactName').val();
	var celcontact_= $('#celcontact_').val();
	var address= $('#address').val();
	var gm= $('#gm').val();
	var proNames= $('#proNames').val();
	var proDetail=getFileVal2('proDetail')
	var evalType= $('#evalType').val();
	$.ajax({
		type: 'post',
		url: '${pageContext.request.contextPath}/staff/provider_app/update_submit',
		data:{
			"id":'${data.id}',
			"name":name,
			"contactName":contactName,
			"celcontact_":celcontact_,
			"address":address,
			"gm":gm,
			"proNames":proNames,
			"proDetail":proDetail,
			"evalType":evalType
		},
		success: function(result) {
			if(result.code == 0){
				alert(result.msg);
				}else{
				alert(result.msg);
				window.location.href="${pageContext.request.contextPath}/staff/provider_app";
			}
		}
	});
}

</script>

</body>

</html>

