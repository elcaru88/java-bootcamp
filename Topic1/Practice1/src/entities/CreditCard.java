package entities;

public class CreditCard  extends PaymentMethod{
	
	private String name;
	private int creditCardNumber;

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
	public int getDiscount() {
		return 10;
	}

}
