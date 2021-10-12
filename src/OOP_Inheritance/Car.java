package OOP_Inheritance;

public class Car extends Vehicle{
	
	final int speed = 100;
	
	//final class - can not be inherited
	//final : is used to prevent inheritnace/method overriding

	public void start() {
		System.out.println("Car -- start");
	}

	public void stop() {
		System.out.println("Car -- stop");
	}

	public void refuel() {
		System.out.println("Car -- reufuel");
	}
	
	public static void getName() {
		System.out.println("Car get Name");
	}
	
	
	//Page -- final logo()

}
