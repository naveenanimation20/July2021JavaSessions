package SCP;

public class Student {

	public static void main(String[] args) {

		//string literals
		String s1 = "Tom";
		String s2 = "Tom";
		String s3 = "Tom";
		
		System.out.println(s1 == s2);
		System.out.println(s2 == s3);
		System.out.println(s1 == s3);

		//with new:
		String s4 = new String("Hello World");//2
		String s5 = new String("Hello World");//1

		System.out.println(s4 == s5);
		
		System.out.println(s4.equals(s5));
		
		s3 = s3+"Java";
		System.out.println(s3);
		
		String t1 = "Hello";
		t1 = "world";
		System.out.println(t1);
		
		String t2 = "Hello";
		
		
		int i = 10;
		i = 20;
		
		
		String t4 = new String("Hello Testing");//2 --> SCP + HEAP
		String t5 = new String("Hello Testing");//1--> HEAP
		//total objects --> 3

		System.out.println(t4);
		System.out.println(t5);
		System.out.println(t4==t5);
		
		
		
		
		
	}

}
