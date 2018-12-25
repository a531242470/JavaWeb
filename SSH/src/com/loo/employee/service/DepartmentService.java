package com.loo.employee.service;

import java.util.List;

import com.loo.employee.dao.DepartmentDao;
import com.loo.employee.domain.Department;
import com.loo.employee.domain.PageBean;

public interface DepartmentService {

	List<Department> findAllDepartment();

	void save(Department department);

	Department findById(Integer did);

	void updata(Department department);

	void delete(Department department);



}
