<%@page import="entity.Department"%>
<%@page import="entity.DepScore"%>
<%@page import="service.impl.UsersDaoImpl"%>
<%@page import="service.UsersDao"%>
<%@page import="entity.Users"%>
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
    
    <title>评分系统</title>
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="评分页面">
	<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->
	<style type="text/css">
	body{
	text-align: center;
	}
		.welcome{
		height:auto;
		width:auto;
		border:2px solid;
		text-align: center;}		
		.tb{
		margin:0 auto; width:700px; height:auto;		
		}
		#td{
		text-align: center;
		vertical-align: middle;
		}
	</style>
	<script type="text/javascript">
		 window.location.href="<%=path %>/users/User_chooseDepartment.action?departmentName="+encodeURIComponent(departmentName);
	var message = "${requestScope.message}";
	if (message != "") {
		alert(message);
	}
	
		function selectEmployee(){
				var employeeName=document.getElementById("employee").value;
				 window.location.href="<%=path %>/users/User_chooseEmployee.action?employeename="+encodeURIComponent(employeeName);
				
		}	
	
			function selectDepartment(){
				var departmentName=document.getElementById("deplist").value;
				 window.location.href="<%=path %>/users/User_chooseDepartment.action?departmentName="+encodeURIComponent(departmentName);
				
		}	
	
		function select(){
			var score1=document.getElementById("score1").value;
			var score2=document.getElementById("score2").value;
			var score3=document.getElementById("score3").value;
			var score4=document.getElementById("score4").value;
			var scoresum=parseInt(score1)+parseInt(score2)+parseInt(score3)+parseInt(score4);
			document.getElementById("scoresum").innerText=scoresum;		
		}
	
	
	</script>
  </head>
  
  <body>
  
  
  <%if(session.getAttribute("user")==null){
  RequestDispatcher rd = request.getRequestDispatcher("/login.jsp"); 
 rd.forward(request,response);};
 if(session.getAttribute("user")==null){
  RequestDispatcher rd = request.getRequestDispatcher("/login.jsp"); 
 rd.forward(request,response);};
  String departmentName="总经办";
 
 
 Users user=(Users)session.getAttribute("user");
 List<Users> employees=(List<Users>)session.getAttribute("employees");
Users employee=(Users)request.getAttribute("userscore");
	
 List<DepScore> depScores=(List<DepScore>)session.getAttribute("depscores");
 List<Department> departments=(List<Department>)session.getAttribute("departments");
 
 if(session.getAttribute("departmentName")!=null){
 	departmentName=(String)session.getAttribute("departmentName");
 }
 
 
 %>
 <div class="welcome">
 <h1>欢迎你,<%=user.getName()%>,所属部门:<%=user.getDepartment() %>
 </h1>
 </div>
 <div>
 
 <select id="deplist" name="deplist" onchange="selectDepartment()" >
 	<%
 	
 	if(departments!=null){
 	
 	for(int i=0;i<departments.size();i++){
 		if(departmentName!=null){
 		if(departmentName.equals(departments.get(i).getDepartmentName())){
 		%>
 		<option selected="selected" value="<%=departments.get(i).getDepartmentName()%>"><%=departments.get(i).getDepartmentName()%></option>
 		<%
 		continue;
 		}}
 		
 		%>
 		<option value="<%=departments.get(i).getDepartmentName()%>"><%=departments.get(i).getDepartmentName()%></option>
 		<%
 	}}%>
 </select>
 </div>


<div class="tb">
	<s:form action="/users/Dep_addDepScore.action" method="post" >
	
	
 <%if(employees!=null){ %>
 <select id="nameA"  name="nameA">
 <%  for(int i=0;i<employees.size();i++){
 	if(departmentName!=null){
 		if(employees.get(i).getDepartment().equals(departmentName)){
 %>
 <option value="<%=employees.get(i).getName() %>"><%=employees.get(i).getName() %></option>
 <%
 }}}}%>
</select>
</div>
	
	
	
		<table border="1" align="center">
			<tr><th>评比要素</th><th>工作效率</th><th>工作质量</th><th>配合度</th></tr>
			<tr><td>分值</td><td>8</td><td>8</td><td>14</td><td>30</td></tr>
			<tr>
			  <td>评比要点</td>
			  <td>熟练掌握本岗位工作、执行力强、能用最好的工作方法、快速响应工序需要，按期完成其他部门的工作任务</td>
			  <td>工作细致、认真，能正确完成其他部门的工作任务。</td>
			  <td>在工作态度、配合度上与其他部门人员工作沟通对接流畅、较高的配合度，能用最友好态度、最优的时间完成跨部门的工作。</td>
			
			  <td>合计</td>
			</tr>
			<tr>
			   <td>分数</td>
			   
			   <td>
			   
			   <select id="score1"  name="score1" onchange="select()">
			   
			   <%for(int i=0;i<12;i++){ 
			 
			   %>
			   
			   <option value="<%=i+1%>"><%=i+1%> </option>
			   
			   <%} %>
			   
			   </select>
			   
			   </td>
			   
			   <td><select id="score2"  name="score2" onchange="select()"><%for(int i=0;i<10;i++){  %><option value="<%=i+1%>"><%=i+1%> </option><%} %></select></td>
			   
			   <td><select id="score3" name="score3"  onchange="select()"><%for(int i=0;i<6;i++){ %><option value="<%=i+1%>"><%=i+1%> </option><%} %></select></td>
			   
			   <td><input type="submit" value="提交/修改"></td>
			</tr>
		</table>
	</s:form>
 </div>
 <div>
 	<form action="">
		<table border="1" align="center">
			<tr>
			  <th>被评人账号</th>
			  <th>被评人姓名</th>
			  <th>被评人部门</th>
			  <th>评价人账号</th>
			  <th>评价人姓名</th>
			  <th>评价人部门</th>
			  <th>工作效率分数</th>
			  <th>工作质量分数</th>
			  <th>配合度分数</th>
			  <th>评分日期</th>
			  <th>修改人账号</th>
			  <th>修改人姓名</th>
			  <th>修改日期</th>
			  <th>操作</th>
			</tr>
			<%
			if(depScores!=null){
				for(int i=0;i<depScores.size();i++){
					if(depScores.get(i).getNameB().equals(user.getName())){
					%>
					<tr>
			  			<td><%=depScores.get(i).getUsernameA()%></td>
			  			<td><%=depScores.get(i).getNameA() %></td>
			  			<td><%=depScores.get(i).getDepartmentA() %></td>
			  			<td><%=depScores.get(i).getUsernameB() %></td>
			  			<td><%=depScores.get(i).getNameB() %></td>
			  			<td><%=depScores.get(i).getDepartmentB() %></td>
			  			<td><%=depScores.get(i).getScore1() %></td>
			  			<td><%=depScores.get(i).getScore2() %></td>
			  			<td><%=depScores.get(i).getScore3() %></td>
			  			<td><%=depScores.get(i).getCreatTime() %></td>
			  			<td><%=depScores.get(i).getUsernameC() %></td>
			  			<td><%=depScores.get(i).getNameC() %></td>
			  			<td><%=depScores.get(i).getUpTime() %></td>
			  			<td><a href="<%=path %>/users/User_deleteDepScore.action?id=<%=depScores.get(i).getId()%>">删除</a></td>
					</tr>
					<%
				}
				}
			}
			 %>		
		</table>	
	</form>
 </div>
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 <a href="users/User_logout.action">退出登录</a>
 
 
 
  <br>
  </body>
</html>
