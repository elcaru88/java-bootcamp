package com.pruebas.dto;

public class ItemDTO {

	private int idcart;
	private int idproduct;
	private int quantity;
	
	public ItemDTO(int idcart, int idproduct, int quantity) {
		super();
		this.idcart = idcart;
		this.idproduct = idproduct;
		this.quantity = quantity;
	}

	public int getIdproduct() {
		return idproduct;
	}

	public void setIdproduct(int idproduct) {
		this.idproduct = idproduct;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public int getIdcart() {
		return idcart;
	}

	public void setIdcart(int idcart) {
		this.idcart = idcart;
	}
}
