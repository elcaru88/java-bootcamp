package entities;
import java.util.ArrayList;


public class Cart {
	
	ArrayList<Item> items;
	double totalPrice;
	
	public Cart(){
		this.items = new ArrayList<Item>();
		this.totalPrice = 0;
	}
	
	public void addToCart(Item item)
    { 
		items.add(item);
		totalPrice += item.getProduct().getProductPrice();
    }
	
	public String toString(){
		String text = "";
		for (Item item : items) {
			text = text + "Producto:  "+ item.product.getProuctName()+" Cantidad: "+ item.getQuantity()+" Precio "+ item.product.getProductPrice()+"\n";
		}
		text +=(" Precio total Acumulado: "+ totalPrice);
		return text;
	}

}
