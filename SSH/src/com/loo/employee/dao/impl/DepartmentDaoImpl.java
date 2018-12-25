package com.loo.employee.dao.impl;

import java.util.List;

import org.hibernate.criterion.DetachedCriteria;
import org.springframework.orm.hibernate4.support.HibernateDaoSupport;

import com.loo.employee.dao.DepartmentDao;
import com.loo.employee.domain.Department;

public class DepartmentDaoImpl extends HibernateDaoSupport  implements DepartmentDao{

	@Override
	public List<Department> finAllDepartment() {
		// TODO Auto-generated method stub
		DetachedCriteria criteria=DetachedCriteria.forClass(Department.class);
		
		List<Department> list=(List<Department>) this.getHibernateTemplate().findByCriteria(criteria);
		
		return list;
	}

	@Override
	public void save(Department department) {
		// TODO Auto-generated method stub
		department.setDid(getNewId());
		this.getHibernateTemplate().save(department);
	}

	public	Integer getNewId(){
		List<Department> list=finAllDepartment();
		Integer i=list.get(list.size()-1).getDid();
		return i+1;
		
		
	}

	@Override
	public Department findById(Integer did) {
		// TODO Auto-generated method stub
		return this.getHibernateTemplate().get(Department.class, did);
	}

	@Override
	public void updata(Department department) {
		// TODO Auto-generated method stub
		this.getHibernateTemplate().update(department);
	}

	@Override
	public void delete(Department department) {
		// TODO Auto-generated method stub
		this.getHibernateTemplate().delete(department);
	}

	@Override
	public Department findByName(String name) {
		// TODO Auto-generated method stub
		String hql="from department where dname = ?";
		List<Department> list=(List<Department>) this.getHibernateTemplate().find(hql, name);
		return list.get(0);
	}

	

}
