
public class Demo {
	public static void main(String[] args) {
		HospitalBuilder hospitalBuilder = new HospitalInfantilBuilder();
		HospitalDirector hospitalDirector = new HospitalDirector(hospitalBuilder);
		hospitalDirector.constructHospital();
		Hospital hospital= hospitalDirector.getHospital();
		System.out.println(hospital);
		
	}

}
