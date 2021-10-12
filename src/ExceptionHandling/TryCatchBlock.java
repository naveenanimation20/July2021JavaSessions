package ExceptionHandling;

public class TryCatchBlock {
	String name = "Selenium";

	public static void main(String[] args) {

		int a = 10;
		int b = 0;

		System.out.println("A");
		System.out.println("A");
		System.out.println("A");

		try {
			int i = a / b;
			TryCatchBlock obj = null;
			System.out.println(obj.name);//NPE
			System.out.println("hi");
			System.out.println("hi");
			System.out.println("hi");
			System.out.println("hi");

		} catch (ArithmeticException e) {
			System.out.println("AE is coming....");
			e.printStackTrace();
		} 
		catch (NullPointerException e) {
			System.out.println("NPE is coming....");
			e.printStackTrace();
		}

		System.out.println("B");
		System.out.println("B");
		System.out.println("B");

	}

}
