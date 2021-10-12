package JavaSessions;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Doubts_1 {
	
	final int days = 7;
	static final int wheels = 4;

	public static void main(String[] args) {
		
		//Doubts_1.wheels = 5;

		int b = 065;//octal number
		System.out.println(b);
		
		//065 = (0 × 8²) + (6 × 8¹) + (5 × 8⁰) = 53	
		
		//00 01 02 03 04
		//10 11 12 12 14
		//20 21 22 23 24
		
		for(int i=0; i<=9; i++) {
			for(int j=0; j<=9; j++) {
				System.out.print(i+""+j+" ");
			}
			System.out.println();
		}
		
		//O(n^2)
		
		//delete value from array:
		String player[] = {"Rohit", "Virat", "Dhawan", "Shreyas", "Rishabh", "Shubman"};
		System.out.println(player.length);
		
		ArrayList<String> pr = new ArrayList<String>(Arrays.asList(player));
		System.out.println(pr);
		pr.remove("Dhawan");
		pr.add("Naveen");
		System.out.println(pr);
		
		//
		ArrayList<String> namesList = new ArrayList<String>();//vc = 10
		namesList.add("Tom");
		namesList.add("Lisa");
		namesList.add("Peter");
		//pc = 3
//		namesList.trimToSize();//vc = 3
//
//		Test.mail();
		
		for(String e : namesList) {
			if(e.equals("Lisa")) {
				System.out.println("is a US citizen");
			}
		}
		
		System.out.println(namesList);
		
		
		Object p1[] = new Object[10];
		p1[0] = "virat";
		p1[1] = 30;
		
		Object p2[] = new Object[4];
		p2[0] = "rohit";
		p2[1] = 32;
		
		System.out.println(p1);
		System.out.println(Arrays.toString(p1));
		
		
		//00 01 02 03 04
		//10 11 12 13 14
		//20 21 22 23 24
		
		
		for(int p=0; p<=9; p++) {
			for(int q=0; q<=9; q++) {
				System.out.print(p+""+q + " ");//00 01 
			}
			System.out.println();
		}
		
		//array literals
		Integer l[] = {1,2,3,4,5};
		ArrayList<Integer> newList = new ArrayList<Integer>(Arrays.asList(l));
		newList.remove(2);
		System.out.println(newList);

		System.out.println("-----");
		
		String names[] = {"Rohit", "Virat", "Dhawan", "Shreyas", "Rishabh", "Shubman"};
		System.out.println(names[2]);
		System.out.println(names);
		System.out.println(Arrays.toString(names));
		Arrays.sort(names);
		System.out.println(Arrays.toString(names));

		System.out.println("-----");

		
		ArrayList<String> nList = new ArrayList<String>(Arrays.asList(names));
		System.out.println(nList);
		nList.remove("Dhawan");
		nList.add("Naveen");
		System.out.println(nList);

		//trim to size:
		ArrayList<String> stList = new ArrayList<String>();//vc = 10
		stList.add("Kanika");//0
		stList.add("Ravi");//1
		stList.add("Archana");//2
		
		Collections.sort(stList);
		System.out.println(stList);
		Collections.sort(stList, Collections.reverseOrder());
		System.out.println(stList);

		
		//pc = 3 , vc = 7
		System.out.println(stList.size());//3
		stList.trimToSize();//vc = 0
		
		for(int i=stList.size()-1; i>=0; i--) {
			System.out.println(stList.get(i));
		}
		
		final int days = 7;

		
	}

}
