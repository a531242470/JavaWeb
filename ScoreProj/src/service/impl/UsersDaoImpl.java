package service.impl;


import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import hibernate.HibernateSessionFactory;














import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;

import entity.DepScore;
import entity.Department;
import entity.Users;
import service.UsersDao;

public class UsersDaoImpl implements UsersDao{

	@Override
	public boolean userLogin(Users user) {
		// TODO Auto-generated method stub
		Transaction tx=null;
		String hql="";
		try {
			Session session=HibernateSessionFactory.getSessionFactory().getCurrentSession();
			tx=session.beginTransaction();
			System.out.println(user.getUserName()+user.getPassword());
			hql="from Users where userName=? and password=?";
			Query query=session.createQuery(hql);
			query.setParameter(0,user.getUserName());
			query.setParameter(1, user.getPassword());
			List<Users> list=query.list();
			System.out.println(list.toString());
			tx.commit();
			if (list.size()>0) {
				System.out.println(list.get(0).toString());
				return true;
			}else{
				return false;
			}
			
		} 
		catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
			return false;
		}
		finally{
			if(tx!=null){
		
				tx=null;
				
			}
		}
	}

	@Override
	public Users searchUser(String user) {
		// TODO Auto-generated method stub
		Transaction tx=null;
		String hql="";
		try {
			Session session=HibernateSessionFactory.getSessionFactory().getCurrentSession();
			tx=session.beginTransaction();
			hql="from Users where userName=?";
			Query query=session.createQuery(hql);
			query.setParameter(0,user);
			List list=query.list();
			tx.commit();
			if (list.size()>0) {
				System.out.println(list.get(0).toString());
				return (Users) list.get(0);
			}else{
				return null;
			}
			
		} 
		catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
			return null;
		}
		finally{
			if(tx!=null){
		
				tx=null;
				
			}
		}
		
	}

	@Override
	public List<Users> searchUserByDep(Department department) {
		// TODO Auto-generated method stub
		Transaction tx=null;
		String hql="";
		try {
			Session session=HibernateSessionFactory.getSessionFactory().getCurrentSession();
			tx=session.beginTransaction();
			hql="from Users where department=?";
			Query query=session.createQuery(hql);
			query.setParameter(0,department.getDepartmentName());
			List list=query.list();
			tx.commit();
			if (list.size()>0) {
				//System.out.println(list.get(0).toString());
				return list;
			}else{
				return null;
			}
			
		} 
		catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
			return null;
		}
		finally{
			if(tx!=null){
		
				tx=null;
				
			}
		}	
		
		
	
	}

	@Override
	public List<Users> searchUserScore(String userName) {
		// TODO Auto-generated method stub
		
		Transaction tx=null;
		String hql="";
		try {
			Session session=HibernateSessionFactory.getSessionFactory().getCurrentSession();
			tx=session.beginTransaction();
			hql="from Users where userName=?";
			Query query=session.createQuery(hql);
			query.setParameter(0, userName);
			List<Users> list=query.list();
			tx.commit();
			if(list.size()>0){
				return list;
			}else{
				return null;
			}
			
			
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
			return null;
		}finally{
			if(tx!=null){
				tx=null;
			}
		}
		
	}

	@Override
	public Users searchUserByName(String name) {
		// TODO Auto-generated method stub
		Transaction tx=null;
		String hql="";
		try {
			Session session=HibernateSessionFactory.getSessionFactory().getCurrentSession();
			tx=session.beginTransaction();
			hql="from Users where name=?";
			Query query=session.createQuery(hql);
			query.setParameter(0,name);
			List list=query.list();
			tx.commit();
			if (list.size()>0) {
				System.out.println(list.get(0).toString());
				return (Users) list.get(0);
			}else{
				return null;
			}
			
		} 
		catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
			return null;
		}
		finally{
			if(tx!=null){
		
				tx=null;
				
			}
		}
	}

	@Override
	public boolean addScore(DepScore depScore) {
		// TODO Auto-generated method stub
		Transaction tx=null;
		String hql="";
		
		
		
		try {
			Session session=HibernateSessionFactory.getSessionFactory().getCurrentSession();
			tx=session.beginTransaction();
			session.save(depScore);
			tx.commit();
			return true;
			
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
			return false;
		}
	}

	@Override
	public DepScore searchDepScoreByName(String userName) {
		// TODO Auto-generated method stub
		
		Transaction tx=null;
		String hql="";
		try {
			Session session=HibernateSessionFactory.getSessionFactory().getCurrentSession();
			tx=session.beginTransaction();
			hql="from DepScore where nameA=?";
			Query query=session.createQuery(hql);
			query.setParameter(0, userName);
			List list=query.list();
			tx.commit();
			if(list.size()>0){
				return (DepScore) list.get(0);
			}else{
				return null;
			}
		} catch (Exception e) {
			e.printStackTrace();// TODO: handle exception
			return null;
		}
		
	}

	@Override
	public boolean updateDepScore(DepScore depscore) {
		// TODO Auto-generated method stub
		
		Transaction tx=null;
		String hql="";
		try {
			Session session=HibernateSessionFactory.getSessionFactory().getCurrentSession();
			tx=session.beginTransaction();
			session.update(depscore);
			tx.commit();
			return true;
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
			return false;
		}
		
	}

	@Override
	public List<DepScore> searchAllDepScore() {
		// TODO Auto-generated method stub
		Transaction tx=null;
		String hql="";
		try {
			Session session=HibernateSessionFactory.getSessionFactory().getCurrentSession();
			tx=session.beginTransaction();
			hql="from DepScore";
			Query query=session.createQuery(hql);
			List list=query.list();
			tx.commit();
			if(list.size()>0){
				return list;
			}else{
				return null;
			}
		} catch (Exception e) {
			e.printStackTrace();// TODO: handle exception
			return null;
		}
		
		
	}

	@Override
	public List<Users> searchAllUser() {
		// TODO Auto-generated method stub
		
		Transaction tx=null;
		String hql="";
		try {
			Session session=HibernateSessionFactory.getSessionFactory().getCurrentSession();
			tx=session.beginTransaction();
			hql="from Users";
			Query query=session.createQuery(hql);
			List list=query.list();
			tx.commit();
			if(list.size()>0){
				return list;
			}else{
				return null;
			}
		} catch (Exception e) {
			e.printStackTrace();// TODO: handle exception
			return null;
		}
	}

	@Override
	public List<Department> searchAllDepartment() {
		// TODO Auto-generated method stub
		Transaction tx=null;
		String hql="";
		try {
			Session session=HibernateSessionFactory.getSessionFactory().getCurrentSession();
			tx=session.beginTransaction();
			hql="from Department";
			Query query=session.createQuery(hql);
			List list=query.list();
			tx.commit();
			if(list.size()>0){
				return list;
			}else{
				return null;
			}
		} catch (Exception e) {
			e.printStackTrace();// TODO: handle exception
			return null;
		}
	}

	@Override
	public boolean deleteDepScore(int id) {
		// TODO Auto-generated method stub
		Transaction tx=null;
		String hql="";
		try {
			Session session=HibernateSessionFactory.getSessionFactory().getCurrentSession();
			tx=session.beginTransaction();
			hql="delete from DepScore where id = ?";
			Query q=session.createQuery(hql);
			q.setInteger(0, id);
			q.executeUpdate();
			tx.commit();
			return true;
		} catch (Exception e) {
			// TODO: handle exception
			return false;
		}
		
	}

	@Override
	public DepScore searchDepScoreById(int id) {
		// TODO Auto-generated method stub
		
		Transaction tx=null;
		String hql="";
		try {
			Session session=HibernateSessionFactory.getSessionFactory().getCurrentSession();
			tx=session.beginTransaction();
			hql="from DepScore where id = ?";
			Query q=session.createQuery(hql);
			q.setInteger(0, id);
			List list=q.list();
			tx.commit();
			return (DepScore) list.get(0);
		} catch (Exception e) {
			// TODO: handle exception
			return null;
		}
	}




	

	

}
