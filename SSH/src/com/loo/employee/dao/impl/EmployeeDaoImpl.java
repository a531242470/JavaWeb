package com.loo.employee.dao.impl;

import java.util.List;

import org.hibernate.criterion.DetachedCriteria;
import org.springframework.orm.hibernate4.support.HibernateDaoSupport;

import com.loo.employee.dao.EmployeeDao;
import com.loo.employee.domain.Employee;

public class EmployeeDaoImpl extends HibernateDaoSupport implements EmployeeDao {

	@Override
	public Employee finByUsernameAndPassword(Employee employee) {
		// TODO Auto-generated method stub
		
		String hql="from Employee where username=? and password =?";
		List<Employee> list=(List<Employee>) this.getHibernateTemplate().find(hql, employee.getUsername(),employee.getPassword());
		if(list.size()>0){
			
			return list.get(0);
		}
		return null;
	}

	@Override
	public List<Employee> finAll() {
		// TODO Auto-generated method stub
		DetachedCriteria criteria=DetachedCriteria.forClass(Employee.class);
		List<Employee> list= (List<Employee>) this.getHibernateTemplate().findByCriteria(criteria);
		return list;
	}

	@Override
	public void save(Employee employee) {
		// TODO Auto-generated method stub
		this.getHibernateTemplate().save(employee);
		
	}

	@Override
	public Employee findById(Integer eid) {
		// TODO Auto-generated method stub
		
		return this.getHibernateTemplate().get(Employee.class,eid);
	}

	@Override
	public void updata(Employee employee) {
		// TODO Auto-generated method stub
		this.getHibernateTemplate().update(employee);
	}

	@Override
	public void delete(Employee employee) {
		// TODO Auto-generated method stub
		this.getHibernateTemplate().delete(employee);
		
	}


}
