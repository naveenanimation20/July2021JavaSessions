package OOP_Encapsulation;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class LoginPageTest {

	public static void main(String[] args) {

		
		//1st user:
		LoginPage lp = new LoginPage();
		lp.setUsername("naveen@gmail.com");
		lp.setPassword("naveen@123");
		
//		System.out.println(lp.getUsername());
//		System.out.println(lp.getPassword());

		lp.doLogin(lp.getUsername(), lp.getPassword());
		
		//2nd user:
		LoginPage lp1 = new LoginPage();
		lp1.setUsername("tom@gmail.com");
		lp1.setPassword("tom@123");
		lp1.doLogin(lp1.getUsername(), lp1.getPassword());

		//3rd use cases:
		lp.setPassword("naveen@456");
		lp.doLogin(lp.getUsername(), lp.getPassword());

		 String Player[] = {"Dhoni", "Rohit", "Virat", "Dhawan", "Malinga", "Rishab"};
			List <String> pr = new ArrayList<String>(Arrays.asList(Player));
			for(int i=0; i<pr.size(); i++) {
				if(i==2) {
					pr.add(i+1, pr.get(pr.size()-1));
					pr.remove(pr.size()-1);
					break;
				}
			}
			System.out.println(pr);
	}

}
