import java.util.Scanner;

public class DemoShop {
	private static String op,op3;
	public static void main(String[] args) {
		ShopCart shop = new ShopCart();
		//String op,op3;
		
		do {
			
		System.out.println("Shopping Cart \n");
		Scanner in = new Scanner(System.in);
		//System.out.println("Buy a product? Y/N");
		
		do {
			System.out.println("Insert item");
			String name = in.nextLine();
		
			System.out.println("Insert price");
			double price =Double.parseDouble(in.nextLine());
			System.out.println("Insert quantity");
			Integer quant =Integer.parseInt(in.nextLine()) ;
			
			shop.addProduct(name, price, quant);
			
			System.out.println("Add more items? Y/N");
			op = in.nextLine();
		}while (op.equals("y"));
		
		
		//metodo pago
		System.out.println("Insert payment type");
		System.out.println("1-Credit Card  2-Paypal  3-Cash");
		
		int op2=Integer.parseInt(in.nextLine());
		double finalPrice= 0;
		switch (op2) {
		case 1: 
			System.out.println("Insert your name");
			String userName= in.nextLine();
			System.out.println("Insert your credit Card Number");
			Integer creditNumber= Integer.parseInt(in.nextLine());
			
			//System.out.println("Discount %10 "+ shop.creditCardOperation(userName, creditNumber));
			finalPrice= shop.creditCardOperation(userName, creditNumber);
			break;
		case 2: 
			System.out.println("Insert your email");
			String email= in.nextLine();
			System.out.println("Insert your password");
			String password= in.nextLine();
			finalPrice=shop.paypalOperation(email, password);
			break;
		case 3: System.out.println("Payment succes");
			finalPrice=shop.cashOperation();
			break;
		

		default:
			break;
		}
		

		System.out.println("detalle");
		System.out.println(shop.getItems());
		
		System.out.println("calcular");
		System.out.println("Total price "+ shop.totalPrice());
		System.out.println("Final price "+ finalPrice);
		System.out.println("payment transaction " + shop.idTransaction());
		
		System.out.println("Buy more items? Y/N");
		op3 = in.nextLine();
		//in.close();
		} while (op3.equals("y"));
		
	}

}
