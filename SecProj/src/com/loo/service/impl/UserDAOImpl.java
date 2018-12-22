package com.loo.service.impl;

import java.util.List;


import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;

import com.loo.hibernate.HibernateSessionFactory;
import com.loo.javabean.User;
import com.loo.service.UserDAO;


public class UserDAOImpl implements UserDAO {

	@Override
	public boolean userLogin(User u) {
		// TODO Auto-generated method stub
		Transaction transaction=null;
		String hql="";
		
		
		try{
			
			Session session=HibernateSessionFactory.getSessionFactory().getCurrentSession();
			transaction=session.beginTransaction();
			
			hql="from User where username=?0 and userpassword=?1";
			Query query=session.createQuery(hql);
			query.setParameter("0", u.getUsername());
			query.setParameter("1", u.getUserpassword());
			List list=query.list();
			transaction.commit();
			if(list.size()>0){
				return true;
			}else{
				return false;
				
			}
			 
		}catch (Exception e) {
			System.out.println("≤∂ªÒµΩ“Ï≥£");
			e.printStackTrace();
			return false;
			
		}
		finally {
			if (transaction!=null) {
				//transaction.commit();
				transaction=null;
			}
		}
		
	}
	

}
