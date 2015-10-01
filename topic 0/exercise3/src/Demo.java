
public class Demo {
	public static void main(String[] args) {
		HospitalFactory hospitalFactory = new HospitalFactory();
		Hospital h1 = hospitalFactory.getHospital("infantil");
		System.out.println("h1 estado: Doctor=" + h1.Doctor() + " turno="+ h1.turno() + " espera="+ h1.espera());
		
		Hospital h2 = hospitalFactory.getHospital("adulto");
		System.out.println("h2 estado: Doctor=" + h2.Doctor() + " turno="+ h2.turno() + " espera="+ h2.espera());
		
		Hospital h3 = hospitalFactory.getHospital("ggg");
		System.out.println(h3.Doctor());
	}

}
