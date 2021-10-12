package ConstructorConcept;

public class Employee {

	// const... is having the same name as the class name
	// doesnt have any return/void
	// its not a function
	// but func may or may not return
	// const.. can be overloaded
	//const. will be called when you create the object of the class
	//const... will help to create the type of the object
	//with const.. you can avoid creating of unnecessary objects
	//buss logic/feature should be defined inside the functions
	

	public Employee() {//0 param -- default const..
		System.out.println("default const...");
	}

	public Employee(int a) {//1 param
		System.out.println("1 param const..." + a);

	}
	
	public Employee(int a, String b) {//2 params
		System.out.println("2 params const..." + (a+b));

	}
	
	public static void main(String args[]) {
		Employee e1 = new Employee(10, "Tom");
		Employee e2 = new Employee(20);
		//Employee e3 = new Employee(20,30);


	}
	
	

}
