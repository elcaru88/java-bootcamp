package entities;

public class CreditCard  extends PaymentMethod{
	
	private String name;
	private int creditCardNumber;

	public CreditCard(String name, int creditCardNumber) {
		this.name = name;
		this.creditCardNumber = creditCardNumber;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getCreditCardNumber() {
		return creditCardNumber;
	}

	public void setCreditCardNumber(int creditCardNumber) {
		this.creditCardNumber = creditCardNumber;
	}

	@Override
	public double calculateDiscount(Cart cart) {
		double discount = cart.totalPrice*0.1;
		return discount;
	}

}
