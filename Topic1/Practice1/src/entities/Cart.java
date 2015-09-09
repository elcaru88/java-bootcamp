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
		text +=(" SubTotal : "+ totalPrice);
		return text;
	}
	
	public Item getCheapestItem(){
		double cheapestPrice = 100000000;
		Item cheapestItem = null;
		for (Item i : items) {
			if (cheapestPrice > i.product.getProductPrice()) {
				cheapestItem = i;
			}
		}
		return cheapestItem;
		
	}
	
	public Item getExpItem(){
		double expPrice = 0;
		Item expItem = null;
		for (Item i : items) {
			if (expPrice < i.product.getProductPrice()) {
				expItem = i;
			}
		}
		return expItem;
		
	}

	public double getTotalPrice() {
		return totalPrice;
	}

	public void setTotalPrice(double totalPrice) {
		this.totalPrice = totalPrice;
	}

}
