package exercise1;

public class Cash extends Discount{

	
	
	public double priceWithDiscount(double price,double extraInfo) {
		
		return price -  ((90 * extraInfo)/100);
	}

}
