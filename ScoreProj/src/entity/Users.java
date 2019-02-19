package entity;

/**
 * Users entity. @author MyEclipse Persistence Tools
 */

public class Users implements java.io.Serializable {

	// Fields

	private Integer id;
	private String userName;
	private String password;
	private String name;
	private String department;
	private String type;
	private Integer scoreA1;
	private Integer scoreA2;
	private Integer scoreA3;
	private Integer scoreA4;

	// Constructors

	/** default constructor */
	public Users() {
	}

	/** full constructor */
	public Users(String userName, String password, String name,
			String department, String type, Integer scoreA1, Integer scoreA2,
			Integer scoreA3, Integer scoreA4) {
		this.userName = userName;
		this.password = password;
		this.name = name;
		this.department = department;
		this.type = type;
		this.scoreA1 = scoreA1;
		this.scoreA2 = scoreA2;
		this.scoreA3 = scoreA3;
		this.scoreA4 = scoreA4;
	}
	
	
	

	// Property accessors

	public Users(String userName, String password) {
		super();
		this.userName = userName;
		this.password = password;
	}
	
	

	public Users(String userName) {
		super();
		this.userName = userName;
	}

	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getUserName() {
		return this.userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getPassword() {
		return this.password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDepartment() {
		return this.department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}

	public String getType() {
		return this.type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public Integer getScoreA1() {
		return this.scoreA1;
	}

	public void setScoreA1(Integer scoreA1) {
		this.scoreA1 = scoreA1;
	}

	public Integer getScoreA2() {
		return this.scoreA2;
	}

	public void setScoreA2(Integer scoreA2) {
		this.scoreA2 = scoreA2;
	}

	public Integer getScoreA3() {
		return this.scoreA3;
	}

	public void setScoreA3(Integer scoreA3) {
		this.scoreA3 = scoreA3;
	}

	public Integer getScoreA4() {
		return this.scoreA4;
	}

	public void setScoreA4(Integer scoreA4) {
		this.scoreA4 = scoreA4;
	}

	@Override
	public String toString() {
		return "Users [id=" + id + ", userName=" + userName + ", password="
				+ password + ", name=" + name + ", department=" + department
				+ ", type=" + type + ", scoreA1=" + scoreA1 + ", scoreA2="
				+ scoreA2 + ", scoreA3=" + scoreA3 + ", scoreA4=" + scoreA4
				+ "]";
	}
	

}