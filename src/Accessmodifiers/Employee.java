package Accessmodifiers;

public class Employee extends Company{
	
	
	@Override
	public void table() {
		System.out.println("table....");
	}
	
	private void colm() {
		System.out.println("colm...");
	}
	
	@Override
	protected void row() {
		System.out.println("row...");
	}
	
	@Override
	void test() {

	}
	

	public static void main(String[] args) {

		Employee e = new Employee();
		e.name = "IBM";
		e.hq = "NY";
		e.address = "test address";
		
		
		
	}

}
