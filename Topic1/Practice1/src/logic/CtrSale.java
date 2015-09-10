package logic;

import java.util.Scanner;

import data.ProductCatalog;
import data.SalesCatalog;
import entities.Cart;
import entities.Cash;
import entities.CreditCard;
import entities.Item;
import entities.PayPal;
import entities.PaymentMethod;
import entities.Sale;

public class CtrSale {
	
	public static void main(String[] args) {
		
		
		try {
			
			
			
			Cart actualCart = new Cart();
			PaymentMethod actualPaymentMethod = null;
			
			
			SalesCatalog salesCatalog = new SalesCatalog();
			ProductCatalog catalogo = new ProductCatalog();
			
			System.out.println("WELCOME TO THE SHOP  \n");
			
			
			@SuppressWarnings("resource")
			Scanner scan = new Scanner(System.in);
			int productId;
			int quantity;
			
			// HOW TO SHOW PRODUCTS//
			
			int show ;
			{
				System.out.println(" Show List by Price press // 1  //  or by Product Code press // 2 //? \n");
				show = Integer.parseInt(scan.next());
				if (show == 1) {
					catalogo.sortProductsByPrice();
					System.out.println( " LIST OF PRODUCTS BY PRICE \n");
				}else if (show == 2) {
					System.out.println( " LIST OF PRODUCTS BY CODE \n");
				}else
				{
					System.out.println("Check your choice \n");
				}
				
			} while ( show != 2 && show != 1 ); 
			
			//SELECCION DE PRODUCTOS //
			String keepShopping;
			do
	        {
			  catalogo.ListProducts();
				
	          System.out.print ("Enter the Product's NUMBER: \n");
	          do {
	        	  productId = Integer.parseInt(scan.next());
			} while (productId > ProductCatalog.getLastId());

	          System.out.print ("Enter the QUANTITY: \n");
	          quantity = Integer.parseInt(scan.next());

	          Item item = new Item( catalogo.getProduct(productId), quantity);
	          
	          actualCart.addToCart(item);
	          
	          System.out.println(actualCart);

	          System.out.print ("Continue shopping (y/n)? ");
	          keepShopping = scan.next();
	         }
	         while (keepShopping.equals("y"));
					
			int op = 0;
			
			while (op != 1 && op != 2 && op!=3 ) 
		     {
		    	 System.out.println("CHOOSE A PAYMENT METHOD");
		    	 System.out.println(" ");
			     System.out.println("  1 CASH   ,  2 CREDIT CARD    , 3 PAYPAL");
			     op = Integer.parseInt(scan.next());
			     switch (op) {
				case 1:
					actualPaymentMethod = new Cash();
					actualCart.setTotalPrice( actualCart.getTotalPrice() - actualPaymentMethod.calculateDiscount(actualCart) );
					break;
				case 2:
					System.out.println(" Write your NAME please: ");
					String name =  scan.next();
					System.out.println(" Write your CREDIT CARD NUMBER please: ");
					int creditCardNumber =  Integer.parseInt(scan.next());
					actualPaymentMethod = new CreditCard( name , creditCardNumber );
					actualCart.setTotalPrice( actualCart.getTotalPrice() - actualPaymentMethod.calculateDiscount(actualCart) );
					break;
				case 3:
					System.out.println(" Write your Email please: ");
					String email =  scan.next();
					System.out.println(" Write your Password please: ");
					String pass =  scan.next();
					actualPaymentMethod = new PayPal( email , pass);
					actualCart.setTotalPrice( actualCart.getTotalPrice() - actualPaymentMethod.calculateDiscount(actualCart) );
					break;
				default:
					System.out.println(" Invalid number entered ");
					break;
				}
			     
			} 
			
			Sale sale = new Sale( actualCart , actualPaymentMethod , SalesCatalog.getSaleNumber() );
			salesCatalog.IncrementSaleNumber();
			salesCatalog.addSale(sale);
			System.out.println(sale);
			System.out.println("Compra Realizada");
		
			
		} catch (Exception e) {
			System.out.println("Error en el Programa");
			e.printStackTrace();
		}
		finally 
		{
			
		}
	}	
}
