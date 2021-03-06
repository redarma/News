package in.shivasoft.pojo;

// Generated 11-jul-2014 12:05:59 by Hibernate Tools 3.4.0.CR1

/**
 * Users generated by hbm2java
 */
public class Users implements java.io.Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private long UserId;
	private String FName;
	private String LName;
	private long UserTypeId;
	private String UserName;
	private String Email;
	private String Pwd;
	private String Note;
	private boolean IsActive;

	public Users() {
	}

	public Users(long UserId) {
		this.UserId = UserId;
	}

	public Users(long UserId, String FName, String LName, long UserTypeId,
			String UserName, String Email, String Pwd, String Note,
			boolean IsActive) {
		this.UserId = UserId;
		this.FName = FName;
		this.LName = LName;
		this.UserTypeId = UserTypeId;
		this.UserName = UserName;
		this.Email = Email;
		this.Pwd = Pwd;
		this.Note = Note;
		this.IsActive = IsActive;
	}

	public long getUserId() {
		return this.UserId;
	}

	public void setUserId(long UserId) {
		this.UserId = UserId;
	}

	public String getFName() {
		return this.FName;
	}

	public void setFName(String FName) {
		this.FName = FName;
	}

	public String getLName() {
		return this.LName;
	}

	public void setLName(String LName) {
		this.LName = LName;
	}

	public long getUserTypeId() {
		return this.UserTypeId;
	}

	public void setUserTypeId(long UserTypeId) {
		this.UserTypeId = UserTypeId;
	}

	public String getUserName() {
		return this.UserName;
	}

	public void setUserName(String UserName) {
		this.UserName = UserName;
	}

	public String getEmail() {
		return this.Email;
	}

	public void setEmail(String Email) {
		this.Email = Email;
	}

	public String getPwd() {
		return this.Pwd;
	}

	public void setPwd(String Pwd) {
		this.Pwd = Pwd;
	}

	public String getNote() {
		return this.Note;
	}

	public void setNote(String Note) {
		this.Note = Note;
	}

	public boolean isIsActive() {
		return this.IsActive;
	}

	public void setIsActive(boolean IsActive) {
		this.IsActive = IsActive;
	}

}
