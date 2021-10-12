package OOP_Inheritance;

public class BMW extends Car {
	
	
	int speed = 200;
	
	//Method Overriding: Poly+Morphism (Dynamic or Runtime)
	//when you have a method in the parent class and the same method in child class with:
	//1. the same method name
	//2. the same number of parameters + same type of parameter + witht the same sequence of the parameters
	//3. the same return type
	
	//4. final methods can not be overriden
	//5. static methods can not be overriden
	//6. static methods can be inherited
	

	@Override
	public void start() {
		System.out.println("BMW -- start");
	}

	
	public void autoParking() {
		System.out.println("BMW -- auto parking");
	}
	

	
	//method hiding
	public static void getName() {
		System.out.println("BMW get Name");
	}

}
