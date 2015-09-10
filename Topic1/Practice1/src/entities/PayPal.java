package entities;

public class PayPal extends PaymentMethod{
	
	private String email;
	private String pass;
	
	public PayPal(String email, String pass) {
		this.email = email;
		this.pass = pass;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPass() {
		return pass;
	}

	public void setPass(String pass) {
		this.pass = pass;
	}
	
    // EN ESTE METODO PUSE QUE DESCUENTA LA TOTALIDAD DEL PRODUCTO MAS BARATO//
	@Override
	public double calculateDiscount(Cart cart) {
		double discount = cart.getCheapestItem().getProduct().getProductPrice() * cart.getCheapestItem().getQuantity();
		return discount;
	}



}
