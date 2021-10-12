package JavaSessions;

public class StaticMethods {
	
	public static void sendMail() {
		System.out.println("send mail");
	}
	
	public void getMail() {
		System.out.println("get Mail");
	}

	public static void main(String[] args) {
		StaticMethods obj = new StaticMethods();
		//non static methods:
		//by using the object:
		obj.getMail();
		
		//how to call static methods:
		//1. by using class name:
		StaticMethods.sendMail();
		
		//2. call directly:
		sendMail();
		
		//3. by using the object reference:
		obj.sendMail();
		
	}
	
	
	
	
	

}
