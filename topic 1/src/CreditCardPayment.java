import java.util.ArrayList;

public class CreditCardPayment extends Payment {
	ArrayList<CreditCard> payments;
	
	

	public CreditCardPayment() {
		payments = new ArrayList<>();
		
	}

	public boolean payment(String name, Integer creditNumber) {
		// TODO Auto-generated method stub
		boolean validation= false;
		CreditCard creditCard1 = new CreditCard(name, creditNumber);
		payments.add(creditCard1);
		validation= true;
		return validation;
		
	}

	@Override
	public char discount() {
		// TODO Auto-generated method stub
		return 0;
	}

}
