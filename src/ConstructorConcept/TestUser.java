package ConstructorConcept;

public class TestUser {

	public static void main(String[] args) {

		User u1 = new User("Tom",20);
		System.out.println(u1.getName());
		System.out.println(u1.getAge());
		
		u1.setName("TomPeter");
		System.out.println(u1.getName());

		

		User u2 = new User("Tom", "NY");
		User u3 = new User("Sonu");
		
		//Company comp = new Company();

		
	}

}
