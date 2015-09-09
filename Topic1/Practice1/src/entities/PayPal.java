package entities;

public class PayPal extends PaymentMethod{
	
	private String email;
	private String pass;

	@Override
	public int getDiscount() {
		return 0;
	}

}
