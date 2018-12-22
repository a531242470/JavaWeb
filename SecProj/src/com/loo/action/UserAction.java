package com.loo.action;

import org.apache.struts2.interceptor.validation.SkipValidation;

import com.loo.javabean.User;
import com.loo.service.UserDAO;
import com.loo.service.impl.UserDAOImpl;
import com.opensymphony.xwork2.ModelDriven;

public class UserAction extends SuperAction  implements ModelDriven<User>{
	private User user=new User();
	
	
	
	public String login(){
		
		
		UserDAO dao=new UserDAOImpl();
		
		
		
		
		if(dao.userLogin(user)){
			session.setAttribute("loginUserName",user.getUsername());
			return "login_success";
		}else {
			this.addFieldError("userNoFound", "用户不存在或密码错误");
			return "login_failure";
			
		}
		
	}
	
	@SkipValidation
	public String logout(){
		
		if (session.getAttribute("loginUserName")!=null) {
			session.removeAttribute("loginUserName");
		}
		return "logout_success";
	}
	
	@Override
	public void validate() {
		// TODO Auto-generated method stub
		super.validate();
		if ("".equals(user.getUsername().trim())) {
			this.addFieldError("usernameError", "请输入用户名");
			
		}
		if(user.getUserpassword().length()<6){
			
			this.addFieldError("userpasswordError","请输入多于6位的密码");
			
		}
		
	}
	
	@Override
	public User getModel() {
		// TODO Auto-generated method stub
		
		
		return this.user;
	}
	

}
