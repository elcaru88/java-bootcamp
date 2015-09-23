package entities;
import java.util.ArrayList;

public class Cart {
	
	ArrayList<Item> items;
	double totalPrice;
	
	public Cart(){
		this.items = new ArrayList<Item>();
		this.totalPrice = 0;
	}
	
	public double getTotalPrice() {
		return totalPrice;
	}

	public void setTotalPrice(double totalPrice) {
		this.totalPrice = totalPrice;
	}

	public ArrayList<Item> getItems() {
		return items;
	}

	public void setItems(ArrayList<Item> items) {
		this.items = items;
	}
	
	public void addToCart(Item item) {
		Item itemOriginal = this.isOnCart(item.getProduct());
		if ( itemOriginal   != null) {
			itemOriginal.setQuantity( itemOriginal.getQuantity() + item.getQuantity());
			itemOriginal.setSubTotal(itemOriginal.getQuantity() * itemOriginal.getProduct().getProductPrice());
			totalPrice += item.getSubTotal();
		}
		else {
			items.add(item);
			totalPrice += item.getSubTotal();
		}
    }
	
	public Item isOnCart(Product product) {
		for (Item item : items) {
			if (item.getProduct().equals(product)) {
				return item;
			}
		}
		return null;
	}

	public String toString(){
		String text = "PRODUCTS SELECTED: \n";
		for (Item item : items) {
			text = text + item.toString()+" \n\n";
		}
		text +=("------------------------------------------------------------- \n TOTALPRICE : "+ totalPrice);
		return text;
	}
	
	public Item getCheapestItem(){
		Item cheapestItem = null;
		for (Item i : items) {
			if (cheapestItem == null || cheapestItem.getProduct().getProductPrice() > i.getProduct().getProductPrice()) {
				cheapestItem = i;
			}
		}
		return cheapestItem;
	}
	
	public Item getExpItem(){
		Item expItem = null;
		for (Item i : items) {
			if ( expItem == null || expItem.getProduct().getProductPrice() < i.getProduct().getProductPrice()) {
				expItem = i;
			}
		}
		return expItem;	
	}

	
	
}
