<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>部门员工评价系统</title>
    
    
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->
    <link rel="stylesheet" href="css/MyOwn.css">
  </head>
  
  <body>
  <%if(session.getAttribute("loginUserName")!=null){RequestDispatcher rd = request.getRequestDispatcher("users/users_login_success.jsp"); 
 rd.forward(request,response);} %>
  
  
    <nav class="navbar navbar-inverse navbar-fixed-top" role="navigation">
        <div class="navbar-header"></div>
    </nav>
    <div class="login-page  center-block">
        <div class="center-container">
            <h2 class="color text-center">登录系统</h2>
            <form class="form-horizontal center-block" role="form"
                action="<%=path %>/users/User_login.action" method="post">
                <div class="form-group ">
                    <label class="col-sm-2 control-label">用户名</label>
                    <div class="col-sm-8">
                        <input type="text" class="form-control col-lg-sm" id="name"
                            name="userName" placeholder="用户名">
                    </div>
                </div>
                <div class="form-group">
                    <label for="inputPassword3" class="col-sm-2 control-label">密码</label>
                    <div class="col-sm-8">
                        <input type="password" class="form-control" id="inputPassword3"
                            name="password" placeholder="密码">
                    </div>
                </div>
               
                <div class="form-group ">
                    <div class="col-sm-8 col-sm-offset-2">
                        <button type="submit" class="btn btn-primary btn-block" id="btn">登录</button>
                    </div>
                </div>
            </form>
        </div>
    </div>
</body>
</html>
