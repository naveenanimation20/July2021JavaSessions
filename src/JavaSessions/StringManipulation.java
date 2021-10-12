package JavaSessions;

public class StringManipulation {

	public static void main(String[] args) {

		String str = "This is my java code and I am so happy";

		int len = str.length();
		System.out.println(len);
		System.out.println("li = " + 0);
		System.out.println("hi = " + (len - 1));

		System.out.println(str.charAt(1));
		System.out.println(str.charAt(8));
		// System.out.println(str.charAt(-1));//StringIndexOutOfBoundsException
		System.out.println(str.charAt(37));
		// System.out.println(str.charAt(38));

		System.out.println(str.indexOf('h'));
		System.out.println(str.indexOf('i'));// 1st occurrence of i
		System.out.println(str.indexOf('i', str.indexOf('i') + 1));// 2nd occurrence of i

		System.out.println(str.indexOf("java"));// 11
		System.out.println(str.indexOf("python"));//-1

		String username = "welcome admin";
		if (username.indexOf("admin") == 8) {
			System.out.println("PASS");

		} else {
			System.out.println("FAIL");
		}
		
		//contains:
		String s1 = "title is account login";
		System.out.println(s1.contains("login"));
		
		//comparison:
		String s2 = "welcome admin";
		String s3 = "welcome Admin";

		System.out.println(s2.equals(s3));
		System.out.println(s2.equalsIgnoreCase(s3));
		
		//trim: remove the spaces from the corners
		String st = "     hello world     ";
		System.out.println(st.trim());

		//white spaces:
		String stt = "      hello      world    testing     ";
		System.out.println(stt.replaceAll("\\s+", ""));
		
		String dob = "01-01-1990"; //01/01/1990
		
		System.out.println(dob.replace("-", "/"));
		
		//LCase,UCase:
		String sc = "this is my java code";
		System.out.println(sc.toUpperCase());
		System.out.println(sc.toLowerCase());
		
		//split:
		String lang = "Java_Python_JavaScript_Ruby";
		String lg[] = lang.split("_");
		
		System.out.println(lg[0]);
		
		for(String e : lg) {
			System.out.println(e);
		}
		
		String test = "XXtestingxXXseleniumXxXQTPXXxXAutomation";
		String t[] = test.split("xX");
		
		//System.out.println(t[4]);//AEOBE
		System.out.println(t[0]);
		//System.out.println(t[4]);
		
		String empInfo = "sonu;gupta;25;pune;india;testing;test@gmail.com";
		System.out.println(empInfo.split(";")[0]);
		String emp[] = empInfo.split(";");
		for(String e : emp) {
			System.out.println(e);
		}

	}

}
