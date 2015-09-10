package entities;

public class Sale {
	
	Cart cart = new Cart();
	PaymentMethod paymentMethod;
	int saleNumber;
	
	public Sale(Cart cart , PaymentMethod paymentMethod , int saleNumber){
		this.cart = cart;
		this.paymentMethod = paymentMethod;
		this.saleNumber = saleNumber;
	}
	
	public Cart getCart() {
		return cart;
	}
	public void setCart(Cart cart) {
		this.cart = cart;
	}
	public PaymentMethod getPaymentMethod() {
		return paymentMethod;
	}
	public void setPaymentMethod(PaymentMethod paymentMethod) {
		this.paymentMethod = paymentMethod;
	}
	public int getSaleNumber() {
		return saleNumber;
	}
	public void setSaleNumber(int saleNumber) {
		this.saleNumber = saleNumber;
	}
	
	public String toString(){
		return "------------------------------------------------------------------------\n"
				+ "Bill NUMBER :"+this.saleNumber+ "\n \n"+ this.cart.toString() ;
	}

}
