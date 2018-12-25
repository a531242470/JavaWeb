package com.loo.employee.dao;

import java.util.List;

import com.loo.employee.domain.Employee;

public interface EmployeeDao {

	Employee finByUsernameAndPassword(Employee employee);

	List<Employee> finAll();

	void save(Employee employee);

	Employee findById(Integer eid);

	void updata(Employee employee);

	void delete(Employee employee);


}
