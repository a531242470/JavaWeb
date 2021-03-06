package com.loo.employee.domain;

import java.util.Date;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import org.hibernate.annotations.GenericGenerator;


@Entity
public class Employee {
	@Id
	@GeneratedValue(generator="eid",strategy =GenerationType.AUTO)
	@GenericGenerator(name="eid",strategy="increment")
	@Column(length=4)
	private Integer eid;
	private String ename;
	private String sex;
	private Date birthday;
	private Date joinDate;
	private String eno;
	private String username;
	private String password;
	
	
	@ManyToOne(fetch=FetchType.EAGER)
	@JoinColumn(name="dno")
	private Department department;
	
	
	

	

	public Employee() {
		super();
	}


	



	public Employee(Integer eid, String ename, String sex, Date birthday, Date joinDate, String eno, String username,
			String password, Department department) {
		super();
		this.eid = eid;
		this.ename = ename;
		this.sex = sex;
		this.birthday = birthday;
		this.joinDate = joinDate;
		this.eno = eno;
		this.username = username;
		this.password = password;
		this.department = department;
	}



	public Integer getEid() {
		return eid;
	}



	public void setEid(Integer eid) {
		this.eid = eid;
	}



	public String getEname() {
		return ename;
	}



	public void setEname(String ename) {
		this.ename = ename;
	}



	public String getSex() {
		return sex;
	}



	public void setSex(String sex) {
		this.sex = sex;
	}



	public Date getBirthday() {
		return birthday;
	}



	public void setBirthday(Date birthday) {
		this.birthday = birthday;
	}



	public Date getJoinDate() {
		return joinDate;
	}



	public void setJoinDate(Date joinDate) {
		this.joinDate = joinDate;
	}



	public String getEno() {
		return eno;
	}



	public void setEno(String eno) {
		this.eno = eno;
	}



	public String getUsername() {
		return username;
	}



	public void setUsername(String username) {
		this.username = username;
	}



	public String getPassword() {
		return password;
	}



	public void setPassword(String password) {
		this.password = password;
	}



	public Department getDepartment() {
		return department;
	}



	public void setDepartment(Department department) {
		this.department = department;
	}






	@Override
	public String toString() {
		return "Employee [eid=" + eid + ", ename=" + ename + ", sex=" + sex + ", birthday=" + birthday + ", joinDate="
				+ joinDate + ", eno=" + eno + ", username=" + username + ", password=" + password + ", department="
				+ department + "]";
	} 
	
	
	
	
}
