package com.loo.employee.service.impl;

import java.util.List;

import org.springframework.transaction.annotation.Transactional;

import com.loo.employee.dao.DepartmentDao;
import com.loo.employee.domain.Department;
import com.loo.employee.domain.PageBean;
import com.loo.employee.service.DepartmentService;
@Transactional
public class DepartmentServiceImpl implements DepartmentService{
	private DepartmentDao departmentDao;

	public void setDepartmentDao(DepartmentDao departmentDao) {
		this.departmentDao = departmentDao;
	}

	@Override
	public List<Department> findAllDepartment() {
		// TODO Auto-generated method stub
		List<Department> list=departmentDao.finAllDepartment();
		return list;
	}

	@Override
	public void save(Department department) {
		// TODO Auto-generated method stub
		departmentDao.save(department);
		
	}

	@Override
	public Department findById(Integer did) {
		// TODO Auto-generated method stub
		return departmentDao.findById(did);
	}

	@Override
	public void updata(Department department) {
		// TODO Auto-generated method stub
		departmentDao.updata(department);
	}

	@Override
	public void delete(Department department) {
		// TODO Auto-generated method stub
		departmentDao.delete(department);
		
	}
	public Department findByName(String name){
		
		
		return departmentDao.findByName(name);
		
		
	}


	
	
}
