package test;

import java.util.Date;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;
import org.junit.Test;

import com.loo.javabean.Student;

public class TestAddUser {
	
	@Test
	public void addUser(){
		Configuration configuration=new Configuration().configure();
		configuration.addClass(Student.class);
		ServiceRegistry registry=new StandardServiceRegistryBuilder().applySettings(configuration.getProperties()).build();
		SessionFactory sessionFactory=configuration.buildSessionFactory(registry);
		Session session=sessionFactory.getCurrentSession();
		Transaction transaction=session.beginTransaction();
		
		Student student1=new Student("001", "conn", "��",new Date(), "����");
		Student student2=new Student("002", "����", "��",new Date(), "�Ϻ�");
		Student student3=new Student("003", "����", "��",new Date(), "����");
		Student student4=new Student("004", "����", "Ů",new Date(), "����");
		
		session.save(student1);
		session.save(student2);
		session.save(student3);
		session.save(student4);
		
		
		transaction.commit();
		
		
	}

}
