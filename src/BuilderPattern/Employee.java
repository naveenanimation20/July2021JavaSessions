package BuilderPattern;

public class Employee {
	
	
	public Employee getEmpInfo() {
		System.out.println("get emp info");
		//return new Employee();
		return this;
	}
	
	
	public String getName() {
		return "admin";
	}
	
	
	

}
