
public class HospitalInfantilBuilder extends HospitalBuilder {
	
	Hospital hospital;
	

	public HospitalInfantilBuilder() {
		hospital = new Hospital();
	}

	@Override
	public void buildConsultorio() {
		// TODO Auto-generated method stub
		hospital.setConsultorios("Pediatria");
	}

	@Override
	public void buildPersonal() {
		// TODO Auto-generated method stub
		hospital.setPersonal("recepcionista");
	}

	@Override
	public void buildDoctor() {
		// TODO Auto-generated method stub
		hospital.setDoctor("Pediatra");
	}

	@Override
	public void buildPisos() {
		// TODO Auto-generated method stub
		hospital.setPisos("Planta baja");
	}

	@Override
	public Hospital getHospital() {
		// TODO Auto-generated method stub
		return hospital;
	}

}
