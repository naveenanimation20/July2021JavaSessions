package ConstructorConcept;

public class User {

	private String name;
	private int age;
	private String city;

//	public User() {
//		
//	}
	// const...is helping to set the class vars//like setter
	// we can omit setter methods
	// we need getter methods
	public User(String name, int age) {
		this.name = name;
		this.age = age;
	}

	public User(String name, String city) {
		this.name = name;
		this.city = city;
	}

	public User(String name) {
		this.name = name;
	}

	public User(String name, int age, String city) {
		this.name = name;
		this.age = age;
		this.city = city;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

}
