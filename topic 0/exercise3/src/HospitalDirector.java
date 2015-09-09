
public class HospitalDirector {
	private HospitalBuilder hospitalBuilder;

	public HospitalDirector(HospitalBuilder hospitalBuilder) {
		super();
		this.hospitalBuilder = hospitalBuilder;
	}
	
	public void constructHospital() {
		hospitalBuilder.buildConsultorio();
		hospitalBuilder.buildDoctor();
		hospitalBuilder.buildPersonal();
		hospitalBuilder.buildPisos();
	}
	
	public Hospital getHospital() {
		return hospitalBuilder.getHospital();
	}
}
