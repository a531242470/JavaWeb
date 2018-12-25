package com.loo.employee.service;

import java.util.List;

import com.loo.employee.domain.Employee;

public interface EmployeeService {

	Employee login(Employee employee);

	List<Employee> finAll();

	void save(Employee employee);

	Employee findById(Integer eid);

	void updata(Employee employee);

	void delete(Employee employee);



}
