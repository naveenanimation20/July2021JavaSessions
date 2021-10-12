package SuperKeyword;

public class Product {
	int finalPrice;

	public Product() {
		System.out.println("defalt const...");
	}

	public Product(String name) {
		System.out.println("1 param const..." + name);
	}

	public Product(int price) {
		System.out.println("1 param const..." );
		this.finalPrice = price + 10;
	}

	int maxPrice = 100;

	public void delivery() {
		System.out.println("deliver the product to the given address....");
	}

	public static void main(String[] args) {

		Product p = new Product();
		System.out.println(p.maxPrice);

	}

}
