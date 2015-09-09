package exercise1;

public class CreditCard extends Discount{

	private String name;
	private int creditNumber;
	
	
	
	public CreditCard(String name, int creditNumber) {
		
		this.name = name;
		this.creditNumber = creditNumber;
	}



	public CreditCard() {
		
	}



	public String getName() {
		return name;
	}



	public void setName(String name) {
		this.name = name;
	}



	public int getCreditNumber() {
		return creditNumber;
	}



	public void setCreditNumber(int creditNumber) {
		this.creditNumber = creditNumber;
	}



	public double priceWithDiscount(double price,double extraInfo) {
		//10% by Credit Card
		
		return price - ((10 * price)/100);
	}

}
