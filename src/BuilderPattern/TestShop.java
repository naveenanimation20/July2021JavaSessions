package BuilderPattern;

public class TestShop {

	public static void main(String[] args) {

		
		Shopping shop = new Shopping();
		
		shop
			.login("naveen@gmail.com", "naveen@123")
				.doSearch("macbook pro")
					.addToCart("macbook pro")
						.doPayment("1212 3333 2222 1111", 3456)
							.checkOrder("macbook pro")
								.logout();
		
		System.out.println("--------");
		
		shop.login(98987898, 1234)
			.checkOrder("macbook pro")
				.logout();
		
		System.out.println("--------");
		shop
			.doSearch("Tshirt", "Black")
				.logout();
		
		System.out.println("--------");

		shop.logout();
		System.out.println("--------");

		shop.login(98987898, 1234)
			.doPayment("1212 3333 2222 1111", 3456)
				.logout();
			
		System.out.println("--------");

		Employee e1 = new Employee();
		String name = e1.getEmpInfo().getName();
		System.out.println(name);
		
		Browser.m1();
	}

}
