<%@page import="entity.Users"%>
<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>My JSP 'gate.jsp' starting page</title>
    
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
      <%
      Users user=(Users)session.getAttribute("user");
      
      
      if(user==null){
  RequestDispatcher rd = request.getRequestDispatcher("/login.jsp"); 
 rd.forward(request,response);};
 
 if(user.getType().equals("A")){
 
 	%>
 	<a href="<%=path %>/index.jsp" >进入本部门员工评价系统</a>
 	<%
 
 }
 
 
 %>
 <a href="<%=path %>/otherDep.jsp">进入跨部门员工评价系统</a>
 
      <a href="users/User_logout.action">退出登录</a>
  </body>
</html>
