<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>

<head>

<meta charset="utf-8">
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<meta name="renderer" content="webkit">

<title>首页</title>
<meta name="keywords" content="首页">
<meta name="description" content="首页">

<link href="${pageContext.request.contextPath}/static/admin/css/bootstrap.min.css?v=3.4.0" rel="stylesheet">
<link href="${pageContext.request.contextPath}/static/admin/font-awesome/css/font-awesome.css?v=4.3.0" rel="stylesheet">

<!-- Morris -->
<link href="${pageContext.request.contextPath}/static/admin/css/plugins/morris/morris-0.4.3.min.css?t=322" rel="stylesheet">

<!-- Gritter -->
<link href="${pageContext.request.contextPath}/static/admin/js/plugins/gritter/jquery.gritter.css?t=322" rel="stylesheet">

<link href="${pageContext.request.contextPath}/static/admin/css/animate.css?t=322" rel="stylesheet">
<link href="${pageContext.request.contextPath}/static/admin/css/style.css?v=2.2.0" rel="stylesheet">


<style type="text/css">
.btnStyle{
margin-left:8px;
margin-top:8px;
margin-bottom:8px;
}
.loadingModel {
position: absolute;
top: 0;
left: 0;
background-color: rgba(9, 9, 9, 0.63);
width: 100%;
height: 100%;
z-index: 1000;
}


.loading-content {
width: 50%;
text-align: center;
background: #ffffff;
border-radius: 6px;
line-height: 30px;
z-index: 10001;
}
</style>

</head>
<body  style="background-color:#f3f3f4">

<div class="row" style="background-color:white;padding:20px;">
	<div class="col-lg-3">
		<div class="widget navy-bg p-lg text-center">
			<div class="m-b-md">
				<h1 class="m-xs">${qlData}</h1>
				<h3 class="font-bold no-margins">
					库存台账数
				</h3>
			</div>
		</div>
	</div>
	<div class="col-lg-3">
		<div class="widget navy-bg p-lg text-center">
			<div class="m-b-md">
				<h1 class="m-xs">${ql1Data}</h1>
				<h3 class="font-bold no-margins">
					订货支出
				</h3>
			</div>
		</div>
	</div>
	<div class="col-lg-3">
		<div class="widget navy-bg p-lg text-center">
			<div class="m-b-md">
				<h1 class="m-xs">${ql2Data}</h1>
				<h3 class="font-bold no-margins">
					销售收入
				</h3>
			</div>
		</div>
	</div>
	<div class="col-lg-3">
		<div class="widget navy-bg p-lg text-center">
			<div class="m-b-md">
				<h1 class="m-xs">${ql3Data}</h1>
				<h3 class="font-bold no-margins">
					供应商数
				</h3>
			</div>
		</div>
	</div>
</div>
</div>
<script type="text/javascript" src="${pageContext.request.contextPath}/static/common/jquery-1.11.1.min.js"></script>

</body>
</html>

