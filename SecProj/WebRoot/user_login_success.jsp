
<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>My JSP 'user_login_success.jsp' starting page</title>
   
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->

  </head>
  
  <body>
  <%if(session.getAttribute("loginUserName")==null||"".equals(session.getAttribute("loginUserName"))){
  %>请先<a href="login.jsp">登录</a>你的账号!<%
  }else{ %>
  
    SUCCESS!欢迎<%=session.getAttribute("loginUserName") %>
    <br><a href="user/User_logout.action">退出登录</a>
    <br><a href="student/Student_query.action">查询学生信息</a>
      
      
      <%} %>
      
      </body>
</html>
