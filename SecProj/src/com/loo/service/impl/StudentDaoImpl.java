package com.loo.service.impl;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;

import com.loo.hibernate.HibernateSessionFactory;
import com.loo.javabean.Student;
import com.loo.service.StudentDao;

public class StudentDaoImpl implements StudentDao {

	@Override
	public List<Student> queryAllStudents() {
		// TODO Auto-generated method stub
		Transaction transaction=null;
		List<Student> students=null;
		String hql="";
		try{
			
			Session session=HibernateSessionFactory.getSessionFactory().getCurrentSession();
			transaction=session.beginTransaction();
			hql="from Student";
			Query query=session.createQuery(hql);
			students=query.list();
			transaction.commit();
			return students;
			
			
			
			
		}catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
			transaction.commit();
			
			return students;
		}finally {
			if (transaction!=null) {
				transaction=null;
				
			}
			
		}
		
		
	}

	@Override
	public Student queryStudentById(String sid) {
		// TODO Auto-generated method stub
		Transaction transaction=null;
		Student student=null;
		try{
			
			Session session=HibernateSessionFactory.getSessionFactory().getCurrentSession();
			transaction=session.beginTransaction();
			student=session.get(Student.class, sid);
			transaction.commit();
			return student;
			
			
			
			
		}catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
			transaction.commit();
			
			return student;
		}finally {
			if (transaction!=null) {
				transaction=null;
				
			}
			
		}
		
		
		
		
		
		
	}

	@Override
	public boolean addStudent(Student student) {
		// TODO Auto-generated method stub
		
		student.setSid(getNewSid());
		
		Transaction transaction=null;
		
		try{
			Session session=HibernateSessionFactory.getSessionFactory().getCurrentSession();
			transaction=session.beginTransaction();
			session.save(student);
			transaction.commit();
			return true;
			
		}catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
			return false;
		}
		finally {
			if (transaction!=null) {
				transaction=null;
			}
			
		}
		
	}

	@Override
	public boolean updataStudent(Student student) {
		// TODO Auto-generated method stub
		Transaction transaction=null;
		try {
			Session session=HibernateSessionFactory.getSessionFactory().getCurrentSession();
			transaction=session.beginTransaction();
			session.update(student);
			transaction.commit();
			return true;
			
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
			return false;
		}finally {
			
			if (transaction!=null) {
				transaction=null;
			}
			
			
		}
	}

	@Override
	public boolean deleteStudent(String sid) {
		// TODO Auto-generated method stub
		Transaction transaction=null;

		try{
			
			Session session=HibernateSessionFactory.getSessionFactory().getCurrentSession();
			transaction=session.beginTransaction();
			Student s=session.get(Student.class, sid);
			session.delete(s);
			transaction.commit();
			return true;
			
			
			
		}catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
			return false;
		}finally {
			transaction=null;
		}
		
		
	
	}
	public String getNewSid(){
		Transaction transaction=null;
		String hql="";
		String sid=null;
		try {
			Session session=HibernateSessionFactory.getSessionFactory().getCurrentSession();
			transaction=session.beginTransaction();
			hql="select max(sid) from Student";
			Query query=session.createQuery(hql);
			sid=(String)query.uniqueResult();
			if(sid==null||"".equals(sid)){
				sid="001";
			}else{
				int i=Integer.parseInt(sid);
				i++;
				String temp=String.valueOf(i);
				int len=temp.length();
				for (int j = 0; j < 3-len; j++) {
					temp ="0"+temp;
				}
				transaction.commit();
				sid=temp;
			}
			return sid;
			
			
			
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
			transaction.commit();
			return null;
		}finally {
			if (transaction!=null) {
				transaction=null;
			}
			
		}
		
	}

}
