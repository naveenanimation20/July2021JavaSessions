package JavaSessions;

public class EComm {

	// method overloading:
	// within the same class when we have diff methods:
	// 1. with the same name
	// 2. with different types and number of parameters
	// 3. the sequence of the params should be different

	// Compile (static)(early binding) poly+morphism --> differnt forms -->

//	public void login() {//0
//		System.out.println("login");
//	}
//	
//	public void login(int a) {//1
//		System.out.println("login " + a);
//	}
//	
//	public void login(int a, int b) {//2
//		System.out.println("login " + a + b);
//	}
//	
//	public void login(int a, String b) {//2
//		System.out.println("login " + a + b);
//	}
//	
//	public String login(String a, int b) {//2
//		System.out.println("login " + a + b);
//		return a+b;
//	}

	public void login() {
		System.out.println("default login");
	}

	public void login(String un, String pwd) { // parameters
		System.out.println("login with : " + un + pwd);
	}

	public void login(String un, String pwd, String role) {
		System.out.println("login with : " + un + pwd + role);
	}

	public void login(String un, String pwd, int otp) {
		System.out.println("login with : " + un + pwd + otp);
	}

	public void login(long ph, int otp) {
		System.out.println("login with : " + ph + otp);
	}

	//
	public void search() {

	}

	public void search(String name) {

	}

	public void search(String name, int price) {

	}

	public void search(String name, String sellerName) {

	}

	//
	public void booking() {

	}

	public void booking(String carType, String from, String to) {

	}
	
	public void booking(String carType, String from, String to, int users) {

	}
	
	//payment

	public static void main(String[] args) {

		EComm obj = new EComm();
		obj.login("admin", "admin123");// arguments

	}

}
