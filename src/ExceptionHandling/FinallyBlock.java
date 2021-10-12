package ExceptionHandling;

public class FinallyBlock {

	public static int getNum(String name) {

		if (name.equals("Tom")) {
			try {
				int marks = 90 / 2;
				//System.exit(0);
				return marks;
			} catch (ArithmeticException e) {
				return 40;
			} finally {
				return 10;
			}
		} else if (name.equals("Ravi")) {
			return 100;
		} else {
			return 50;
		}

	}

	public static void main(String[] args) {

		System.out.println(getNum("Tom"));

		int a = 10;
		int b = 0;

		System.out.println("test");

		try {
			int div = a / b;
			// DB connection -- connected
			// hit SQL -- no exception
			/// results
			// using result
		} catch (ArithmeticException e) {
			System.out.println("AE is coming...");
		} finally {
			System.out.println("end....");
			// close the connection
		}

		System.out.println("Bye....");

	}

}
