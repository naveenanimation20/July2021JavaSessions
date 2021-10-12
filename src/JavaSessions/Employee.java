package JavaSessions;

import java.util.ArrayList;
import java.util.Arrays;

public class Employee {
	
	//class --> blueprint/template of all objects
	//class is a concept
	//class template --> create the object
	
	//class vars: will be common for all the objects, but their values will be different
	//class properties
	String name;
	int age;
	double salary;
	boolean isActive;

	public static void main(String[] args) {
		
		String name = "Peter";//local variable
		System.out.println(name);

		//create the object: use new keyword
		Employee e1 = new Employee();
		
		e1.name = "Tom";
		e1.age = 20;
		e1.salary = 23.44;
		e1.isActive = true;
		
		System.out.println(e1.name);
		System.out.println(e1.age);
		System.out.println(e1.salary);
		System.out.println(e1.isActive);
		
		Employee e2 = new Employee();
		e2.name = "Naveen";
		e2.isActive = false;
		
		System.out.println(e2.name + " "+ e2.age + " " + e2.salary + " " + e2.isActive);
		
		e2.salary = 12.22;
		System.out.println(e2.name + " "+ e2.age + " " + e2.salary + " " + e2.isActive);

		//no ref objects
		new Employee().name = "Lisa";
		new Employee().age = 21;

		Employee e5 = new Employee();
		e5 = null; //null ref objects
		
		//System.out.println(e5.name);//NPE

		System.gc(); //wil try to destroy 3 objects
		
		
		int i[] = {1,2,3,4,5};
		int index=2;//want to remove index 2 value
		int copy[] = new int [i.length-1];
		int count=0;
		for(int k=0; k<i.length; k++) {
			if(k!=index) {
				copy[count++] = i[k];
			}
		}
		
		System.out.println(Arrays.toString(copy));
		
		
//		int p[] = {1,2,3,4,5};
//		int q[] = new int[p.length-1];
//		int r=3;
//		for(int j=0, g=0; j<p.length; j++) {
//			if(j!=r) {
//				q[g]=p[j];
//				g++;
//			}
//		}
//		System.out.println(Arrays.toString(q));
		
		
		ArrayList<String> namesList = new ArrayList<String>();

		namesList.add("Tom");//0
		namesList.add("Lisa");//1
		namesList.add("Pter");//2
		
		namesList.add(namesList.size(), "testing");
		
		System.out.println(namesList);

		for(int d=0; d<namesList.size(); d++) {
			if(namesList.get(d).equals("Lisa")) {
				namesList.remove(d);
				namesList.add(d, "auto");
				break;
			}
		}

		System.out.println(namesList);
		
		
		ArrayList<Integer> p=new ArrayList<Integer>();
		 p.add(0, 10);
		 p.add(0, 20);
		 System.out.println(p.get(0)); //Java will override previous value and store latest value-O/P=20
		 p.add(1, 30);
		 System.out.println(p.get(1));//O/P is 30
		 System.out.println(p.get(2)); //O/P as 10 instead of IndexOutOfBound exception


	}

}
