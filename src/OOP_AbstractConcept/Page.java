package OOP_AbstractConcept;

public abstract class Page {
	
	public Page() {
		System.out.println("page -- default const....");
	}
	
	public Page(int a) {
		System.out.println("page -- one param const...."+a);
	}
	

	// can not create the object of abstract class
	// but you can create the constructor of abs... class
	// const.. will be called when you create the object of child class
	
	// abs... class can have 0 abs... methods --> 0% abstraction
	// abs... class can have only abs... methods --> 100% abstraction
	// abs... class can have abs... methods + non abs.. methods --> partial abstraction
	// 0 to 100% abstraction

	public abstract void title();

	public abstract void header();

	public void timeOut() {
		System.out.println("default page time out is : " + 20);
	}

	public final void logo() {
		System.out.println("page -- logo");
	}

	public static void getUrl() {
		System.out.println("http://www.xyz.com");
	}

}
