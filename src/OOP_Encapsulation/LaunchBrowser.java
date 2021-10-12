package OOP_Encapsulation;

public class LaunchBrowser {

	public void launchBrowser() {
		System.out.println("launching chrome");
		checkRAM();
		checkOSCompatible();
		checkStorage();
		System.out.println("chrome is launched");
	}

	private void checkRAM() {
		System.out.println("checking ram");
	}

	private void checkOSCompatible() {
		System.out.println("checkOSCompatible");
	}

	private void checkStorage() {
		System.out.println("checkStorage");

	}

}
