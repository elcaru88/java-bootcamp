package data;

import java.util.ArrayList;

import entities.Sale;


public class SalesCatalog {
	
	private  ArrayList<Sale> sales = new ArrayList<Sale>();
	private static int saleNumber = 1;
	
	public void IncrementSaleNumber(){
		saleNumber += 1;
	}

	public static int getSaleNumber() {
		return saleNumber;
	}

	public void addSale( Sale sale){
		sales.add(sale);
	}
	

}
