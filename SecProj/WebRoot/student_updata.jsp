<%@page import="com.loo.javabean.Student"%>
<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>My JSP 'student_updata.jsp' starting page</title>
    
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->
	<style type="text/css">
		#updata_student{
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
	   <script language="javascript" type="text/javascript" src="<%=basePath%>/My97DatePicker/WdatePicker.js"></script>

  </head>
  
  <body>
    <%if(session.getAttribute("loginUserName")==null||"".equals(session.getAttribute("loginUserName"))){ %><jsp:forward page="user_login_success.jsp"></jsp:forward><%}%>
    <div id="updata_student">
    	<form action="student/Student_updata.action" method="post" >
    	<%Student student=(Student)session.getAttribute("thatStudent"); %>
    		
    		学号:<input type="text" readonly="readonly" name="sid" value="<%=student.getSid() %>"><br>
    		姓名:<input type="text" name="sname" value="<%=student.getSname() %>"><br>
    		
    		性别:
    		<%if(student.getGender().equals("男")){
    		%>
    		
    			<input type="radio" name="sgender" checked="checked" value="男">男
    		<input type="radio" name="sgender" value="女">女
    		
    		<%
    		
    		}else{
    		%>
    		<input type="radio" name="sgender" value="男">男
    		<input type="radio" name="sgender" checked="checked" value="女">女
    		
    		<%
    		} %>
    	
    		
    		
    		
    		<br>
    		
    		
    		
    		
    	            出生日期:<input type="text" name="sbirthday" style="width: 40%" class="Wdate" readonly="readonly" value="<%=student.getBirthday() %>"   onClick="WdatePicker({dateFmt:'yyyy-MM-dd HH:mm'})"  /><br>
    		地址:<input type="text" value="<%=student.getAddress() %>" name="saddress"><br>
    		<input type="submit" value="提交">
    	</form>
    
    </div>
  </body>
</html>
