package OOP_Interface;

public class FortisHospital extends Hospital implements USMedical, UKMedical, IndianMedical {

	// US
	@Override
	public void physioServices() {
		System.out.println("FH -- physioServices");
	}

	@Override
	public void oncologyServices() {
		System.out.println("FH -- oncologyServices");

	}

	@Override
	public void dentalServices() {
		System.out.println("FH -- dentalServices");

	}

	@Override
	public void dermaServices() {
		System.out.println("FH -- dermaServices");
	}

	// UK
	@Override
	public void pediaServices() {
		System.out.println("FH -- pediaServices");

	}

	@Override
	public void cardioServices() {
		System.out.println("FH -- cardioServices");

	}

	// India
	@Override
	public void neuroServices() {
		System.out.println("FH -- neuroServices");

	}

	@Override
	public void orthoServices() {
		System.out.println("FH -- orthoServices");

	}

	@Override
	public void entServices() {
		System.out.println("FH -- entServices");

	}

	@Override
	public void emergencyServices() {
		System.out.println("FH -- emergencyServices");
	}
	
	//individual:
	public void medicalInsurance() {
		System.out.println("FH -- medical insurance");
	}
	
	public void medicalTraining() {
		System.out.println("FH -- medical traning");
	}
	
	@Override
	public void helpDesk() {
		System.out.println("FH hospital help desk");
	}

	@Override
	public void covid19Test() {
		System.out.println("FH -- covid 19 test");
	}
	
//	public static void medicalEquipment() {
//		System.out.println("US -- medicalEquipment");
//	}
	
//	@Override
//	public void medicalCertificate() {
//		System.out.println("US -- medicalCertificate");
//	}

}
