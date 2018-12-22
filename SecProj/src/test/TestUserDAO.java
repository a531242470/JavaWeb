package test;

import static org.junit.Assert.assertTrue;

import javax.validation.constraints.AssertTrue;

import org.junit.Test;

import com.loo.javabean.User;
import com.loo.service.UserDAO;
import com.loo.service.impl.UserDAOImpl;

import junit.framework.Assert;

public class TestUserDAO {
	@Test
	public void testUserLogin(){
		User u=new User(1, "aa", "123456");
		UserDAO dao=new UserDAOImpl();
		Assert.assertEquals(true, dao.userLogin(u));
		
		
	}

}
