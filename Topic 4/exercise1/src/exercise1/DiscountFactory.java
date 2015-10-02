package exercise1;

public class DiscountFactory {

	public Discount getDiscount(String method) {
		if (method.equalsIgnoreCase("Credit Card")) {
			return new CreditCard();
		}
		if (method.equalsIgnoreCase("Paypal")) {
			return new Paypal();
		}
		if (method.equalsIgnoreCase("Cash")) {
			return new Cash();
		}
		return null;
			}
}