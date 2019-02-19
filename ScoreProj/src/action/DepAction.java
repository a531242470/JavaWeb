package action;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import service.UsersDao;
import service.impl.UsersDaoImpl;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ModelDriven;

import entity.DepScore;
import entity.Users;

public class DepAction extends SuperAction implements ModelDriven<DepScore>{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private DepScore depScore=new DepScore();
	
	public String deleteDepScore(){
		UsersDao udao=new UsersDaoImpl();
		
		Integer id= new Integer(request.getParameter("id"));
		udao.deleteDepScore(id);
		
		List<DepScore> depScores=udao.searchAllDepScore();
		
		
		session.setAttribute("depscores", depScores);
		return "reflash_success";
		
	}
	
	
	public String addDepScore(){
		
		
			UsersDao udao=new UsersDaoImpl();	
			Users thatUsersName=(Users) session.getAttribute("user");
			Users thatUser=udao.searchUserByName(thatUsersName.getName());
			SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd");//设置日期格式
		    String nowTime=df.format(new Date());// new Date()为获取当前系统时间		
			
		if(udao.searchDepScoreByName(depScore.getNameA())!=null){
				
				
				ActionContext.getContext().put("message", "请不要重复添加");
				
				return "depScore_isNoNull";
				
			}
			
			Users thisUsers=udao.searchUserByName(depScore.getNameA());
			
			
			
		    DepScore thisDepScore=new DepScore(thisUsers.getUserName(), thisUsers.getName(), thisUsers.getDepartment(), thatUser.getUserName(), thatUser.getName(),thatUser.getDepartment(), 
	 			depScore.getScore1(),depScore.getScore2(),depScore.getScore3(), depScore.getScore4()
	 			, nowTime, thatUser.getUserName(), thatUser.getName(), nowTime);				
				udao.addScore(thisDepScore);
				getAllDepScore();
				ActionContext.getContext().put("message", "提交成功。");
			return "addDepScore_success";
			
				
		
	}
	public String getAllDepScore(){
		UsersDao udao =new UsersDaoImpl();
		List<DepScore> depScores=udao.searchAllDepScore();
		session.setAttribute("depscores",depScores);
		return "searchDepScore_success";
	}
	
	
	
	
	public String updataDepScore(){
		SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd");//设置日期格式
	    String nowTime=df.format(new Date());// new Date()为获取当前系统时间	
		
		UsersDao udao=new UsersDaoImpl();
		
		DepScore oldDepScore=(DepScore) session.getAttribute("oldDepScore");
		oldDepScore.setScore1(depScore.getScore1());
		oldDepScore.setScore2(depScore.getScore2());
		oldDepScore.setScore3(depScore.getScore3());
		oldDepScore.setScore4(depScore.getScore4());
		Users user=(Users) session.getAttribute("user");
		oldDepScore.setNameC(user.getName());
		oldDepScore.setUsernameC(user.getUserName());
		oldDepScore.setUpTime(nowTime);
		udao.updateDepScore(oldDepScore);
		
		System.out.println(oldDepScore);
		List<DepScore> depScores=udao.searchAllDepScore();
		session.setAttribute("depscores", depScores);
		return "reflash_success";
		
	}
	public String toUpdataDepScore(){
		Integer id= new Integer(request.getParameter("id"));
		UsersDao udao=new UsersDaoImpl();
		DepScore oldDepScore=udao.searchDepScoreById(id);
		session.setAttribute("oldDepScore", oldDepScore);
		return "toupdata_success";
		
	}
	
	
	
	
	
	
	@Override
	public DepScore getModel() {
		// TODO Auto-generated method stub
		return this.depScore;
	}
	

}
