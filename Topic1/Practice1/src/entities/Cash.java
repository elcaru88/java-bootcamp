package entities;

public class Cash extends PaymentMethod{

	@Override
	public double calculateDiscount(Cart cart) {
		double discount = cart.getExpItem().getProduct().getProductPrice() *	cart.getExpItem().getQuantity() * 0.9;	
		return discount;
	}

}
