package OOP_Interface;

public interface USMedical extends WHO{
	
	static final int min_fee = 10;
	//vars are static and final by default
	
	//we can not create the object of interface
	//abstract method -- a method which doesnt have any method body
	//prototype mehtod -- only decalaration - no method body -- can not be static
	// 100% abstraction
	
	public abstract void physioServices();

	public void oncologyServices();

	public void dentalServices();
	
	public void dermaServices();
	
	public void emergencyServices();
	
	//from JDK 8:
	
	//1. can have static method with the body:
	public static void medicalEquipment() {
		System.out.println("US -- medicalEquipment");
	}
	
	//2. can have default method with method body:
	default void medicalCertificate() {
		System.out.println("US -- medicalCertificate");
	}
	
	

}
