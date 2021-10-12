package JavaSessions;

public class MainMethodoverloading {

	public static void main(String ar[]) {
		System.out.println("my main method");
	}
	
	public static void main(int test[]) {
		System.out.println("my main method");
	}

	public static void main(int a) {
		System.out.println(" main method" + a);

	}
	
	public static void main(int a, int b) {
		System.out.println(" main method" + a+b);

	}
	
	public static String main() {
		return "Tom";
	}
	
	
	
	

}
