package test;

import org.junit.Test;

import com.loo.service.StudentDao;
import com.loo.service.impl.StudentDaoImpl;

public class TestFindStu {
	@Test
	public void getStu(){
		StudentDao dao=new StudentDaoImpl();
		System.out.println(dao.queryStudentById("002").toString());
		
		
	}

}
