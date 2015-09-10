package exercise1;

public class Paypal extends Discount{

	private String email,password;
	
	public Paypal(String email, String password) {
		this.email = email;
		this.password = password;
	}

	
	public Paypal() {
	
	}


	public String getEmail() {
		return email;
	}


	public void setEmail(String email) {
		this.email = email;
	}


	public String getPassword() {
		return password;
	}


	public void setPassword(String password) {
		this.password = password;
	}


	public double priceWithDiscount(double price, double extraInfo) {
		return price - extraInfo;
	}

}
