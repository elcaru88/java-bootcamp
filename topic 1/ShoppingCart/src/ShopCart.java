import java.util.ArrayList;
import java.util.Iterator;

public class ShopCart {
	ArrayList<Item> itemsBuyer;
	ArrayList<Item> itemsStock;
	Integer id;

	public ShopCart() {
		itemsBuyer = new ArrayList<>();
		itemsStock = new ArrayList<>();
		id=0;
	}
	
	public ArrayList<Item> StockItems() {
		Item is1 = new Item("dvd", 1.2, 20);
		Item is2 = new Item("blu ray", 1.6, 10);
		Item is3 = new Item("cd", 0.8, 10);
		itemsStock.add(is1);
		itemsStock.add(is2);
		itemsStock.add(is3);
		return itemsStock;
	}
	
	public void addProduct(String name,double price,int quant) {
		Item i = new Item(name, price, quant);
		if (itemsStock.contains(name)) {
			System.out.println("item disp");
		}
		itemsBuyer.add(i);
	}
	
	
	public ArrayList<Item> getItems() {
		return itemsBuyer;
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
			boolean set=false;//seteo disabled
			double cheap=0;//= 100;
			double aux= 0;
			Iterator<Item> it = itemsBuyer.iterator();
			while(it.hasNext()) {
			Item v = it.next();
			//System.out.print(v);
			aux= v.getPrice();
			if (aux<=cheap || set==false) {//search cheap
				cheap= aux;
				set=true;
			}
			
			}
			System.out.println(cheap);
			totalDiscount=totalPrice()-cheap;//cambio new
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
			Iterator<Item> it = itemsBuyer.iterator();
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
		
		Iterator<Item> it = itemsBuyer.iterator();
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
