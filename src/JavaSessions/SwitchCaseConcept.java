package JavaSessions;

public class SwitchCaseConcept {

	public static void main(String[] args) {

		// logic - launch browser -- ch/ff/safari

		String browser = "chrome";

		switch (browser) {

		case "chrome":
			System.out.println("launch chrome");
			String version = "90";
			switch (version) {
			case "90":
				System.out.println("launch chrome 90");
				
				break;

			case "80":
				System.out.println("launch chrome 90");
				break;

			default:
				break;
			}

			break;

		case "firefox":
			System.out.println("launch ff");
			break;

		case "safari":
			System.out.println("launch safari");
			break;

		default:
			System.out.println("please pass the right browser...." + browser);
			break;
		}

		// diff envs -> QA, DEV, STAGE, PROD
		String env = "QA";

		switch (env.toUpperCase()) {
		case "QA":
			System.out.println("url : " + "http://www.qa.abc.com");
			System.out.println("qa:qa");
			break;
		case "DEV":
			System.out.println("url : " + "http://www.dev.abc.com");
			System.out.println("dev:dev");
			break;
		case "STAGE":
			System.out.println("url : " + "http://www.stage.abc.com");
			System.out.println("stg:stg");
			break;
		case "PROD":
			System.out.println("url : " + "http://www.abc.com");
			System.out.println("admin:admin");
			break;

		default:
			System.out.println("please pass the correct env name..." + env);
			break;
		}

		int amount = 80;
		switch (amount) {
		case 90:
			System.out.println("hi");
			break;
		case 80:
			System.out.println("hello");
			break;

		default:
			System.out.println("bye");
			break;
		}

		
		char c = 'a';
		switch (c) {
		case 'a':
			
			break;

		default:
			break;
		}
		
		
		
		
	}

}
