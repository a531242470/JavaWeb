<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head></head>
<body>
<%if(session.getAttribute("rEmployee")==null||"".equals(session.getAttribute("rEmployee"))){%><jsp:forward page="/login.jsp"></jsp:forward><%} %>
<table border="0" width="600px">
<tr>

<td align="center" style="font-size:24px; color:#666"> 部门添加</td>
</tr>
<tr>
<td align="right" > 
<a href="${pageContext.request.contextPath}/department_findAll.action">退回 </a>
</td>
</tr>

</table>
<br/>
 <br>
 <form action="${pageContext.request.contextPath}/department_save.action" method="get" >
<table style="font-size::16px">
<tr>
  <td>部门名称：</td>
  <td><input type="text" name="dname" /></td>
</tr>
<tr>
  <td>部门介绍：</td>
  <td></td>
</tr>
<tr>
  <td width="10%"></td>
  <td>
     <textarea name="ddesc" cols="50" rows="5"></textarea>
  </td>
  </tr>
  <tr>
  <td>
  	<input type="submit" value="保存" >
  </td>
</tr>
</table>
</form>
</body>
</html> 
