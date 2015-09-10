import java.util.ArrayList;

public class PaypalPayment {
ArrayList<Paypal> payments;
	
	

	public PaypalPayment() {
		payments = new ArrayList<>();
		
	}

	public boolean payment(String email, String password) {
		// TODO Auto-generated method stub
		boolean validation= false;
		Paypal paypal1 = new Paypal(email, password);
		payments.add(paypal1);
		validation= true;
		return validation;
		
	}

}
