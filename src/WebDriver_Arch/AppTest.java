package WebDriver_Arch;

public class AppTest {

	static WebDriver driver;

	public static void main(String[] args) {

		String browser = "ie";

		// top casting:

		if (browser.equals("chrome")) {
			driver = new ChromeDriver();
		} else if (browser.equals("firefox")) {
			driver = new FirefoxDriver();
		} else if (browser.equals("safari")) {
			driver = new SafariDriver();
		} else {
			System.out.println("plz pass the right browser....");
		}

		driver.launchUrl("http://www.amazon.com");

		System.out.println(driver.getTitle());
		System.out.println(driver.getUrl());

		driver.findElement();
		driver.findElements();

		driver.sendKeys("naveen");
		driver.sendKeys("naveen@gmail.com");
		driver.click();

		driver.close();

	}

}
