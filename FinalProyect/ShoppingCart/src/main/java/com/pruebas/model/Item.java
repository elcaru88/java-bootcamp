package com.pruebas.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.sun.istack.internal.NotNull;


@Entity
@Table(name="items")
public class Item {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "iditem")
	private long iditem;
	
	@NotNull
	@Column(name = "quantity")
	private int quantity;

	@ManyToOne
	@JoinColumn(name = "idcart")
	private Cart cart;

	@ManyToOne
	@JoinColumn(name = "idprodut")
	private Product product;
	
	public Item() {
		
	}

	public Item( int quantity, Cart cart, Product product) {
		super();
		this.quantity = quantity;
		this.product = product;
	}

	public long getIditem() {
		return iditem;
	}

	public void setIditem(long iditem) {
		this.iditem = iditem;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public Product getProduct() {
		return product;
	}

	public void setProduct(Product product) {
		this.product = product;
	}
	
}
