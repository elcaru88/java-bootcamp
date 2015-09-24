package hospital;

public class Test {
	
	public static void main(String[] args) {
		HospitalFactory hospitalFactory = new HospitalFactory();

		Hospital h1 = hospitalFactory.getHospital('C');
		System.out.println( h1.getComplexity());
		
		Hospital h2 = hospitalFactory.getHospital('P');
				System.out.println( h2.getComplexity());
				
		Hospital h3 = hospitalFactory.getHospital('T');
		System.out.println( h3.getComplexity());	
	}

}
