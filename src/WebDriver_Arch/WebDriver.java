package WebDriver_Arch;

public interface WebDriver extends SearchContext {

	@Override
	public void findElement();

	@Override
	public void findElements();

	public String getTitle();

	public void launchUrl(String url);

	public String getUrl();

	public void click();

	public void sendKeys(String value);

	public void close();

}
