package entities;

public class Item {
	
	private Product product;
	private int quantity;
	private double subTotal;
	
	public double getSubTotal() {
		return subTotal;
	}

	public void setSubTotal(double subTotal) {
		this.subTotal = subTotal;
	}

	public Item(Product product, int qty){
		this.product = product;
		this.quantity = qty;
		this.subTotal = product.getProductPrice() * quantity;
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
	
	public String toString(){
		return this.product.toString() + "  Quantity: "+ this.quantity; 
	}
	
	

}
