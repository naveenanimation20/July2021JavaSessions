package JavaSessions;


public class DataTypes {

	public static void main(String[] args) {

		// data types:
		// strict types:

		// 1. primtive data types: we dont need to create objects to store the values
		// a. Numeric Type:
		// char type: char
		// Integral Types:
		// Integer: byte, short, int, long
		// Floating-point: float, double
		// b. Boolean Type: boolean: true/false

		// 2. non primitive data types: String, class, object, arrays, Inerface

		// 1. byte:
		// range: -128 to 127
		// size: 1 byte = 8 bits
		byte b = 10;
		b = 20;
		byte b1 = -10;
		byte b2 = 0;

		System.out.println(b);
		System.out.println(b1 + b2);

		// 2. short:
		// range: -32768 to 32767
		// size: 2 bytes = 2x8 = 16 bits

		short s = 2300;
		short s1 = 10;
		System.out.println(s1 + s);

		// 3. int:
		// range: -2^31 to 2^31-1
		// -2147483648 to 2147483647
		// size: 4 bytes = 32 bits
		int i = 200;
		int p = 9000;

		// 4. long:
		// range: -2^63 to 2^63-1
		// size: 8 bytes = 64 bits
		long l = 90999999;
		long aadhar = 909078909876l;
		System.out.println(aadhar);
		long l1 = 10;

		// 5. float:
		// size: 4 bytes = 32 bits
		// range: after . upto 7 decimal digits
		float f = 12.33f;
		float f1 = (float) 34.55;
		System.out.println(f);
		System.out.println(f1);
		float f3 = 100;
		System.out.println(f3);
		System.out.println(l + f);

		// 6. double:
		// size: 8 bytes = 64 bits
		// range: after . upto 16 decimal digits
		double d1 = 12.33;
		double d2 = 34.55;
		System.out.println(d1 + d2);

		// 7. char:
		// size: 2 bytes = 16 bits
		// range: ASCII values ranges
		char c1 = 'a';
		char c2 = '1';
		char c3 = '$';
		// unicode chars:
		System.out.println(c1);

		// 8. boolean:
		// range: true/false
		// size: ~1 bit
		boolean flag = true;
		boolean flag1 = false;
		boolean isActive = true;
		boolean isCitizen = false;

		if (isActive) {
			System.out.println("yes");
		}

		byte bb = (byte) 129;
		System.out.println(bb);

		char c4 = 4;
		System.out.println(c4);

	}

}
