<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>

<head>

<meta charset="utf-8">
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<meta name="renderer" content="webkit">

<title>修改-配送单</title>
<meta name="keywords" content="修改-配送单">
<meta name="description" content="修改-配送单">

<link href="${pageContext.request.contextPath}/static/admin/css/bootstrap.min.css?v=3.4.0" rel="stylesheet">
<link href="${pageContext.request.contextPath}/static/admin/font-awesome/css/font-awesome.css?v=4.3.0" rel="stylesheet">

<!-- Morris -->
<link href="${pageContext.request.contextPath}/static/admin/css/plugins/morris/morris-0.4.3.min.css?t=322" rel="stylesheet">

<!-- Gritter -->
<link href="${pageContext.request.contextPath}/static/admin/js/plugins/gritter/jquery.gritter.css?t=322" rel="stylesheet">

<link href="${pageContext.request.contextPath}/static/admin/css/animate.css?t=322" rel="stylesheet">
<link href="${pageContext.request.contextPath}/static/admin/css/style.css?v=2.2.0" rel="stylesheet">
<script type="text/javascript" src="${pageContext.request.contextPath}/static/datetime/4.8/skin/WdatePicker.css"></script>
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
		<h2>修改-配送单 </h2>
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
							<div class="form-group" id="titleParentContent">
								<label>标题<span style="color:red">(*必填)</span></label>
								<input type="text" value="${data.title}" placeholder="请输入标题" id="title" class="form-control">
							</div>
							<div class="form-group" id="psIntroParentContent">
								<label>配送说明<span style="color:red">(*必填)</span></label>
								<input type="text" value="${data.psIntro}" placeholder="请输入配送说明" id="psIntro" class="form-control">
							</div>
							<div class="form-group" id="addressParentContent">
								<label>配送地址<span style="color:red">(*必填)</span></label>
								<input type="text" value="${data.address}" placeholder="请输入配送地址" id="address" class="form-control">
							</div>
							<div class="form-group" id="contactNameParentContent">
								<label>联系人<span style="color:red">(*必填)</span></label>
								<input type="text" value="${data.contactName}" placeholder="请输入联系人" id="contactName" class="form-control">
							</div>
							<div class="form-group" id="contactCelParentContent">
								<label>联系电话<span style="color:red">(*必填)</span></label>
								<input type="text" value="${data.contactCel}" placeholder="请输入联系电话" id="contactCel" class="form-control">
							</div>
							<div class="form-group" id="driverNameParentContent">
								<label>司机<span style="color:red">(*必填)</span></label>
								<input type="text" value="${data.driverName}" placeholder="请输入司机" id="driverName" class="form-control">
							</div>
							<div class="form-group" id="driverCelParentContent">
								<label>副驾驶<span style="color:red">(*必填)</span></label>
								<input type="text" value="${data.driverCel}" placeholder="请输入副驾驶" id="driverCel" class="form-control">
							</div>
							<div class="form-group" id="driverName2ParentContent">
								<label>司机电话<span style="color:red">(*必填)</span></label>
								<input type="text" value="${data.driverName2}" placeholder="请输入司机电话" id="driverName2" class="form-control">
							</div>
							<div class="form-group" id="driverCel2ParentContent">
								<label>副驾驶电话<span style="color:red">(*必填)</span></label>
								<input type="text" value="${data.driverCel2}" placeholder="请输入副驾驶电话" id="driverCel2" class="form-control">
							</div>
							<div class="form-group" id="psDetailParentContent">
								<label>配送单详情<span style="color:red">(*必填)</span></label>
								<div id="psDetail" class="dropzone" data-id="psDetail" max-num="1" file-type="4" max-size="1000" init-val="${data.psDetail}"></div>
							</div>
							<div class="form-group" id="totalAmountParentContent">
								<label>价值总额<span style="color:red">(*必填)</span></label>
								<input type="text" value="${data.totalAmount}" placeholder="请输入价值总额" id="totalAmount" class="form-control">
							</div>
							<div class="form-group" id="psDateParentContent">
								<label>配送日期<span style="color:red">(*必填)</span></label>
								<input type="text" class="form-control Wdate"  readonly="readonly"  value="${data.psDate}"  onFocus="WdatePicker({startDate: '%y-%M-%d' ,dateFmt:'yyyy-MM-dd',alwaysUseStartDate: true })"  placeholder="请输入配送日期" id="psDate">
							</div>
							<div class="form-group" id="remarkParentContent">
								<label>备注<span style="color:red">(*必填)</span></label>
								<input type="text" value="${data.remark}" placeholder="请输入备注" id="remark" class="form-control">
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
<script type="text/javascript" src="${pageContext.request.contextPath}/static/datetime/4.8/WdatePicker.js"></script>
<script type="text/javascript" src="${pageContext.request.contextPath}/static/imgupload/js/dropzone.min.js"></script>
<script type="text/javascript" src="${pageContext.request.contextPath}/static/imgupload/js/imgupload.js"></script>
<script type="text/javascript" src="${pageContext.request.contextPath}/static/common/utils/listutils.js?v=8294"></script>

<script>
$(function(){
	initAllDrop();
})
function submitData(){
	var title= $('#title').val();
	var psIntro= $('#psIntro').val();
	var address= $('#address').val();
	var contactName= $('#contactName').val();
	var contactCel= $('#contactCel').val();
	var driverName= $('#driverName').val();
	var driverCel= $('#driverCel').val();
	var driverName2= $('#driverName2').val();
	var driverCel2= $('#driverCel2').val();
	var psDetail=getFileVal2('psDetail')
	var totalAmount= $('#totalAmount').val();
	var psDate= $('#psDate').val();
	var remark= $('#remark').val();
	$.ajax({
		type: 'post',
		url: '${pageContext.request.contextPath}/admin/send_log/update_submit',
		data:{
			"id":'${data.id}',
			"title":title,
			"psIntro":psIntro,
			"address":address,
			"contactName":contactName,
			"contactCel":contactCel,
			"driverName":driverName,
			"driverCel":driverCel,
			"driverName2":driverName2,
			"driverCel2":driverCel2,
			"psDetail":psDetail,
			"totalAmount":totalAmount,
			"psDate":psDate,
			"remark":remark
		},
		success: function(result) {
			if(result.code == 0){
				alert(result.msg);
				}else{
				alert(result.msg);
				window.location.href="${pageContext.request.contextPath}/admin/send_log";
			}
		}
	});
}

</script>

</body>

</html>

