package JavaSessions;

public class TestCustomer {

	public static void main(String[] args) {

		final int i = 10; //constant vars
		
		System.out.println(i);
		
		int salary = 100;
		final int days = 7;
		int totalAmount = days * salary;
		System.out.println(totalAmount);
		
		
		Customer c1 = new Customer();
		c1.name = "Tom";
		c1.emailId = "tom@gmail.com";
		c1.phone = 9898989;
		c1.isPrime = true;
		
		System.out.println(c1.name);
		System.out.println(Customer.category);
		
		
		//Customer.category = "Sports";
		
		System.out.println(Customer.category);

		
		
	}

}
