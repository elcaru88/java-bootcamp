package entities;


public class PaymentMethodFactory {
	

	public PaymentMethod getPaymentMethod( Methods m ) {
		
		if ( m.equals(Methods.CASH)) {
			return new Cash();
		} 
		else if ( m.equals(Methods.CREDIT)) {
			return new CreditCard();
		} 
		else if ( m.equals(Methods.PAYPAL)) {
			return new PayPal();
		} 
		else{
			System.out.println("Next time Check out your Choice");			
		}	
		return null;
   }
	
}
