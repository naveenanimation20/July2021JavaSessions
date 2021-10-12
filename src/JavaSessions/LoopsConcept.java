package JavaSessions;

public class LoopsConcept {

	public static void main(String[] args) {

		//1 to 10:
		//1. while:
		int i = 1;
		while(i<=10) {
			System.out.println(i);//1 2 3 4 5 .....10
			i++;
			//++i;
			//i=i+1;
		}
	
		int k = 1;
		while(k<=100) {
			System.out.println(k);
				if(k % 5 == 0) {
					System.out.println("hii");
				}
			k++;	
		}
		
		//Taj Hotel -- welcome
//		while(true) {
//			System.out.println("welcome to Hotel Taj");
//		}
		
//		boolean flag = false;
//		while(flag) {
//			
//		}
		//use cases for while:
		//1. when the number of interations are not fixed -- prefer while loop
		//2. Amazon -- total products -- 1 to 100, 1 to 200, 1 to 300
		//3. checking the element present on the pages -- while loop
		//4. pagination
		
		boolean t = true;
		while(t) {
			System.out.println("welcome");
			t = false;
		}
		
		System.out.println("------------------------");
		//2. for loop:
		//1 to 10
		for(int p=1; p<=10; p++) {
			System.out.println(p);//1 2 3 4 5 ...10
		}
		
//		for(;;) {
//			System.out.println("bye");
//		}
		
		for(char c='a'; c<='z'; c++) {
			System.out.println(c+ " ");
		}
		
		for(int c='a'; c<='z'; c++) {
			System.out.println(c);
		}
		
		for(double d = 1.1; d<=10.0; d++) {
			System.out.println(d);
		}
		
//		for(String s = "test"; s.equals("selenium"); s++) {
//			System.out.println(s);
//		}
		
		//use cases for for loop:
		//1. when we are sure about the total number of iterations
		//2. iterating arrays, arraylist -- for loop
		//3. data driven - get the data from Excel -- total rows = 10
		
		System.out.println("-----");
		//do-while:
		int r = 1;
		do {
			System.out.println(r);
			r++;
		}
		while(r<=10);
		
		//use cases for do-while:
		//1. pagination: 
		//2. check the title of the page
		
		
		//loop with break:
		for(int h=1; h<=10; h++) {
			System.out.println(h);
				if(h % 5 == 0) {
					System.out.println("Hi");
					break;
				}
		}
		
		//get the list of all footer links
		//start a loop
		//put a condition to check the link text is equal to "amazon"
		//click on that element
		//break the loop
		
		
		
	}

}
