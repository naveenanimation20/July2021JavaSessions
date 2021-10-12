package JavaSessions;

import java.util.ArrayList;
import java.util.Arrays;

public class TestTeamDevices {

	public static void main(String[] args) {

		Team t1 = new Team();
		ArrayList<String> QADevices = t1.getDevicesList("QA");
		
		System.out.println(QADevices);
		
		if(QADevices.size() == 3) {
			System.out.println("PASS for QA team device count");
		}
		
		if(QADevices.contains("iPhone 7")) {
			System.out.println("iPhone 7 is present");
		}
		
		t1.getDevicesList("emp");
		
		t1.launchBrowser("chrome");
		
		Object ob[] = t1.getStudentInfo("naveen");
		System.out.println(Arrays.toString(ob));
		
		
		
		
	}

}
