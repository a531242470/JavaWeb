package entity;

/**
 * Department entity. @author MyEclipse Persistence Tools
 */

public class Department implements java.io.Serializable {

	// Fields

	private Integer id;
	private String departmentName;
	private String departmentBoss;

	// Constructors

	/** default constructor */
	public Department() {
	}

	/** full constructor */
	public Department(String departmentName, String departmentBoss) {
		this.departmentName = departmentName;
		this.departmentBoss = departmentBoss;
	}
	

	// Property accessors

	public Integer getId() {
		return this.id;
	}

	public Department(String departmentName) {
		super();
		this.departmentName = departmentName;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getDepartmentName() {
		return this.departmentName;
	}

	public void setDepartmentName(String departmentName) {
		this.departmentName = departmentName;
	}

	public String getDepartmentBoss() {
		return this.departmentBoss;
	}

	public void setDepartmentBoss(String departmentBoss) {
		this.departmentBoss = departmentBoss;
	}

}