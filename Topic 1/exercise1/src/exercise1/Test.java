package exercise1;

public class Test {
	public static void main(String[] args) {

		/*CreditCard c = new CreditCard();
		
		//System.out.println(c.priceWithDiscount(10));
		
		DiscountFactory discFact = new DiscountFactory();
		
		Discount cc = discFact.getDiscount("credit card");
		System.out.println("precio con descuento "+cc.priceWithDiscount(100));
		*/
		Product Music_cd = new Product("Music_cd", 20.5);
		Product lamp = new Product("lamp",50);
		Product pc = new Product("pc", 2500.00);
		
		String input = "Music_cd";
		
		//System.out.println(Music_cd.getName().equalsIgnoreCase(input));

		DiscountFactory discountFactory = new DiscountFactory();
		double final_price;
		ShoppingCart shoppingCart = new ShoppingCart();
		shoppingCart.add(pc);
		shoppingCart.add(lamp);
		shoppingCart.add(Music_cd);
		System.out.println(shoppingCart.toString());
		System.out.println(shoppingCart.getTotalPrice());
		//System.out.println(shoppingCart.getExpensive());
		//System.out.println(shoppingCart.getExpensive() - ((90 * shoppingCart.getExpensive())/100));
/*	System.out.println(shoppingCart.getCheapest());
		Discount paypal = discountFactory.getDiscount("Paypal");
		final_price = paypal.priceWithDiscount(shoppingCart.getTotalPrice(), shoppingCart.getCheapest());
		System.out.println("The price is $ "+final_price);*/
		Discount creditCard = discountFactory.getDiscount("Credit Card");
		
		final_price = creditCard.priceWithDiscount(shoppingCart.getTotalPrice(), 0);
		System.out.println("The price is $ "+final_price);	
	}
}
