package com.loo.employee.action;

import java.util.List;

import com.loo.employee.domain.Department;
import com.loo.employee.domain.Employee;
import com.loo.employee.service.DepartmentService;
import com.loo.employee.service.EmployeeService;
import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;

public class EmployeeAction  extends ActionSupport implements ModelDriven<Employee>{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private Employee employee=new Employee();

	@Override
	public Employee getModel() {
		// TODO Auto-generated method stub
		return employee;
	}
	
	private EmployeeService employeeService;
	private DepartmentService departmentService;
	
	
	
	
	public void setDepartmentService(DepartmentService departmentService) {
		this.departmentService = departmentService;
	}



	public void setEmployeeService(EmployeeService employeeService) {
		this.employeeService = employeeService;
	}



	public String login(){
		System.out.println("login 执行");
		Employee rEmployee=employeeService.login(employee);
		if(rEmployee==null){
			this.addActionError("用户名或密码错误");
			return INPUT;
		}else {
			ActionContext.getContext().getSession().put("rEmployee", rEmployee);
			return SUCCESS;
		}
	}
	
	public String findAll(){
		List<Employee> elist=employeeService.finAll();
		ActionContext.getContext().getSession().put("employees", elist);
		
		return "efindAll";
	}
	public String saveUI(){
		List<Department> list=departmentService.findAllDepartment();
		ActionContext.getContext().getValueStack().set("list", list);
		return "esaveUI";
	}
	public String save(){

		
		employeeService.save(employee);
		//employeeService.save(employee);
		return "esave_success";
	}
	
	public String edit(){
		
		employee=employeeService.findById(employee.getEid());
		ActionContext.getContext().getSession().put("oldEmployee",employee);
		List<Department> list=departmentService.findAllDepartment();
		ActionContext.getContext().getValueStack().set("list", list);
		return "eedit_success";
	}
	public String updata(){
		employeeService.updata(employee);
		
		return "eupdata_success";
	}
	public String delete(){
		
		Employee demployee=employeeService.findById(employee.getEid());
		employeeService.delete(demployee);
		
		return "edelete_success";
		
		
	}

	
}
