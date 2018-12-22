package com.loo.action;



import javax.servlet.ServletContext;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.apache.struts2.interceptor.ServletRequestAware;
import org.apache.struts2.interceptor.ServletResponseAware;
import org.apache.struts2.util.ServletContextAware;


import com.opensymphony.xwork2.ActionSupport;

public class SuperAction extends ActionSupport  implements ServletContextAware,ServletRequestAware,ServletResponseAware{
	
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	protected HttpServletResponse response;
	protected HttpServletRequest requset;
	protected ServletContext context;
	protected HttpSession session;
	
	

	@Override
	public void setServletResponse(HttpServletResponse response) {
		// TODO Auto-generated method stub
		this.response=response;
	}

	@Override
	public void setServletRequest(HttpServletRequest requset) {
		// TODO Auto-generated method stub
		this.requset=requset;
		this.session=requset.getSession();
		
	}

	@Override
	public void setServletContext(ServletContext context) {
		// TODO Auto-generated method stub
		this.context=context;
	
		
	}

}
