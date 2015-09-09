package entities;

public class Cash extends PaymentMethod{
	
	public double applyDiscount(Cart cart){
		
		for (Item p : cart.items) {
			
		}
		return 0;
		
	}

	@Override
	public double calculateDiscount(Cart cart) {
		double discount = cart.getExpItem().product.getProductPrice() *	cart.getExpItem().quantity * 0.9;	
		return discount;
	}

}
