package JavaSessions;

public class ArrayConcept {

	public static void main(String[] args) {

		//array:
		//1. static array: size is fixed 
		
		//limitations of static array:
		//a. size is fixed(static): extra memory and less memory
		//b. can not store diff types of data
		//to overcome for both the limitations: we have to use dynamic array: Collections-> ArrayList
		
		//2. dynamic array: dynamic sized
		
		//int array:
		int i[] = new int[4];
		i[0] = 10;
		i[1] = 20;
		i[2] = 30;
		i[3] = 40;
		//i[4] = 50;//ArrayIndexOutOfBoundsException
		//i[-1] = 60;//ArrayIndexOutOfBoundsException
		System.out.println(i);
		
		System.out.println("Li = " + 0);
		System.out.println("length =" + i.length);
		int l = i.length;//4
		System.out.println("Hi = " + (l-1));//3
		
		System.out.println(i[0]);
		System.out.println(i[3]);
		//System.out.println(i[4]);//ArrayIndexOutOfBoundsException - RunTime
		//System.out.println(i[-1]);//ArrayIndexOutOfBoundsException - RunTime
		
		System.out.println("------typical for loop---------");
		//to print all the values from array: for loop:
		for(int k=0; k<i.length; k++) { //O(n) - linear
			System.out.println(i[k]);//10 20 30 40 
		}
		System.out.println("---------------");
		
		//for each loop:
		for(int e : i) { //O(n) -- linear
			System.out.println(e);
		}

		System.out.println("---------------");

		
		System.out.println(i[0] + i[3]);
		//System.out.println(i[4]);
		
		int price[] = new int[100];//100 x 4 = 400 Bytes
		price[0] = 10;
		price[1] = 20;
		//act memory taken = 2 x 4 = 8 Bytes
		//waste memory = 400 - 8 = 392 bytes
		System.out.println(price[0]);
		System.out.println("---------------");

		
		//2. double array:
		double d[] = new double[2];
		d[0] = 12.33;
		d[1] = 100;
		
		for(int k=0; k<d.length; k++) {
			System.out.println(d[k]);
		}
		
		for(double e : d) {
			System.out.println(e);
		}
		
		//3. char array:
		char c[] = new char[3];
		System.out.println("---------------");

		//4. String array:
		String names[] = new String[3];
		names[0] = "Mohit";
		names[1] = "Sonam";
		names[2] = "Sachin";

		for(int t=0; t<names.length; t++) {
			System.out.println(names[t]);
		}
		
		for(String e : names) {
			System.out.println(e);
		}
		
		//5. Emp Data : name(String), age(int), gender(char), salary(double), isPerm(boolean)
		//Object static Array:
		//Object: is a parent class of all the classes in Java
		
		Object empData[] = new Object[5];
		empData[0] = "Lisa";
		empData[1] = 30;
		empData[2] = 'F';
		empData[3] = 34.55;
		empData[4] = true;

		//to print all the EmpData values:
		System.out.println("---------------");

		for(int n=0; n<empData.length; n++) {
			System.out.println(n+ "=" + empData[n]);
		}
		System.out.println("---------------");

		int count = 0;
		for(Object e : empData) {
			System.out.println(count + "=" + e);
			count++;
		}
		
		Object carInfo[] = new Object[5];
		carInfo[0] = "Swift";
		carInfo[1] = "White";
		carInfo[2] = 4;
		carInfo[3] = false;
		carInfo[4] = "Sedan";

		Object carInfo1[] = new Object[5];
		carInfo[0] = "BMW";
		carInfo[1] = "White";
		carInfo[2] = 4;
		carInfo[3] = false;
		carInfo[4] = "Sedan";


		
		
		
	}

}
