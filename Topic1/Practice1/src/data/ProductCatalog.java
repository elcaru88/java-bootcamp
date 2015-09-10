package data;

import java.util.ArrayList;
import java.util.Collections;

import entities.Product;
import entities.ProductComparator;

public class ProductCatalog {
	
	private  ArrayList<Product> productos = new ArrayList<Product>();
	private static int lastId = 1;
	
	
	public ProductCatalog(){
		
		productos.add( new Product(lastId, "Notebook" , 8000));
		IncrementLastID();
		productos.add( new Product(lastId, "Mouse" , 200));
		IncrementLastID();
		productos.add( new Product(lastId,"Teclado" , 300));
		IncrementLastID();
		productos.add( new Product(lastId, "Memoria Ram" , 2000));
		IncrementLastID();
		productos.add( new Product(lastId, "Monitor" ,3500));
		IncrementLastID();
		productos.add( new Product(lastId, "Parlantes" , 400));
		IncrementLastID();
		

		
		
	}
	
	public void IncrementLastID(){
		lastId += 1;
	}
	
	public static int getLastId() {
		return lastId;
	}


	public Product getProduct(int id){
		for (Product p : productos) {
			
			if (p.getId() == id) {
				return p;
			}
		}
		return null;
	}
	
	public void ListProducts(){
		for (Product p : productos) {	
			System.out.println("Id: "+p.getId()+" Product: "+ p.getProuctName()+" Price :"+ p.getProductPrice() +"\n");	
		}
	}
	
	public void sortProductsByPrice(){
		
		Collections.sort( productos ,new ProductComparator());
		
	}
	

}
