package 일정관리;

public class User {
	String name;
	String id;
	String password;

	public User(String name, String id, String password) {
		this.name = name;
		this.id = id;
		this.password = password;
	}

	public boolean isAdmin() {
		return false;
	}
}
