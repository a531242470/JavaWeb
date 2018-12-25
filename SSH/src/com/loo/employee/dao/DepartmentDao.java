package com.loo.employee.dao;

import java.util.List;

import com.loo.employee.domain.Department;

public interface DepartmentDao {

	List<Department> finAllDepartment();

	void save(Department department);

	Department findById(Integer did);

	void updata(Department department);

	void delete(Department department);

	Department findByName(String name);

	
	

}
