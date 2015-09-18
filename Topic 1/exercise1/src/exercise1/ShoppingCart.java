package exercise1;

import java.util.ArrayList;

public class ShoppingCart {
	
private ArrayList<Product> products;
	
	public ShoppingCart(){
		products = new ArrayList<Product>();
	}

	public void add(Product product){
		products.add(product);
		
	}
	
	public double getTotalPrice(){
		double price = 0.0;
		for (Product product : products) {
			price = price + product.getPrice();
		}
		return price;
	}
	
	public double getCheapest(){
		double cheap = 500;
		for (int i = 0; i < products.size(); i++) {
			if(products.get(i).getPrice() < cheap)
				cheap = products.get(i).getPrice();
		}
		return cheap;
	}
	
	public double getExpensive (){
		double expensive  = 0;
		for (int i = 0; i < products.size(); i++) {
			if(products.get(i).getPrice() > expensive )
				expensive  = products.get(i).getPrice();
		}
		return expensive ;
	}

	@Override
	public String toString() {
		return " " + products + "";
	}
	
	

}