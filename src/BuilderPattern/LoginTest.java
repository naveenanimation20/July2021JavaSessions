package BuilderPattern;

public class LoginTest {

	public static void main(String[] args) {

		LoginPage lp = new LoginPage("admin", "admin123");
		
		lp.doLogin(lp);
		
		
		
		
	}

}
