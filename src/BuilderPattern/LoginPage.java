package BuilderPattern;

public class LoginPage {
	
	//POJO -- > Plain Old Java Object

	private String username;
	private String password;

	public LoginPage(String username, String password) {
		this.username = username;
		this.password = password;
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

	public void doLogin(LoginPage loginPage) {

		System.out.println("login with : " + loginPage.getUsername() + " " + loginPage.getPassword());
	}

}
