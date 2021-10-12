package Accessmodifiers;

public class Company {

	// vars
	public String name;
	private int sharePrice;
	protected String hq;
	String address;

	// methods:
	void test() {

	}

	protected void row() {
		System.out.println("row...");
	}

	private void colm() {
		System.out.println("colm...");
	}

	public void table() {
		System.out.println("table....");
	}

	public static void main(String[] args) {

		Company c = new Company();
		c.name = "IBM";
		c.sharePrice = 100;

	}

}
