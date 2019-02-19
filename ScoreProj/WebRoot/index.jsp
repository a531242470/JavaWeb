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
	<meta http-equiv="description" content="This is my page">
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
			<tr><th>评比要素</th><th>服从性</th><th>专业技能</th><th>部门贡献</th><th>成本意识</th></tr>
			<tr><td>分值</td><td>12</td><td>10</td><td>6</td><td>5</td><td>33</td></tr>
			<tr>
			  <td>评比要点</td>
			  <td>工作态度好、配合度高，服从主管合理工作安排</td>
			  <td>专业技能水平强、效率高，有担当，按质量完成本岗位工作任务。</td>
			  <td>有职业操守，有团队合作精神，部门归属感强，担当部门岗位多能手，完成岗位工作外，乐意协助部门人。</td>
			  <td>成本意识强，从公司利益角度出发，节省人、物、财成本。</td>
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
			   
			   
			   <td><select id="score4"  name="score4" onchange="select()"><%for(int i=0;i<5;i++){  %><option value="<%=i+1%>"><%=i+1%> </option><%} %></select></td>
			   
			   
			   <td><input type="submit" value="提交"></td>
			</tr>
		</table>
	

 
 </div>
 <div>
 	
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
			  			<td><%=depScores.get(i).getScore4() %></td>
			  			<td><%=depScores.get(i).getCreatTime() %></td>
			  			<td><%=depScores.get(i).getUsernameC() %></td>
			  			<td><%=depScores.get(i).getNameC() %></td>
			  			<td><%=depScores.get(i).getUpTime() %></td>
			  			
			  			
			  			<td><a href="<%=path %>/users/Dep_toUpdataDepScore.action?id=<%=depScores.get(i).getId()%>">修改</a></td>
			  			
			  			<td>   </td>
			  			<td><a href="<%=path %>/users/Dep_deleteDepScore.action?id=<%=depScores.get(i).getId()%>">删除</a></td>
					</tr>
					
					
					<%
				}
				}
			}
			
			
			 %>
			
			
		
		
		</table>
	
	</s:form>
 
 </div>
 
 

 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 <a href="users/User_logout.action">退出登录</a>
 
 
 
  <br>
  </body>
</html>
