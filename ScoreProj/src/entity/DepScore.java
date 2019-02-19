package entity;

/**
 * DepScore entity. @author MyEclipse Persistence Tools
 */

public class DepScore implements java.io.Serializable {

	// Fields

	private Integer id;
	private String usernameA;
	private String nameA;
	private String departmentA;
	private String usernameB;
	private String nameB;
	private String departmentB;
	private Integer score1;
	private Integer score2;
	private Integer score3;
	private Integer score4;
	private String creatTime;
	private String usernameC;
	private String nameC;
	private String upTime;

	// Constructors

	/** default constructor */
	public DepScore() {
	}

	/** full constructor */
	public DepScore(String usernameA, String nameA, String departmentA,
			String usernameB, String nameB, String departmentB, Integer score1,
			Integer score2, Integer score3, Integer score4, String creatTime,
			String usernameC, String nameC, String upTime) {
		this.usernameA = usernameA;
		this.nameA = nameA;
		this.departmentA = departmentA;
		this.usernameB = usernameB;
		this.nameB = nameB;
		this.departmentB = departmentB;
		this.score1 = score1;
		this.score2 = score2;
		this.score3 = score3;
		this.score4 = score4;
		this.creatTime = creatTime;
		this.usernameC = usernameC;
		this.nameC = nameC;
		this.upTime = upTime;
	}

	// Property accessors

	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getUsernameA() {
		return this.usernameA;
	}

	public void setUsernameA(String usernameA) {
		this.usernameA = usernameA;
	}

	public String getNameA() {
		return this.nameA;
	}

	public void setNameA(String nameA) {
		this.nameA = nameA;
	}

	public String getDepartmentA() {
		return this.departmentA;
	}

	public void setDepartmentA(String departmentA) {
		this.departmentA = departmentA;
	}

	public String getUsernameB() {
		return this.usernameB;
	}

	public void setUsernameB(String usernameB) {
		this.usernameB = usernameB;
	}

	public String getNameB() {
		return this.nameB;
	}

	public void setNameB(String nameB) {
		this.nameB = nameB;
	}

	public String getDepartmentB() {
		return this.departmentB;
	}

	public void setDepartmentB(String departmentB) {
		this.departmentB = departmentB;
	}

	public Integer getScore1() {
		return this.score1;
	}

	public void setScore1(Integer score1) {
		this.score1 = score1;
	}

	public Integer getScore2() {
		return this.score2;
	}

	public void setScore2(Integer score2) {
		this.score2 = score2;
	}

	public Integer getScore3() {
		return this.score3;
	}

	public void setScore3(Integer score3) {
		this.score3 = score3;
	}

	public Integer getScore4() {
		return this.score4;
	}

	public void setScore4(Integer score4) {
		this.score4 = score4;
	}

	public String getCreatTime() {
		return this.creatTime;
	}

	public void setCreatTime(String creatTime) {
		this.creatTime = creatTime;
	}

	public String getUsernameC() {
		return this.usernameC;
	}

	public void setUsernameC(String usernameC) {
		this.usernameC = usernameC;
	}

	public String getNameC() {
		return this.nameC;
	}

	public void setNameC(String nameC) {
		this.nameC = nameC;
	}

	public String getUpTime() {
		return this.upTime;
	}

	public void setUpTime(String upTime) {
		this.upTime = upTime;
	}

	@Override
	public String toString() {
		return "DepScore [id=" + id + ", usernameA=" + usernameA + ", nameA="
				+ nameA + ", departmentA=" + departmentA + ", usernameB="
				+ usernameB + ", nameB=" + nameB + ", departmentB="
				+ departmentB + ", score1=" + score1 + ", score2=" + score2
				+ ", score3=" + score3 + ", score4=" + score4 + ", creatTime="
				+ creatTime + ", usernameC=" + usernameC + ", nameC=" + nameC
				+ ", upTime=" + upTime + "]";
	}
	
	

}