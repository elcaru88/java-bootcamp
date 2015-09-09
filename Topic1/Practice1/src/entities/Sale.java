package entities;

import java.util.Scanner;

import data.ProductCatalog;

public class Sale {
	
	public static void main(String[] args) {
		
		Cart cart = new Cart();
		ProductCatalog catalogo = new ProductCatalog();
		PaymentMethod paymentMethod;
		
		
		System.out.println("WELCOME TO THE SHOP");
		
		Scanner scan = new Scanner(System.in);
		int productId;
		int quantity;

		//SELECCION DE PRODUCTOS //
		String keepShopping;
		do
        {
		  catalogo.ListProducts();
			
          System.out.print ("Enter the Product's NUMBER: ");
          productId = Integer.parseInt(scan.next());

          System.out.print ("Enter the QUANTITY: ");
          quantity = Integer.parseInt(scan.next());

          Item item = new Item( catalogo.getProduct(productId), quantity);
          cart.addToCart(item);
          
          System.out.println(cart);

          System.out.print ("Continue shopping (y/n)? ");
          keepShopping = scan.next();
         }
         while (keepShopping.equals("y"));
		
		// METODO DE PAGO// 
		int op;
		PaymentMethodFactory paymentMethodFactory = new PaymentMethodFactory();
	     
		do 
	     {
	    	 System.out.println("CHOOSE A PAYMENT METHOD");
		     System.out.println("1 CASH , 2 CREDIT CARD , 3 PAYPAL");
		     op = Integer.parseInt(scan.next());     
		} while ((op != 1) || (op !=2) || (op!=3));
	    
	     if (op == 1) {
	    	 paymentMethod = paymentMethodFactory.getPaymentMethod(Methods.CASH);
	     }   
	     if (op == 2) {
	    	 paymentMethod = paymentMethodFactory.getPaymentMethod(Methods.CREDIT);
		     System.out.println(" Pleas write your's CREDIT CARD NUMBER :");
		     int creditCardNumber = Integer.parseInt(scan.next());
		     System.out.println(" Pleas write your's Name:");
		     String name = scan.next();     
		 }	     
		 if (op == 3) {  
			 paymentMethod = paymentMethodFactory.getPaymentMethod(Methods.PAYPAL);
			 
		 }
	}
}
