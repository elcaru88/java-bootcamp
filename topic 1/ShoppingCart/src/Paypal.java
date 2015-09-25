
public class Paypal {
	private String email;
	private String password;
	public Paypal(String email, String password) {
		super();
		this.email = email;
		this.password = password;
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
	@Override
	public String toString() {
		return "Paypal [email=" + email + ", password=" + password + "]";
	}
	
	

}
