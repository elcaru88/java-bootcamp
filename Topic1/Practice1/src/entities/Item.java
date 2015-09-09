package entities;

public class Item {
	
	Product product;
	int quantity;
	
	public Item(Product product, int qty){
		this.product = product;
		this.quantity = qty;
	}

	public Product getProduct() {
		return product;
	}

	public void setProduct(Product product) {
		this.product = product;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	
	

}
