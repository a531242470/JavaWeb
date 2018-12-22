<%@page import="com.loo.javabean.Student"%>
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
    
    <title>My JSP 'student_query_success.jsp' starting page</title>
    
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->
	<style type="text/css">
	#student_message{
	 text-align: center; /*让div内部文字居中*/
    background-color: #fff;
    border-radius: 20px;
    width: 400px;
    height: 350px;
    margin: auto;
    position: absolute;
    top: 0;
    left: 0;
    right: 0;
    bottom: 0;
	}
	
	</style>

  </head>
  
  <body>
  
  
  <div id="student_message">
  <%if(session.getAttribute("loginUserName")==null||"".equals(session.getAttribute("loginUserName"))){ %><jsp:forward page="user_login_success.jsp"></jsp:forward><%}%>
  
  		<a href="student_add.jsp">添加学生</a><br>
  		<a href="user_login_success.jsp">返回</a><br>
  	
    	<table>
    	<tr><th>ID</th><th>姓名</th><th>性别</th><th>生日</th><th>地址</th></tr>
    	<%
    	List<Student> list=(List<Student>)session.getAttribute("student_list");
    	
    	
    	for(int i=0;i<list.size();i++){
    		
    	%>
    	
    	
    	<tr>
    		<td><%=list.get(i).getSid()%></td>
    		<td><a href="student/Student_queryById.action?sid=<%=list.get(i).getSid()%>"><%=list.get(i).getSname()%></a></td>
    		<td><%=list.get(i).getGender()%></td>
    		<td><%=list.get(i).getBirthday()%></td>
    		<td><%=list.get(i).getAddress()%></td>
    		<td><a href="student/Student_delete.action?sid=<%=list.get(i).getSid() %>"  onclick="javascript:return confirm('确认删除？');">删除</a></td>
    	</tr>
    	
    	
    	</div>
    	<%
    	
    	
    	}
    	
    	
    	
    	 %>
    	
    	
    	</table>
    	
    	
  </body>
</html>
