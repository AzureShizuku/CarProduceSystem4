<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>


<meta charset="UTF-8">

<meta content="" name="keywords">

<meta content="" name="description">
<meta name="viewport" content="width=device-width"/>

<title>汽车生产系统-登录</title>





<!-- H5	 -->
<!--[if lt IE 9]>
<script src="${pageContext.request.contextPath}/static/login/js/html5shiv.min.js"></script>
<script src="${pageContext.request.contextPath}/static/login/js/respond.min.js"></script>
<![endif]-->

<link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/static/login/css/dmaku2.css?t=500" />

</head>

<body   style="background:transparent;background-image:url(${pageContext.request.contextPath}/static/login_bg.jpg);background-size:100% 100%">

<header id="header">
	<h1 style="color:white;text-align:center">汽车生产系统</h1>
	<i class="icons">beta</i>
</header><!-- /header -->
<!-- 页面主体START -->
<section id="main">
	<h1>汽车生产系统-登录</h1>
	<div>
		<div class="clearfix" style="margin-top:10px;min-height:50px">
			登录名/员工号<input id="name" name="name" type="text" placeholder="请输入登录名/员工号"  class="">
		</div>
		<div class="clearfix" style="margin-top:10px;min-height:50px">
			密码<input id="password" name="password" type="password" placeholder="请输入密码"  class="">
		</div>
		<div class="clearfix" style="margin-top:10px;min-height:80px">
			验证码
			<input id="imgCode" name="imgCode" type="text"  style="margin: 0px 0;">
			<img id="codeImg1"  name="codeImg"  alt="点击更换" title="点击更换" style="float:right;height:30px;width:100px">
			</div>
			<div class="clearfix" style="margin-top:10px;min-height:50px">
				登录角色
				<input name="loginType" type="radio" value="1" id="loginType1" style="margin-left:10px;"/><label for="loginType1"> 管理员</label>
				<input name="loginType" type="radio" value="2" id="loginType2" style="margin-left:10px;"/><label for="loginType2"> 员工</label>
				<input name="loginType" type="radio" value="3" id="loginType3" style="margin-left:10px;"/><label for="loginType3"> 供应商</label>
			</div>
			<div class="clearfix">
			</div>
			<div class="clearfix btn_login" >
				<input  type="button"  onclick="submitForm()" value="登录">
			</div>
			<div class="clearfix goregister">
			</div>
		</div>
	</section>
	<script type="text/javascript" src="${pageContext.request.contextPath}/static/common/jquery-1.11.1.min.js"></script>
	<script type="text/javascript" src="${pageContext.request.contextPath}/static/common/utils/listutils.js?v=26573"></script>
	
<script>
$(document).ready(function(e) {
	changeCode();
	$("#codeImg1").bind("click",changeCode);
});
function genTimestamp(){
	var time = new Date();
	return time.getTime();
}
function changeCode(){
	$("img[name='codeImg']").attr("src","${pageContext.request.contextPath}/validCode/code?t="+genTimestamp());
}
function submitForm(){
	$.ajax({
		type: 'post',
		url: '${pageContext.request.contextPath}/login/sysSubmit',
		data: {
			'imgCode':$('#imgCode').val(),
			'name':$("#name").val(),
			'password':$("#password").val(),
			'loginType':getCheckBoxVal('loginType')
		},
		success: function(result) {
			if(result.code==1){
				var lt = getCheckBoxVal('loginType');
				if(lt=='1'){
					window.location.href="${pageContext.request.contextPath}/admin/index";
				}
				if(lt=='2'){
					window.location.href="${pageContext.request.contextPath}/staff/index";
				}
				if(lt=='3'){
					window.location.href="${pageContext.request.contextPath}/provider/index";
				}
				}else{
				alert(result.msg);
			}
		}
	});
}
$(function(){
})

</script>

</body>
</html>

