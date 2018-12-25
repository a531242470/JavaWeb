<%@page import="com.loo.employee.domain.Department"%>
<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%@ taglib prefix="s" uri="/struts-tags" %>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>My JSP 'addEmployee.jsp' starting page</title>
    
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
  <%if(session.getAttribute("rEmployee")==null||"".equals(session.getAttribute("rEmployee"))){%><jsp:forward page="/login.jsp"></jsp:forward><%} %>
  <table border="0" width="600px">
<tr>
<td align="center" style="font-size:24px; color:#666"> 员工添加</td>
</tr>
<tr>
<td align="right" > 
<a href="${pageContext.request.contextPath}/employee_findAll.action">退回</a>
</td>
</tr>
</table>
<br/>
<form action="${pageContext.request.contextPath}/employee_save.action" method="post">

<table border='0' cellpadding="0"  cellspacing="10">

<tr>

<td>姓名：</td>
<td><input name="ename" type="text" /></td>
<td>性别：</td>
<td>男<input type="radio" name="sex" value="男" checked="checked"> 女<input type="radio" name="sex" value="女"></td>
</tr>
<tr>

<td>用户名：</td>
<td><input name="username" type="text" /></td>
<td>密码：</td>
<td><input name="password" type="password"></td>
</tr>


<tr>
<td>出生日期：</td>
<td><input name="birthday" type="text" /></td>
<td>入职时间：</td>
<td><input name="joinDate" type="text" /></td>
</tr>

<tr>
<td>所属部门：</td>
<td>
<td>


<s:select list="list" name="department.did" listKey="did" listValue="dname" headerKey="" headerValue="---"></s:select>

</td>
</td>
<td>编号：</td>
<td><input name="eno" type="text" /></td>
</tr>
</table>
<input type="submit" value="确定">
</form>
  </body>
</html>
