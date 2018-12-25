package com.loo.employee.service.impl;

import java.util.List;

import org.springframework.transaction.annotation.Transactional;

import com.loo.employee.dao.EmployeeDao;
import com.loo.employee.domain.Employee;
import com.loo.employee.service.EmployeeService;

@Transactional
public class EmployeeServiceImpl implements EmployeeService{
	private EmployeeDao employeeDao;

	public void setEmployeeDao(EmployeeDao employeeDao) {
		this.employeeDao = employeeDao;
	}

	@Override
	public Employee login(Employee employee) {
		// TODO Auto-generated method stub
		Employee rEmployee= employeeDao.finByUsernameAndPassword(employee);
		
		return rEmployee;
	}

	@Override
	public List<Employee> finAll() {
		// TODO Auto-generated method stub
		List<Employee> list=employeeDao.finAll();
		return list;
	}

	@Override
	public void save(Employee employee) {
		// TODO Auto-generated method stub
		//employee.setEid(getNewEid());
			employeeDao.save(employee);
	
	}

	public Integer getNewEid(){
		
		List<Employee> list=finAll();
		Integer i=list.get(list.size()-1).getEid();
		return i+1;
	}

	@Override
	public Employee findById(Integer eid) {
		// TODO Auto-generated method stub
		Employee employee=employeeDao.findById(eid);
		return employee;
	}

	@Override
	public void updata(Employee employee) {
		// TODO Auto-generated method stub
		System.out.println(employee);
		employeeDao.updata(employee);
	}

	@Override
	public void delete(Employee employee) {
		// TODO Auto-generated method stub
		employeeDao.delete(employee);
	}






	
	
}
