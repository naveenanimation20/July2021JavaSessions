package AccMod;

import Accessmodifiers.Company;

public class Category extends Company{
	
	
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
	
	//@Override
	void test() {

	}
	

	public static void main(String[] args) {

		
		Category cg = new Category();
		cg.name = "MS";
		cg.hq = "HYD";
		
		
	}

}
