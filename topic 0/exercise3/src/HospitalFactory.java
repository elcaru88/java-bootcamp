
public class HospitalFactory {
	
	public Hospital getHospital(String type) {
		if ("infantil".equals(type)) {
			return new HospitalInfantil();
		} else if ("adulto".equals(type)) {
			return new HospitalAdulto();
		} else {
			return new Other();
		}
	}

}
