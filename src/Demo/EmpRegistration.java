package Demo;

public class EmpRegistration {
	private String name;
	private int age;
	private double salary;
	private boolean active;
	private char gender;

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

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	public boolean isActive() {
		return active;
	}

	public void setActive(boolean active) {
		this.active = active;
	}

	public char getGender() {
		return gender;
	}

	public void setGender(char gender) {
		this.gender = gender;
	}

	public String getEmpInfo(String name, int age, double salary, boolean active, char gender) {
		String info = name + " " + age + " " + salary + " " + active + " " + gender;
		return info;

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 1 emp
		EmpRegistration e1 = new EmpRegistration();
		e1.setName("Mamatha");
		e1.setAge(35);
		e1.setSalary(30.55);
		e1.setActive(false);

		e1.setGender('F');
		String info = e1.getEmpInfo(e1.getName(), e1.getAge(), e1.getSalary(), e1.isActive(), e1.getGender());
		System.out.print("Frist emp details:");
		System.out.println(info);

		// Second emp
		EmpRegistration e2 = new EmpRegistration();
		e2.setName("Madhu");
		e2.setAge(37);
		e2.setSalary(37.55);
		e2.setActive(true);
		e2.setGender('M');
		String info1 = e1.getEmpInfo(e2.getName(), e2.getAge(), e2.getSalary(), e2.isActive(), e2.getGender());
		System.out.print("Second emp details:");
		System.out.println(info1);

		// Third emp
		EmpRegistration e3 = new EmpRegistration();
		e3.setName("Sudha");
		e3.setAge(33);
		e3.setSalary(39.55);
		e3.setActive(true);
		e3.setGender('F');
		String info2 = e3.getEmpInfo(e3.getName(), e3.getAge(), e3.getSalary(), e3.isActive(), e3.getGender());
		System.out.print("Third emp details:");
		System.out.println(info2);
	}

}
