package JavaSessions;

public class ConditionalOperators {

	public static void main(String[] args) {

		int a = 10;
		int b = 20;

		System.out.println(a == b);

		if (a == b) {
			System.out.println("both are equal");
		} else {
			System.out.println("both are not equal");
		}

		// dead code:
		if (true) {
			System.out.println("PASS");
		} else {
			System.out.println("FAIL");
		}

		boolean flag = true;
		if (flag) {
			System.out.println("ele is visible");
		} else {
			System.out.println("ele is not visible");
		}

		int total = 60;
		if (total <= 100) {
			System.out.println("total is less than or eq to 100");
			if (total >= 80) {
				System.out.println("total is gr than or eq to 80");
				if (total == 80) {
					System.out.println("GRADE A");
				} else {
					System.out.println("PASS");
				}

			} else {
				System.out.println("NA");
			}
		} else {
			System.out.println("BYE");
		}

		// logic -- to launch the browser - ch, ff, safari
		// String browser = "safari";

//		if(browser.equals("chrome")) {
//			System.out.println("chrome launch");
//		}
//		if(browser.equals("firefox")) {
//			System.out.println("ff launch");
//		}
//		if(browser.equals("safari")) {
//			System.out.println("safari launch");
//		}
//		else {
//			System.out.println("Plz pass the right browser name");
//		}

		String browser = "chrome";

		if (browser.equals("chrome")) {
			System.out.println("chrome launch");
		}
		else if(browser.equals("firefox")) {
			System.out.println("ff launch");
		}
		else if(browser.equals("safari")) {
			System.out.println("safari launch");
		}
		else {
			System.out.println("Plz pass the right browser name");
		}
		
		
		//WAP - three diff numbers -- find out the highest number
		int x = 500;
		int y = 600;
		int z = 800;
		//&& - short circuit operator
		if(x>y && x>z) {//false && false ==> false
			System.out.println("x is the highest");
		}
		else if(y>z) {//true
			System.out.println("y is the highest");
		}
		else {
			System.out.println("z is the highest");
		}
		
		
		

	}

}
