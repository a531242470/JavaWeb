<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%@taglib prefix="s" uri="/struts-tags" %>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>My JSP 'login.jsp' starting page</title>
    
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->
<style type="text/css">


body {
padding:0;
margin:0;
	background-image: url(drawable/bg.jpg);
	background-repeat: no-repeat;
	
}
#div_login{
position:absolute;
margin-left:40%;

	text-align: center;
	margin-top: 20%;
	width: 200px;
	height: 100px;
}

</style>
  </head>

  
  <body>
  <div id="div_login">
    <form action="user/User_login.action" method="post">
    	用户名:<input type="text" name="username"><br>
    	密码 :<input type="password" name="userpassword"><br>
    	
    	<input type="submit" value="提交"><br>
    	
    <s:fielderror></s:fielderror>
    </form>
   </div>
  </body>
</html>
