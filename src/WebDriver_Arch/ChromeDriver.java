package WebDriver_Arch;

public class ChromeDriver implements WebDriver {

	public ChromeDriver() {
		System.out.println("launch chrome....");
	}

	@Override
	public void findElement() {
		System.out.println("findElement");
	}

	@Override
	public void findElements() {
		System.out.println("findElements");

	}

	@Override
	public String getTitle() {
		return "title of the page";
	}

	@Override
	public void launchUrl(String url) {
		System.out.println("launching the url : " + url);
	}

	@Override
	public String getUrl() {
		return "http://www.amazon.in";
	}

	@Override
	public void click() {
		System.out.println("click on element");
	}

	@Override
	public void sendKeys(String value) {
		System.out.println("enter the value: " + value);
	}

	@Override
	public void close() {
		System.out.println("browser is closed....");
	}

}
