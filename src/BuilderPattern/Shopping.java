package BuilderPattern;

public class Shopping {

	public Shopping login(long ph, int otp) {
		System.out.println("login to app with : " + ph + ":" + otp);
		return this;
	}

	public Shopping login(String un, String pwd) {
		System.out.println("login to app with : " + un + ":" + pwd);
		return this;
	}

	public Shopping doSearch(String productName) {
		System.out.println("do search with : " + productName);
		return this;

	}

	public Shopping doSearch(String productName, String color) {
		System.out.println("do search with : " + productName + " : " + color);
		return this;

	}

	public Shopping addToCart(String productName) {
		System.out.println("adding to cart: " + productName);
		return this;

	}

	public Shopping doPayment(String cc, int otp) {
		System.out.println("making payment with: " + cc + otp);
		return this;

	}

	public Shopping doPayment(String UPI, int otp, int code) {
		System.out.println("making payment with: " + UPI + otp + code);
		return this;

	}

	public Shopping doPayment(long ccNumber, String password) {
		System.out.println("making payment with: " + ccNumber + password);
		return this;

	}

	public Shopping checkOrder(String productName) {
		System.out.println("product: " + productName + " order id is : 1234");
		return this;

	}

	public Shopping logout() {
		System.out.println("logout from application");
		return this;

	}

}
