package OOP_AbstractConcept;

public class TestPage {

	public static void main(String[] args) {

		LoginPage lp = new LoginPage(10);
		lp.title();
		lp.header();
		lp.timeOut();
		lp.logo();
		Page.getUrl();
		
		
		//top casting:
		Page p = new LoginPage(10);
		p.title();
		p.header();
		
		//down casting: not allowed
		//new Page();

		
	}

}
