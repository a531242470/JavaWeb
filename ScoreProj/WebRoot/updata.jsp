<%@page import="entity.DepScore"%>
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
    
    <title>My JSP 'updata.jsp' starting page</title>
    
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
  <%DepScore depScore=(DepScore)session.getAttribute("oldDepScore"); %>
  
  <s:form action="/users/Dep_updataDepScore.action" method="post" >
  
    <table border="1" align="center">
    
			<tr>
			  <th>被评人账号</th>
			  <th>被评人姓名</th>
			  <th>被评人部门</th>
			  <th>评价人账号</th>
			  <th>评价人姓名</th>
			  <th>评价人部门</th>
			  <th>服从性分数</th>
			  <th>专业技能分数</th>
			  <th>部门贡献分数</th>
			  <th>成本意识分数</th>
			  <th>评分日期</th>
			  <th>修改人账号</th>
			  <th>修改人姓名</th>
			  <th>修改日期</th>
			  <th>操作</th>
			</tr>
			<tr>
				<td><%=depScore.getUsernameA() %></td>
				<td><%=depScore.getNameA() %></td>
				<td><%=depScore.getDepartmentA() %></td>
				<td><%=depScore.getUsernameB() %></td>
				<td><%=depScore.getNameB() %></td>
				<td><%=depScore.getDepartmentB() %></td>
				
				
				
				 <td>
			   
			   <select id="score1"  name="score1" onchange="select()">
			   
			   <%for(int i=0;i<12;i++){ 
			   
			   if(i+1==depScore.getScore1()){%><option selected="selected" value="<%=i+1%>"><%=i+1%> </option><%continue;}
			   
			   %>
			   
			   <option value="<%=i+1%>"><%=i+1%> </option>
			   
			   
			   <%} %>
			   
			   </select>
			   
			   </td>
			   
			   
			   <td><select id="score2"  name="score2" onchange="select()"><%for(int i=0;i<10;i++){ if(i+1==depScore.getScore2()){%><option selected="selected" value="<%=i+1%>"><%=i+1%> </option><%continue;} %><option value="<%=i+1%>"><%=i+1%> </option><%} %></select></td>
			   
			   
			   <td><select id="score3" name="score3"  onchange="select()"><%for(int i=0;i<6;i++){if(i+1==depScore.getScore3()){%><option selected="selected" value="<%=i+1%>"><%=i+1%> </option><%continue;} %><option value="<%=i+1%>"><%=i+1%> </option><%} %></select></td>
			   
			   
			   <td><select id="score4"  name="score4" onchange="select()"><%for(int i=0;i<5;i++){if(i+1==depScore.getScore4()){%><option selected="selected" value="<%=i+1%>"><%=i+1%> </option><%continue;}  %><option value="<%=i+1%>"><%=i+1%> </option><%} %></select></td>
			   
				
				
				
				
				
				
				
				
				
				<td ><%=depScore.getCreatTime() %></td>
				<td><%=depScore.getUsernameC() %></td>
				<td><%=depScore.getNameC() %></td>
				<td><%=depScore.getUpTime() %></td>
				<td><input type="submit" value="修改"></td>
			</tr>
			
			
	</table>
    
    </s:form>
    
  </body>
</html>
