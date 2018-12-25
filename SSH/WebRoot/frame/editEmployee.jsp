<%@page import="com.loo.employee.domain.Employee"%>
<%@ taglib prefix="s" uri="/struts-tags" %>
<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>My JSP 'editEmployee.jsp' starting page</title>
    
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
<td align="center" style="font-size:24px; color:#666"> 员工编辑</td>
</tr>
<tr>
<td align="right" > 
<a href="${pageContext.request.contextPath}/employee_findAll.action">退回</a>
</td>
</tr>
</table>
<br/>
<form action="${pageContext.request.contextPath}/employee_updata.action" method="post">

<table border='0' cellpadding="0"  cellspacing="10">
<%
Employee oldEmployee=(Employee)session.getAttribute("oldEmployee");

 %>
<tr>
<td>编号</td>
<td><input type="text" name="eid" value="<%=oldEmployee.getEid()%>" readonly="readonly"></td>
<td>姓名：</td>
<td><input value="<%=oldEmployee.getEname() %>" name="ename" type="text" /></td>
<td>性别：</td>

<%if(oldEmployee.getSex().equals("男")){ %>
<td>男<input type="radio" name="sex" value="男" checked="checked"> 女<input type="radio" name="sex" value="女"></td>
<%}else{ %>
<td>男<input type="radio" name="sex" value="男"> 女<input type="radio" name="sex" value="女"  checked="checked"></td>
<%} %>
</tr>
<tr>

<td>用户名：</td>
<td><input value="<%=oldEmployee.getUsername() %>" name="username" type="text" /></td>
<td>密码：</td>
<td><input value="<%=oldEmployee.getPassword() %>" name="password" type="password"></td>
</tr>


<tr>
<td>出生日期：</td>
<td><input value="<%=oldEmployee.getBirthday() %>" name="birthday" type="text" /></td>
<td>入职时间：</td>
<td><input value="<%=oldEmployee.getJoinDate() %>" name="joinDate" type="text" /></td>
</tr>

<tr>
<td>所属部门：</td>
<td>
<td>


<s:select list="list" name="department.did" listKey="did" listValue="dname" headerKey="" headerValue="---"></s:select>

</td>
</td>
<td>编号：</td>
<td><input value="<%=oldEmployee.getEno() %>" name="eno" type="text" /></td>
</tr>
</table>
<input type="submit" value="确定">
</form>
  </body>
</html>
