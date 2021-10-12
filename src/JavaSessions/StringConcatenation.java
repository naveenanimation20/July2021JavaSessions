package JavaSessions;

public class StringConcatenation {

	public static void main(String[] args) {

		int a = 10;
		int b = 20;
		
		double d1 = 12.33;
		double d2 = 23.33;
		
		System.out.println(a+b);
		System.out.println(a-b);
		
		String s = "testing";
		String s1 = "selenium";
		
		System.out.println(s+s1);
		
		String x = "Hello";
		String y = "World";
		System.out.println(a+b+d1+d2+x+y);
		System.out.println(x+y+a+b+d1+d2);

		System.out.println(a+x);
		System.out.println(a+b+x+y);
		System.out.println(x+y+a+b);
		System.out.println(x+y+(a+b));
		
		System.out.println("the value of a " + a);
		System.out.println("the value of b " + b);
		System.out.println("the sum is : " + (a+b));

		char c1 = 'a';
		char c2 = 'b';
		char c3 = '9';
		char c4 = '$';
		
		System.out.println(c1);//a
		System.out.println(c1+c2);//97+98 = 195
		
		//a-z --> 97 to 122
		//A-Z --> 65 to 90
		//0-9 --> 48 to 57
		System.out.println((int)c1);
		
		byte b1 = 120;
		byte b2 = 100;
		int b3 = b1+b2;
		System.out.println(b3);
		
		
		System.out.println(10/2);
		System.out.println(10/3);
		System.out.println(10.0/3);
		System.out.println(10/3.0);
		System.out.println(10.0/3.0);
		
		System.out.println(0/1);
		//System.out.println(9/0);//AE
		//System.out.println(0/0);
		//System.out.println(0.0/0);//NaN - not a number
		System.out.println(0.0/0.0);//NaN - not a number
		System.out.println(0/0.0);//NaN - not a number
		System.out.println(9.0/0);//Infinity
		System.out.println(9.0/0.0);//Infinity

		System.out.println(9 % 2);
		System.out.println(9 % 3);
	}

}
