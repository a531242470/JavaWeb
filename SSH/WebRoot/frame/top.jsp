<%@page import="com.loo.employee.domain.Employee"%>
<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>My JSP 'top.jsp' starting page</title>
    
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->
	<style type="text/css">
		.div1{ margin-top:50px; margin-left:600px; font-size:20px; color:black}
	</style>

  </head>
  
  <body>
  <%if(session.getAttribute("rEmployee")==null||"".equals(session.getAttribute("rEmployee"))){%><jsp:forward page="/login.jsp"></jsp:forward><%} %>
    <div class="div1">
     <%Employee employee=(Employee)session.getAttribute("rEmployee"); %>
		 欢迎您：<%=employee.getEname()%>    
	</div>
  </body>
</html>