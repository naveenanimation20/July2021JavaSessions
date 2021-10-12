package OOP_Encapsulation;

public class Company {

	private String name;//IBM
	private int empCount;//1000
	private String hq;
	
	public String ceoName;
	
	public String getCompyInfo() {//getter of getting all comp information
		String info = name + empCount + hq;
		return info;
	}

	// setter and getter methods --> public
	public String getName() {
		return name;//IBM
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getEmpCount() {
		return empCount;//1000
	}

	public void setEmpCount(int empCount) {
		this.empCount = empCount;
	}

	public String getHq() {
		return hq;
	}

	public void setHq(String hq) {
		this.hq = hq;
	}


//	public static void main(String[] args) {
//
//		Company obj = new Company();
//		obj.name = "IBM";
//		obj.empCount = 1000;
//		
//		System.out.println(obj.name);
//		
//	}

}
