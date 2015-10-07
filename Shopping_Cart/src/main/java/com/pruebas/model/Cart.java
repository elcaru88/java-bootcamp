package com.pruebas.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "cart")
public class Cart {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "id")
	private int id;
	
	@Column(name = "productid")
	private int productid;
	
	@Column(name = "cantity")
	private int cantity;
	
	@Column(name = "cartid")
	private int cartid;
	
	public Cart() {
		// TODO Auto-generated constructor stub
	}

	public Cart(int productid, int cantity, int cartid) {
		super();
		this.productid = productid;
		this.cantity = cantity;
		this.cartid = cartid;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getProductid() {
		return productid;
	}

	public void setProductid(int productid) {
		this.productid = productid;
	}

	public int getCantity() {
		return cantity;
	}

	public void setCantity(int cantity) {
		this.cantity = cantity;
	}

	public int getCartid() {
		return cartid;
	}

	public void setCartid(int cartid) {
		this.cartid = cartid;
	}

	@Override
	public String toString() {
		return "Cart [id=" + id + ", productid=" + productid + ", cantity=" + cantity + ", cartid=" + cartid + "]";
	}
	
	

}
