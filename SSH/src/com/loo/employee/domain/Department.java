package com.loo.employee.domain;

import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;

import org.hibernate.annotations.GenericGenerator;

/**
 * @author Administrator
 *
 */
@Entity
public class Department {
	@Id
	@GeneratedValue(generator="did")
	@GenericGenerator(name="did",strategy="assigned")
	@Column(length=4)
	private Integer did;
	private String dname;
	private String ddesc;
	

	
	
	

	public Department() {
		super();
	}

	public Department(Integer did, String dname, String ddesc) {
		super();
		this.did = did;
		this.dname = dname;
		this.ddesc = ddesc;
	
	}

	public Integer getDid() {
		return did;
	}

	public void setDid(Integer did) {
		this.did = did;
	}

	public String getDname() {
		return dname;
	}

	public void setDname(String dname) {
		this.dname = dname;
	}

	public String getDdesc() {
		return ddesc;
	}

	public void setDdesc(String ddesc) {
		this.ddesc = ddesc;
	}


	
	
	

}
