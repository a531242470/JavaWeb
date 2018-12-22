package com.loo.action;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import com.loo.javabean.Student;
import com.loo.service.StudentDao;
import com.loo.service.impl.StudentDaoImpl;

public class StudentAction extends SuperAction {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	
	public String query(){
		
		StudentDao dao=new StudentDaoImpl();
		List<Student> list=dao.queryAllStudents();
		session.setAttribute("student_list", list);
		return "student_query_success";
		
		
	}
	
	public String delete(){
		StudentDao dao=new StudentDaoImpl();
		String sid=requset.getParameter("sid");
		dao.deleteStudent(sid);
		return "delete_success";
		
		
	}
	public String add() throws ParseException{
		StudentDao dao=new StudentDaoImpl();
		Student student=new Student();
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm");
		Date date=sdf.parse(requset.getParameter("sbirthday"));
		student.setSname(requset.getParameter("sname"));
		System.out.println(requset.getParameter("sname"));
		student.setGender(requset.getParameter("sgender"));
		student.setBirthday(date);
		student.setAddress(requset.getParameter("saddress"));
		
		dao.addStudent(student);
		return "add_success";
		
	}
	public String queryById(){
		String sid=requset.getParameter("sid");
		StudentDao dao=new StudentDaoImpl();
		Student s=dao.queryStudentById(sid);
		session.setAttribute("thatStudent", s);
		return "queryById_success";
		
		
		
	}
	public String updata() throws ParseException{
		Student student=new Student();
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm");
		Date date=sdf.parse(requset.getParameter("sbirthday"));
		student.setSname(requset.getParameter("sname"));
		student.setBirthday(date);
		student.setAddress(requset.getParameter("saddress"));
		student.setGender(requset.getParameter("sgender"));
		student.setSid(requset.getParameter("sid"));
		StudentDao dao=new StudentDaoImpl();
		dao.updataStudent(student);
		return "updata_success";
	}
	
}
