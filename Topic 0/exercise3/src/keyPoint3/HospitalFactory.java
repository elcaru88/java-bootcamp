package keyPoint3;

public class HospitalFactory {
	
	public Hospital getHospital(HospitalType type){
		if ("city".equals(type.toString())) {
			return new CityHospital();
		} else if ("village".equals(type.toString())) {
			
			return new VillageHospital();
		}else return new Clinic();
		
	}

}
