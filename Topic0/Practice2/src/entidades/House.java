package entidades;

public class House{
	
	private String adress;
	private String color;
	private double price;
	public String getAdress() {
		return adress;
	}
	public void setAdress(String adress) {
		this.adress = adress;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	
	public String toString() {
		return "Adress:" + adress + ", Color:" + color + ", value:" + price ;
	}
	
	
}
