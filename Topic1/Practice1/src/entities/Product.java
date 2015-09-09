package entities;

public class Product {
	
	private int id;
	private String prouctName;
	private double productPrice;
	
	public Product(int id , String name , double price){
		this.id = id;
		this.productPrice = price;
		this.prouctName = name;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getProuctName() {
		return prouctName;
	}

	public void setProuctName(String prouctName) {
		this.prouctName = prouctName;
	}

	public double getProductPrice() {
		return productPrice;
	}

	public void setProductPrice(double productPrice) {
		this.productPrice = productPrice;
	}
	
	

}
