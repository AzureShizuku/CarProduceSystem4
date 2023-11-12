<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>

<head>

<meta charset="utf-8">
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<meta name="renderer" content="webkit">

<title>新增-订货单</title>
<meta name="keywords" content="新增-订货单">
<meta name="description" content="新增-订货单">

<link href="${pageContext.request.contextPath}/static/admin/css/bootstrap.min.css?v=3.4.0" rel="stylesheet">
<link href="${pageContext.request.contextPath}/static/admin/font-awesome/css/font-awesome.css?v=4.3.0" rel="stylesheet">

<!-- Morris -->
<link href="${pageContext.request.contextPath}/static/admin/css/plugins/morris/morris-0.4.3.min.css?t=322" rel="stylesheet">

<!-- Gritter -->
<link href="${pageContext.request.contextPath}/static/admin/js/plugins/gritter/jquery.gritter.css?t=322" rel="stylesheet">

<link href="${pageContext.request.contextPath}/static/admin/css/animate.css?t=322" rel="stylesheet">
<link href="${pageContext.request.contextPath}/static/admin/css/style.css?v=2.2.0" rel="stylesheet">
<script type="text/javascript" src="${pageContext.request.contextPath}/static/datetime/4.8/skin/WdatePicker.css"></script>
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
		<h2>新增-订货单 </h2>
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
								<label>物料名<span style="color:red">(*必填)</span></label>
								<input type="text" value="" placeholder="请输入物料名" id="name" class="form-control">
							</div>
							<div class="form-group" id="ggParentContent">
								<label>规格<span style="color:red">(*必填)</span></label>
								<input type="text" value="" placeholder="请输入规格" id="gg" class="form-control">
							</div>
							<div class="form-group" id="dwParentContent">
								<label>单位<span style="color:red">(*必填)</span></label>
								<input type="text" value="" placeholder="请输入单位" id="dw" class="form-control">
							</div>
							<div class="form-group" id="jsbzParentContent">
								<label>技术标准<span style="color:red">(*必填)</span></label>
								<input type="text" value="" placeholder="请输入技术标准" id="jsbz" class="form-control">
							</div>
							<div class="form-group" id="slParentContent">
								<label>数量<span style="color:red">(*必填)</span></label>
								<input type="text" value="" placeholder="请输入数量(请输入数字)" id="sl" class="form-control">
							</div>
							<div class="form-group" id="priceParentContent">
								<label>采购价格<span style="color:red">(*必填)</span></label>
								<input type="text" value="" placeholder="请输入采购价格(请输入数字)" id="price" class="form-control">
							</div>
							<div class="form-group" id="totalAmountParentContent">
								<label>总金额<span style="color:red">(*必填)</span></label>
								<input type="text" value="" placeholder="请输入总金额(请输入数字)" id="totalAmount" class="form-control">
							</div>
							<div class="form-group" id="jfDateParentContent">
								<label>交付日期<span style="color:red">(*必填)</span></label>
								<input type="text" class="form-control Wdate"  readonly="readonly"  value=""  onFocus="WdatePicker({startDate: '%y-%M-%d' ,dateFmt:'yyyy-MM-dd',alwaysUseStartDate: true })"  placeholder="请输入交付日期" id="jfDate">
							</div>
							<div class="form-group" id="providerIdParentContent">
								<label>供应商ID<span style="color:red">(*必填)</span></label>
								<select  id="providerId"   >
									<c:forEach items="${providerList}" var="item">
										<option value="${item.id}">${item.name}</option>
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
<script type="text/javascript" src="${pageContext.request.contextPath}/static/datetime/4.8/WdatePicker.js"></script>
<script type="text/javascript" src="${pageContext.request.contextPath}/static/selectsearch/jquery.searchableSelect.js"></script>
<script type="text/javascript" src="${pageContext.request.contextPath}/static/common/utils/listutils.js?v=7844"></script>

<script>
$(function(){
	$('#providerId').next().remove();
	$('#providerId').searchableSelect();
	$(".searchable-select").css("width","100%");
	$(".searchable-select").css("height","35px");
	$(".searchable-select-holder").css("min-height","20px");
	$(".searchable-select-holder").css("height","35px");
	$(".searchable-select").css("min-width","40px");
})
function submitData(){
	var name= $('#name').val();
	var gg= $('#gg').val();
	var dw= $('#dw').val();
	var jsbz= $('#jsbz').val();
	var sl= $('#sl').val();
	var price= $('#price').val();
	var totalAmount= $('#totalAmount').val();
	var jfDate= $('#jfDate').val();
	var providerId=$('#providerId').val()
	var providerId= $('#providerId').val();
	if(sl!=''){
		if(isIntNum(sl)==false){
			alert("数量必须填入整数");
			return;
		}
	}
	if(price!=''){
		if(isNum(price)==false){
			alert("采购价格必须填入数字");
			return;
		}
	}
	if(totalAmount!=''){
		if(isNum(totalAmount)==false){
			alert("总金额必须填入数字");
			return;
		}
	}
	$.ajax({
		type: 'post',
		url: '${pageContext.request.contextPath}/staff/purchase_log/add_submit',
		data:{
			"name":name,
			"gg":gg,
			"dw":dw,
			"jsbz":jsbz,
			"sl":sl,
			"price":price,
			"totalAmount":totalAmount,
			"jfDate":jfDate,
			"providerId":providerId
		},
		success: function(result) {
			if(result.code == 0){
				alert(result.msg);
				}else{
				alert(result.msg);
				window.location.href="${pageContext.request.contextPath}/staff/purchase_log";
			}
		}
	});
}

</script>

</body>

</html>

