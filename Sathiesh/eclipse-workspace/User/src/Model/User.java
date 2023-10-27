package Model;

public class User 
{
	private int userId;
	private String userName;
	private String city;
	private String state;
	public User()
	{
		
	}
	public User(int userId, String userName, String city, String state) {
		super();
		this.userId = userId;
		this.userName = userName;
		this.city = city;
		this.state = state;
	}
	public int getUserId() {
		return userId;
	}
	public void setUserId(int userId) {
		this.userId = userId;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	@Override
	public String toString() {
		return "User [userId=" + userId + ", userName=" + userName + ", city=" + city + ", state=" + state + "]";
	}
	
	

}
