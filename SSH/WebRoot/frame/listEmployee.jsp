<%@page import="com.loo.employee.domain.Employee"%>
<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>
<style type="text/css">
        .table1{
            border:1px solid #ddd;
            width:900px;
            
        }
        thead{
            background-color:lightblue;
        }

    </style>
</head>
<body>
<%if(session.getAttribute("rEmployee")==null||"".equals(session.getAttribute("rEmployee"))){%><jsp:forward page="/login.jsp"></jsp:forward><%} %>
<table border="0" width="900px">
<tr>
<td align="center" style="font-size:24px; color:#666"> 员工管理</td>
</tr>
<tr>
<td align="right" > <a href="${pageContext.request.contextPath}/employee_saveUI.action">添加</a></td>
</tr>
</table>
<br/>


<table cellspacing="0" border="1" class="table1">
<thead>

  <tr>
<td align="center">编号</td>
<td align="center">员工姓名</td>
<td align="center">性别</td>
<td align="center">出生日期</td>
<td align="center">入职时间</td>
<td align="center">所属部门</td>
<td align="center">编辑</td>
<td align="center">操作</td>
</tr>
</thead>
<tbody>
<%List<Employee> employees=(List<Employee>)session.getAttribute("employees"); 
if(employees.size()>0){
for(int i=0;i<employees.size();i++){
%>
<tr>
<td align="center"><%=employees.get(i).getEid() %></td>
<td align="center"><%=employees.get(i).getEname() %></td>
<td align="center"><%=employees.get(i).getSex() %></td>
<td align="center"><%=employees.get(i).getBirthday() %></td>
<td align="center"><%=employees.get(i).getJoinDate() %></td>
<td align="center"><%=employees.get(i).getDepartment().getDname()%></td>
<td align="center"><a href="${pageContext.request.contextPath}/employee_edit.action?eid=<%=employees.get(i).getEid() %>"><img src="${pageContext.request.contextPath}/images/编辑.png"/></a></a></td>
<td align="center"><a href="${pageContext.request.contextPath}/employee_delete.action?eid=<%=employees.get(i).getEid() %>">删除</a></td>
</tr>
<%}}
 %>
</tbody>
</table>
<br/>

</body>
</html>