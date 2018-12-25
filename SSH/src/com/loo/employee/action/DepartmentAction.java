package com.loo.employee.action;

import java.util.List;

import com.loo.employee.domain.Department;
import com.loo.employee.domain.PageBean;
import com.loo.employee.service.DepartmentService;
import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;

public class DepartmentAction extends ActionSupport implements ModelDriven<Department> {
	private Department department=new Department();
	@Override
	public Department getModel() {
		// TODO Auto-generated method stub
		return department;
	}
	private DepartmentService departmentService;
	
	
	public void setDepartmentService(DepartmentService departmentService) {
		this.departmentService = departmentService;
	}
	
	
	
	public String findAll(){
		List<Department> list=departmentService.findAllDepartment();
		ActionContext.getContext().getSession().put("departments",list);
		return "findAll";
	}
	public String saveUI(){
		
		return "saveUI";
		
	}
	public String save(){
		departmentService.save(department);
		
		return "save_success";
	}
	public String edit(){
		department=departmentService.findById(department.getDid());
		return "edit_success";
		
	}
	public String updata(){
		departmentService.updata(department);
		return "updata_success";
		
	}
	public String delete(){
		department=departmentService.findById(department.getDid());
		departmentService.delete(department);
		return "delete_success";
		
		
	}

}
