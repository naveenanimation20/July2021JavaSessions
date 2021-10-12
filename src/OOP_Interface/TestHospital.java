package OOP_Interface;

public class TestHospital {

	public static void main(String[] args) {

		FortisHospital fh = new FortisHospital();
		
		fh.cardioServices();
		fh.dentalServices();
		fh.dermaServices();
		fh.emergencyServices();
		fh.medicalInsurance();
		fh.medicalTraining();
		fh.helpDesk();
		fh.billing();
		fh.covid19Test();
		fh.medicalCertificate();
		UNHG.pandemicAnnoucement();
		//USMedical.min_fee = 20;
		System.out.println(USMedical.min_fee);
		USMedical.medicalEquipment();
		fh.medicalCertificate();
		System.out.println(FortisHospital.min_fee);
		
		//top casting: child class object can be referred by parent interface ref variable
		USMedical us = new FortisHospital();
		
		us.physioServices();
		us.emergencyServices();
		us.dermaServices();
		us.dentalServices();
		
		UKMedical uk = new FortisHospital();
		uk.cardioServices();
		
		//down casting: NA
		//new USMedical();
		
		
	}

}
