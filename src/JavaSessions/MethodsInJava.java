package JavaSessions;

public class MethodsInJava {
	//methods/functions : logic is written in a block
	//you can call this block
	//static / non static method
	
	//can not create a method inside a method
	//but can call the methods from diff methods
	//duplicate methods are not allowed
	//but we can overload the methods
	//methods shoud be parallel to each other//independec to each other
	//to call the non static mehtods -- we have to create the object of the class
	//function can not return multiple values
	//can return only one value at a time
	
	

	public static void main(String[] args) {
		MethodsInJava obj = new MethodsInJava();
		obj.test();//calling a method
		int c = obj.sum();
		System.out.println(c);
		String s = obj.getTrainerName();
		System.out.println(s + " from Naveen Automation Labs");
		
		String s1 = obj.getTrainerName();
		if(s1.equals("Naveen")) {
			System.out.println("PASS");
		}
		
		System.out.println(obj.getTrainerName());
		
		int s2 = obj.add(10, 50);
		System.out.println(s2);
	}
	
	//1. no input and no return:
	//void --> does not return anything (no return keyword)
	public void test() {
		System.out.println("test method");
	}
	
	//2. no input but some return:
	//return type: int
	public int sum() {
		System.out.println("sum method");
		int a = 10;
		int b = 20;
		int z = a+b;
		return z;
	}
	
	public String getTrainerName() {
		System.out.println("get trainer name");
		String name = "Naveen";
		return name;
	}
	
	//3. some input and some return:
	public int add(int a, int b) {
		System.out.println("add method");
		int sum = a+b;
		return sum;
	}
	
	

}
