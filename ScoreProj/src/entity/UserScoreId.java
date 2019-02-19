package entity;

import java.util.Date;

/**
 * UserScoreId entity. @author MyEclipse Persistence Tools
 */

public class UserScoreId implements java.io.Serializable {

	// Fields

	private String usernameA;
	private String nameA;
	private String departmentA;
	private String usernameB;
	private String nameB;
	private String departmentB;
	private String score1;
	private String score2;
	private String score3;
	private Date creatTime;
	private String usernameC;
	private String nameC;
	private Date upTime;

	// Constructors

	/** default constructor */
	public UserScoreId() {
	}

	/** full constructor */
	public UserScoreId(String usernameA, String nameA, String departmentA,
			String usernameB, String nameB, String departmentB, String score1,
			String score2, String score3, Date creatTime, String usernameC,
			String nameC, Date upTime) {
		this.usernameA = usernameA;
		this.nameA = nameA;
		this.departmentA = departmentA;
		this.usernameB = usernameB;
		this.nameB = nameB;
		this.departmentB = departmentB;
		this.score1 = score1;
		this.score2 = score2;
		this.score3 = score3;
		this.creatTime = creatTime;
		this.usernameC = usernameC;
		this.nameC = nameC;
		this.upTime = upTime;
	}

	// Property accessors

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

	public String getScore1() {
		return this.score1;
	}

	public void setScore1(String score1) {
		this.score1 = score1;
	}

	public String getScore2() {
		return this.score2;
	}

	public void setScore2(String score2) {
		this.score2 = score2;
	}

	public String getScore3() {
		return this.score3;
	}

	public void setScore3(String score3) {
		this.score3 = score3;
	}

	public Date getCreatTime() {
		return this.creatTime;
	}

	public void setCreatTime(Date creatTime) {
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

	public Date getUpTime() {
		return this.upTime;
	}

	public void setUpTime(Date upTime) {
		this.upTime = upTime;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof UserScoreId))
			return false;
		UserScoreId castOther = (UserScoreId) other;

		return ((this.getUsernameA() == castOther.getUsernameA()) || (this
				.getUsernameA() != null && castOther.getUsernameA() != null && this
				.getUsernameA().equals(castOther.getUsernameA())))
				&& ((this.getNameA() == castOther.getNameA()) || (this
						.getNameA() != null && castOther.getNameA() != null && this
						.getNameA().equals(castOther.getNameA())))
				&& ((this.getDepartmentA() == castOther.getDepartmentA()) || (this
						.getDepartmentA() != null
						&& castOther.getDepartmentA() != null && this
						.getDepartmentA().equals(castOther.getDepartmentA())))
				&& ((this.getUsernameB() == castOther.getUsernameB()) || (this
						.getUsernameB() != null
						&& castOther.getUsernameB() != null && this
						.getUsernameB().equals(castOther.getUsernameB())))
				&& ((this.getNameB() == castOther.getNameB()) || (this
						.getNameB() != null && castOther.getNameB() != null && this
						.getNameB().equals(castOther.getNameB())))
				&& ((this.getDepartmentB() == castOther.getDepartmentB()) || (this
						.getDepartmentB() != null
						&& castOther.getDepartmentB() != null && this
						.getDepartmentB().equals(castOther.getDepartmentB())))
				&& ((this.getScore1() == castOther.getScore1()) || (this
						.getScore1() != null && castOther.getScore1() != null && this
						.getScore1().equals(castOther.getScore1())))
				&& ((this.getScore2() == castOther.getScore2()) || (this
						.getScore2() != null && castOther.getScore2() != null && this
						.getScore2().equals(castOther.getScore2())))
				&& ((this.getScore3() == castOther.getScore3()) || (this
						.getScore3() != null && castOther.getScore3() != null && this
						.getScore3().equals(castOther.getScore3())))
				&& ((this.getCreatTime() == castOther.getCreatTime()) || (this
						.getCreatTime() != null
						&& castOther.getCreatTime() != null && this
						.getCreatTime().equals(castOther.getCreatTime())))
				&& ((this.getUsernameC() == castOther.getUsernameC()) || (this
						.getUsernameC() != null
						&& castOther.getUsernameC() != null && this
						.getUsernameC().equals(castOther.getUsernameC())))
				&& ((this.getNameC() == castOther.getNameC()) || (this
						.getNameC() != null && castOther.getNameC() != null && this
						.getNameC().equals(castOther.getNameC())))
				&& ((this.getUpTime() == castOther.getUpTime()) || (this
						.getUpTime() != null && castOther.getUpTime() != null && this
						.getUpTime().equals(castOther.getUpTime())));
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result
				+ (getUsernameA() == null ? 0 : this.getUsernameA().hashCode());
		result = 37 * result
				+ (getNameA() == null ? 0 : this.getNameA().hashCode());
		result = 37
				* result
				+ (getDepartmentA() == null ? 0 : this.getDepartmentA()
						.hashCode());
		result = 37 * result
				+ (getUsernameB() == null ? 0 : this.getUsernameB().hashCode());
		result = 37 * result
				+ (getNameB() == null ? 0 : this.getNameB().hashCode());
		result = 37
				* result
				+ (getDepartmentB() == null ? 0 : this.getDepartmentB()
						.hashCode());
		result = 37 * result
				+ (getScore1() == null ? 0 : this.getScore1().hashCode());
		result = 37 * result
				+ (getScore2() == null ? 0 : this.getScore2().hashCode());
		result = 37 * result
				+ (getScore3() == null ? 0 : this.getScore3().hashCode());
		result = 37 * result
				+ (getCreatTime() == null ? 0 : this.getCreatTime().hashCode());
		result = 37 * result
				+ (getUsernameC() == null ? 0 : this.getUsernameC().hashCode());
		result = 37 * result
				+ (getNameC() == null ? 0 : this.getNameC().hashCode());
		result = 37 * result
				+ (getUpTime() == null ? 0 : this.getUpTime().hashCode());
		return result;
	}

}