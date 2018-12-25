<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%@ taglib prefix="s"  uri="/struts-tags" %>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>login</title>
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->
	<style type="text/css">
	.loginBox{width:458px; border:#999 solid 1px; margin:10px auto; position:relative;}
	.login_cont{padding:15px 76px;}
	.login_input{border:#999 solid 1px; height:32px; line-height:32px\9; text-indent:5px; width:100%;}
	.login_btn{width:309px; height:36px; border: solid 5px;}
	</style>
  </head>
  
  <body>
<form action="employee_login.action" method="post">
<div class="loginBox">
<s:actionerror/>
	<div class="login_cont">
		<ul class="login">
			<li style="list-style-type: none;">用户名</li>
			<li style="list-style-type: none;"><input name="username" type="text" class="login_input"></li>
			<li style="list-style-type: none;">密码</li>
			<li style="list-style-type: none;"> <input name="password" type="password" class="login_input"></li>		
			<li style="list-style-type: none;"><input type="submit" value="登陆" class="login_btn"></li>
		</ul>
	</div>
</div>
</form>
  </body>
</html>
