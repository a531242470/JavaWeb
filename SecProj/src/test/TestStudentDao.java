package test;

import java.util.Date;
import java.util.List;

import org.junit.Test;

import com.loo.javabean.Student;
import com.loo.service.StudentDao;
import com.loo.service.impl.StudentDaoImpl;

public class TestStudentDao {
	@Test
	public void queryAllStudents(){
		
		StudentDao dao=new StudentDaoImpl();
		List<Student> list=dao.queryAllStudents();
		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i).toString());
			
		}
		
	}
	
	@Test
	public void testGetID(){
		StudentDao dao=new StudentDaoImpl();
		System.out.println(dao.getNewSid());
		
	}

	
	@Test
	public void testAddStudent(){
		
		StudentDao dao=new StudentDaoImpl();
		Student student=new Student();
		student.setSname("°¡¹þ¹þ");
		student.setGender("ÄÐ");
		student.setBirthday(new Date());
		student.setAddress("Î÷²Ø");
		
		dao.addStudent(student);
		
		
		
		
	}
	
}
