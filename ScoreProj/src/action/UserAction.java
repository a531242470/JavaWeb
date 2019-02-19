package action;

import java.io.UnsupportedEncodingException;
import java.util.List;

import javax.servlet.ServletContext;

import org.apache.struts2.ServletActionContext;

import service.UsersDao;
import service.impl.UsersDaoImpl;

import com.opensymphony.xwork2.ModelDriven;

import entity.DepScore;
import entity.Department;
import entity.Users;

public class UserAction extends SuperAction implements ModelDriven<Users>{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private Users user=new Users();
	
	
	
	
	public String reflash(){
		session.setAttribute("isreflash", "1");
		
		
		
		
		return "reflash_success";
		
	}
	
	public String chooseDepartment() throws UnsupportedEncodingException{
		session.setAttribute("isreflash", "1");
		
		String departmentName = new String(request.getParameter("departmentName").getBytes("ISO-8859-1"),"UTF-8"); 
		session.setAttribute("departmentName",departmentName);
		
		
		return "chooserdep_success";
		
	}
	

	
	public String chooseEmployee() throws UnsupportedEncodingException{
		String employeename = new String(request.getParameter("employeename").getBytes("ISO-8859-1"),"UTF-8"); 
		UsersDao uDao=new UsersDaoImpl();
		Users user=uDao.searchUserByName(employeename);
		if(user.getScoreA1()==null){
			user.setScoreA1(0);
		}else{
			user.setScoreA1(user.getScoreA1());
		}
		if(user.getScoreA2()==null){
			user.setScoreA2(0);
		}else{
			user.setScoreA2(user.getScoreA2());
		}
		if(user.getScoreA3()==null){
			user.setScoreA3(0);
		}else{
			user.setScoreA3(user.getScoreA3());
		}
		if(user.getScoreA4()==null){
			user.setScoreA4(0);
		}else{
			user.setScoreA4(user.getScoreA4());
		}
		request.setAttribute("userscore", user);
		System.out.println(user);
		return "search_score_success";
		
	}
	
	
	
	
	public void chooseScore(){
		
		System.out.println(ServletActionContext.getRequest().getParameter("score1"));
		
	}
	
	
	
	//用户登录
	public String login(){
		
		
		
		
		UsersDao uDao=new UsersDaoImpl();
		List<DepScore> depScores=uDao.searchAllDepScore();
		if(uDao.userLogin(user)){
			Users thisuser=uDao.searchUser(user.getUserName());
			session.setAttribute("user",thisuser);
//			System.out.println(thisuser.toString());
			
			if(thisuser.getType().equals("A")){
				Department department=new Department(thisuser.getDepartment());
//				System.out.println(department.toString());
				List<Users> employees=uDao.searchAllUser();
				for (int i = 0; i < employees.size(); i++) {
					if(employees.get(i).getName().equals(thisuser.getName())){
						employees.remove(i);
					}
				}
//				System.out.println(employees+"nono");
				session.setAttribute("employees", employees);
				session.setAttribute("depscores", depScores);
				session.setAttribute("departments", uDao.searchAllDepartment());
				
			}
			
			
			
			System.out.println("success");
			return "login_success";
		}else {
			System.out.println("failure");
			return "login_failure";
			
		}
		
	}
	//用户注销
	public String logout(){
		if(session.getAttribute("user")!=null){
//			session.removeAttribute("user");
//			session.removeAttribute("employees");
			session.invalidate();
		}
		return "logout_success";
	}
	
	
	
	
	
	
	
	
	@Override
	public Users getModel() {
		// TODO Auto-generated method stub
		return this.user;
	}
	

}
