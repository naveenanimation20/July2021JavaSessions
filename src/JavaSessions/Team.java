package JavaSessions;

import java.util.ArrayList;

public class Team {

	// WAF : pass the team name
	// return : the list of devices ---> ArrayList<String>

	public ArrayList<String> getDevicesList(String teamName) {

		System.out.println("team name is : " + teamName);
		ArrayList<String> devicesList = new ArrayList<String>();

		if (teamName.equals("QA")) {
			devicesList.add("iPhone X");
			devicesList.add("iPhone 7");
			devicesList.add("Samsung 8");
		} 
		else if (teamName.equals("Dev")) {
			devicesList.add("iPhone 12");
			devicesList.add("iPhone 8");
			devicesList.add("Samsung 7");
		}

		else if (teamName.equals("DevOps")) {
			devicesList.add("iPhone plus 12");
		}

		else {
			System.out.println("team is not found..." + teamName);
		}

		return devicesList;

	}
	
	
	//WAF: input: browserName(String)
	//return: void
	public void launchBrowser(String browserName) {
		
		switch (browserName.toLowerCase()) {
		case "chrome":
			System.out.println("launch chrome");
			break;
			
		case "firefox":
			System.out.println("launch ff");
			break;
			
		case "safari":
			System.out.println("launch safari");
			break;

		default:
			System.out.println("please pass the right browser name: " + browserName);
			break;
		}
	}
	
	
	//WAF: input param: StudentName(String)
	//return: static array: Object Array
	
	public Object[] getStudentInfo(String name) {
		System.out.println("student name is : " + name);
		Object info[] = new Object[3];
		
		if(name.equals("Karthik")) {
			info[0] = "Karthik Sharma";
			info[1] = 10;
			info[2] = 'A';
		}
		else if(name.equals("Sonu")) {
			info[0] = "Sonu Gupta";
			info[1] = 11;
			info[2] = 'B';
		}
		else if(name.equals("Ravi")) {
			info[0] = "Ravi K";
			info[1] = 12;
			info[2] = 'C';
		}
		
		else {
			System.out.println("student name is not found..." + name);
		}
		
		return info;
	}
	
	
	
	
	
	
	
	

}
