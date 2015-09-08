package keyPoint3;

public class Test {
	
	public static void main(String[] args) {
			
		HospitalFactory hospitalFactory = new HospitalFactory();
		Hospital hospitalC = hospitalFactory.getHospital(HospitalType.city);
		System.out.println("city hospital max days patient in bed = "+hospitalC.maxDaysPatientInBed()+" , do complex surgery : "+hospitalC.doComplexSurgery());
		
		Hospital hospitalV = hospitalFactory.getHospital(HospitalType.village);
		System.out.println("village hospital max days patient in bed = "+hospitalV.maxDaysPatientInBed()+" , do complex surgery : "+hospitalV.doComplexSurgery());
	
		Hospital clinic = hospitalFactory.getHospital(HospitalType.clinic);
		System.out.println("clinic max days patient in bed = "+clinic.maxDaysPatientInBed()+" , do complex surgery : "+clinic.doComplexSurgery());
	
	
	
	}

}
