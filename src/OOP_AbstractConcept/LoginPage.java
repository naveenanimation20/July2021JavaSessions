package OOP_AbstractConcept;

public class LoginPage extends Page{

//	public LoginPage() {
//		System.out.println("login page .. default const...");
//	}
	
	public LoginPage(int a) {
		System.out.println("login page .. param const..." + a);
	}
	
	@Override
	public void title() {
		System.out.println("LP -- title");
	}

	@Override
	public void header() {
		System.out.println("LP -- header");

	}
	
	public void doLogin() {
		System.out.println("login to app");
	}
	
	@Override
	public void timeOut() {
		System.out.println("default page time out is : " + 5);
	}

}
