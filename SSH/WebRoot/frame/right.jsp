<%@ page language="java" import="java.util.*" pageEncoding="ISO-8859-1"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<html>
<head>
</head>
<body>
<%if(session.getAttribute("rEmployee")==null||"".equals(session.getAttribute("rEmployee"))){%><jsp:forward page="/login.jsp"></jsp:forward><%} %>
<div align="center">
<table border="0" width="60%" cellspacing="0" cellpadding="0" id="table1">
<tr>
<td height="93"></td>
</tr>
<tr>
<td>

</td>
</tr>
</table>
</div>
</body>
</html>