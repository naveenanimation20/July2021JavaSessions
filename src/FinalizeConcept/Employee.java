package FinalizeConcept;

public class Employee extends Student{
	
//	@Override
//	public void finalize() {
//		System.out.println("emp -- finalize method....");
//	}

	public static void main(String[] args) {

		
		Employee e1 = new Employee();
		e1 = null;
		
		Student s1 = new Student();
		s1 = null;
		
		System.out.println("emp main method....");
		
		System.gc();
		
		System.out.println("end of main method....");

		
		
		
	}

}
