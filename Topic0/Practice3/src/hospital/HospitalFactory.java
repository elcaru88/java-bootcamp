package hospital;

public class HospitalFactory {

		public Hospital getHospital(char type) {
			
			if ('P'== type) {
				return new Polyclinic();
			} 
			else if ('C' == type){
				return new Clinic();
			}
			else if ('T' == type ){
				return new IntensiveTherapy();
			}
			else 
				System.out.println("Next time Check out your Choice");
			return null;
       }
}


