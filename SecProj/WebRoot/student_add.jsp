<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>My JSP 'student_add.jsp' starting page</title>
    
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->
	<style type="text/css">
	
	#add_student{
	 text-align: center;
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
    <script language="javascript" type="text/javascript" src="My97DatePicker/WdatePicker.js"></script>
  </head>
  
  <body>
  
<%if(session.getAttribute("loginUserName")==null||"".equals(session.getAttribute("loginUserName"))){
 %>
 <jsp:forward page="user_login_success.jsp"></jsp:forward>
 
 <%
 }
 
 
  %>
  
    <div id="add_student">
    	<form action="student/Student_add.action" method="post" >
    		姓名:<input type="text" name="sname"><br>
    		性别:<input type="radio" name="sgender" checked="checked" value="男">男<input type="radio" name="sgender" value="女">女<br>
    		出生日期:<input type="text" name="sbirthday" style="width: 40%" class="Wdate" readonly="readonly"    onClick="WdatePicker({dateFmt:'yyyy-MM-dd HH:mm'})"  /><br>
    		地址:<input type="text" name="saddress"><br>
    		<input type="submit" value="提交">
    	</form>
    
    </div>
  </body>
</html>
