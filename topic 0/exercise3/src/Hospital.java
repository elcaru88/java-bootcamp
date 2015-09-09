
public class Hospital {
	
	private String consultorio;
	private String personal;
	private String doctor;
	private String pisos;
	public String getConsultorios() {
		return consultorio;
	}
	public void setConsultorios(String consultorio) {
		this.consultorio = consultorio;
	}
	public String getPersonal() {
		return personal;
	}
	public void setPersonal(String personal) {
		this.personal = personal;
	}
	public String getDoctor() {
		return doctor;
	}
	public void setDoctor(String doctor) {
		this.doctor = doctor;
	}
	public String getPisos() {
		return pisos;
	}
	public void setPisos(String pisos) {
		this.pisos = pisos;
	}
	
	@Override
	public String toString() {
		return "Hospital [consultorio=" + consultorio + ", personal=" + personal + ", doctor=" + doctor + ", pisos="
				+ pisos + "]";
	}
	
	
	
	
	

}
