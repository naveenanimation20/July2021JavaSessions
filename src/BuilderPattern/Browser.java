package BuilderPattern;

public class Browser {

	// method chaining
	public void launch() {
		checkRAM();
	}

	public void checkRAM() {
		checkOS();
	}

	public void checkOS() {
		System.out.println("check OS");
	}

	public static void m1() {
		m2();
	}

	public static void m2() {
		m3();
	}

	public static void m3() {
		System.out.println("BYE");
	}

	public static void main(String[] args) {

		Browser br = new Browser();
		br.launch();
		m1();
	}

}
