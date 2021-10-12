package SuperKeyword;

public class Cart extends Product{
	
	public Cart() {
		super(10);
		System.out.println("default..const..cart...");
	}
	
	public Cart(int price) {
		super(price);
		System.out.println("default..const..cart...");
	}
	
	int maxPrice = 200;
 
	public void getPrice() {
		System.out.println("cart price: " + maxPrice);
		System.out.println("product price: " + super.maxPrice);
		System.out.println(super.finalPrice + ":" + this.finalPrice);
	}

	@Override
	public void delivery() {
		System.out.println("deliver the product to the given cart address....");
		super.delivery();
	}
	
	public static void main(String[] args) {

		
		Cart obj = new Cart(1000);
		obj.getPrice();
		obj.delivery();
		
	}

}
