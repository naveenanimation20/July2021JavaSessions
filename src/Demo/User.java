package Demo;

import java.util.Arrays;

public class User {

	String name;
	int age;
	String orders[];

	public User(String name, int age, String[] orders) {
		this.name = name;
		this.age = age;
		this.orders = orders;
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

	public String[] getOrders() {
		return orders;
	}

	public void setOrders(String[] orders) {
		this.orders = orders;
	}

	public static void main(String[] args) {

		String userOrder[] = {"mobile", "laptop", "monitor"};
		User u1 = new User("admin", 25, userOrder);
		
		System.out.println(u1.getName());
		System.out.println(Arrays.toString(u1.getOrders()));
		
	}

}
