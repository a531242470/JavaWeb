package service.impl;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import org.junit.Assert;
import org.junit.Test;

import service.UsersDao;
import entity.DepScore;
import entity.Department;
import entity.Users;

public class TestUserDaoImpl {
	@Test
	public void testUserLogin(){
		Users user=new Users("002951", "002951");
		UsersDao uDao=new UsersDaoImpl();
//		Assert.assertEquals(true,uDao.userLogin(user));
		System.out.println(uDao.userLogin(user));
	}
	
	
	
	@Test
	public void testUserSearch(){
		Users u=new Users("000001");
		UsersDao uDao=new UsersDaoImpl();
		Users user=uDao.searchUser("000001");
		System.out.println(user.toString());
	}
	
	@Test
	public void testDepSerUser(){
		Department department=new Department("总经办");
		UsersDao uDao=new UsersDaoImpl();
		
		List<Users> list=uDao.searchUserByDep(department);
		System.out.println(list.toString());
	}
	
	
	@Test
	public void testUserSearchScore(){
		UsersDao uDao=new UsersDaoImpl();
		List<Users> users=uDao.searchUserScore("002951");
		System.out.println(users.toString());
	}
	@Test
	public void testUserSearchByName(){
		UsersDao uDao=new UsersDaoImpl();
		Users user=uDao.searchUserByName("卢冠斌");
		System.out.println(user.toString());
		
	}
@Test
public void testAddScore(){
	SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd");//设置日期格式
    String nowTime=df.format(new Date());// new Date()为获取当前系统时间
	DepScore depScore=new DepScore("a1", "aa", "da", "b1", "bb", "db",1,2,3,4,nowTime, "c1", "cc", nowTime);
	UsersDao uDao=new UsersDaoImpl();
	uDao.addScore(depScore);
}
@Test
public void testSearchDepScoreByName(){
	String name="卢冠斌";
	UsersDao udao=new UsersDaoImpl();
	System.out.println(udao.searchDepScoreByName(name));
	
	
}
@Test
public void testUpdata(){
	UsersDao udDao=new UsersDaoImpl();
	SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd");//设置日期格式
    String nowTime=df.format(new Date());// new Date()为获取当前系统时间
	DepScore depScore=new DepScore("a1", "aa", "da", "b1", "bb", "db",1,2,3,4,nowTime, "c1", "cc", nowTime);
	udDao.updateDepScore(depScore);
}
@Test
public void testSearchAllFromDep(){
	UsersDao udao=new UsersDaoImpl();
	List<DepScore> depScores=udao.searchAllDepScore();
	System.out.println(depScores);
}
@Test
public void deleteDep(){
	UsersDao udao=new UsersDaoImpl();
	udao.deleteDepScore(6);
}
@Test
public void searchDepScorById(){
	UsersDao udao=new UsersDaoImpl();
	
	System.out.println(udao.searchDepScoreById(37));
}
}
