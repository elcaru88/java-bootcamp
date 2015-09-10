import java.util.ArrayList;
import java.util.Iterator;

public class ShopCart {
	ArrayList<Item> items;
	Integer id;

	public ShopCart() {
		items = new ArrayList<>();
		id=0;
	}
	
	public void addProduct(String name,double price,int quant) {
		Item i = new Item(name, price, quant);
		items.add(i);
	}
	
	
	public ArrayList<Item> getItems() {
		return items;
	}
	
	public double creditCardOperation(String userName, Integer creditNumber) {
		double totalDiscount=0;
		boolean ok;
		CreditCardPayment payment1 = new CreditCardPayment();
		ok= payment1.payment(userName, creditNumber);
		System.out.println("Payment Status "+ok);
		//descuento
		if (ok==true) {
			totalDiscount=totalPrice()-((totalPrice()*10)/100);
		}
		
		return totalDiscount;
	}
	
	public double paypalOperation(String email, String password) {
		double totalDiscount=0;
		boolean ok;
		PaypalPayment payment2 = new PaypalPayment();
		ok= payment2.payment(email, password);
		System.out.println("Payment Status "+ok);
		//descuento
		if (ok=true) {
			double cheap= 100;
			double aux= 0;
			Iterator<Item> it = items.iterator();
			while(it.hasNext()) {
			Item v = it.next();
			//System.out.print(v);
			aux= v.getPrice();
			if (aux<=cheap) {//search cheap
				cheap= aux;
			}
			
			}
			System.out.println(cheap);
		}
		
		return totalDiscount;
	}
	
	public double cashOperation() {
		double totalDiscount=0;
		boolean ok;
		
		System.out.println("Payment Status ok");
		//descuento
		if (ok=true) {
			double expen= 0;
			double aux= 0;
			Iterator<Item> it = items.iterator();
			while(it.hasNext()) {
			Item v = it.next();
			//System.out.print(v);
			aux= v.getPrice();
			if (aux>=expen) { //search expensive
				expen= aux;
			}
			
			}
			//System.out.println(expen);
			totalDiscount=totalPrice()-((expen*90)/100);
		}
		
		return totalDiscount;
	}

	public double totalPrice() {
		double tprice= 0;
		
		Iterator<Item> it = items.iterator();
		while(it.hasNext()) {
		Item v = it.next();
		//System.out.print(v);
		tprice= (v.getPrice()*v.getQuantity()) + tprice;

		}
		return tprice;
	}
	
	public int idTransaction() {
		//int id= (int) (Math.random()*10000);
		return id++;
	}

}
