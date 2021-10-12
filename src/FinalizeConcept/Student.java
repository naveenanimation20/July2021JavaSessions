package FinalizeConcept;

public class Student {
	
	String name = "Tom";
	
	
	
	
	
	@Override
	public void finalize() {
		System.out.println("student -- finalize method....");
	}

}
