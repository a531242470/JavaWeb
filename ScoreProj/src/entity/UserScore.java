package entity;

/**
 * UserScore entity. @author MyEclipse Persistence Tools
 */

public class UserScore implements java.io.Serializable {

	// Fields

	private UserScoreId id;

	// Constructors

	/** default constructor */
	public UserScore() {
	}

	/** full constructor */
	public UserScore(UserScoreId id) {
		this.id = id;
	}

	// Property accessors

	public UserScoreId getId() {
		return this.id;
	}

	public void setId(UserScoreId id) {
		this.id = id;
	}

}