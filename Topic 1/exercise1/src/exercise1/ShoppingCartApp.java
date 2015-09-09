package exercise1;

import java.util.Scanner;

public class ShoppingCartApp {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		ShoppingCart shoppingCart = new ShoppingCart();

		Product Music_cd = new Product("Music cd", 20.5);
		Product lamp = new Product("lamp", 50);
		Product pc = new Product("pc", 2500.00);

		String input;
		boolean state = true;
		
		DiscountFactory discountFactory = new DiscountFactory();
		double final_price;

		System.out.println("Welcome");
		while (state) {
			System.out
					.println("Choose one of the following products or imput done");
			System.out.println("cd, lamp,pc ");
			input = scanner.nextLine();

			switch (input) {
			case "cd":
				shoppingCart.add(Music_cd);
				break;
			case "lamp":
				shoppingCart.add(lamp);
				break;
			case "pc":
				shoppingCart.add(pc);
				break;
			case "done":
				state=false;
				break;
				
			default:
				System.out.println("product not found");
				break;
			}

		}

		System.out.println(shoppingCart.toString());
		
		System.out.println("How do you like to pay");
		System.out.println("Credit card, Paypal , Cash");
		input = scanner.nextLine();
		switch (input.toLowerCase()) {
		case "credit card":
			Discount creditCard = discountFactory.getDiscount("Credit Card");
			System.out.println(" Name and a Credit Number is required");
			input = scanner.nextLine();
			input = scanner.nextLine();
			final_price = creditCard.priceWithDiscount(shoppingCart.getTotalPrice(), 0);
			System.out.println("The price is $ "+final_price);	
			break;
		case "paypal":
			Discount paypal = discountFactory.getDiscount("Paypal");
			System.out.println("Email and a password is required");
			input = scanner.nextLine();
			input = scanner.nextLine();
			final_price = paypal.priceWithDiscount(shoppingCart.getTotalPrice(), shoppingCart.getCheapest());
			System.out.println("The price is $ "+final_price);
			break;
		case "cash":
			Discount cash = discountFactory.getDiscount("cash");
			final_price = cash.priceWithDiscount(shoppingCart.getTotalPrice(), shoppingCart.getExpensive());
			System.out.println("The price is $ "+final_price);
			break;
		default:
			System.out.println("method not found");
			break;
		}
		
	}
}
