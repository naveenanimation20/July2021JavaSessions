package OOP_Encapsulation;

public class TestComp {

	public static void main(String[] args) {

		Company obj = new Company();
		obj.setName("IBM");
		obj.setEmpCount(1000);
		obj.setHq("Bangalore");
		obj.ceoName = "TOm";
		
		
		System.out.println(obj.getName());
		System.out.println(obj.getEmpCount());
		System.out.println(obj.getHq());
		System.out.println(obj.ceoName);
		
		String info = obj.getCompyInfo();
		System.out.println(info);
	}

}
