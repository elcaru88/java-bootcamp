
public class Item {
	private String name;
	private Double price;
	private int quantity;
	public Item(String name, Double price , int quantity) {
		super();
		this.name = name;
		this.price = price;
		this.quantity = quantity;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Double getPrice() {
		return price;
	}
	public void setPrice(Double price) {
		this.price = price;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantiti(int quantity) {
		this.quantity = quantity;
	}
	@Override
	public String toString() {
		return "Item name=" + name + ",$ price=" + price + ", quantity=" + quantity + "\n" ;
	}
	
	
	
	
	

}
