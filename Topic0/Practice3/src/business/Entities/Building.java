package business.Entities;

public abstract class Building {
	
	private String adress;
	private int numberFloors;
	private double mts2;
	private double value;
	
	public Building( String adress, int floors , double mts2){
		this.adress = adress;
		this.numberFloors = floors;
		this.mts2 = mts2;
	}
	
	public Building(){
		
	}
	
	public  double calulateRealValue(){
		return mts2 * 10;
	}
	
	public void printRealValue(){
		System.out.println( this.calulateRealValue());
	}

}
