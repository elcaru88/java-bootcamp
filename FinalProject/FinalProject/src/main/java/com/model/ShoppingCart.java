package com.model;

import java.util.ArrayList;
import java.util.List;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
public class ShoppingCart {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;

	
	@JsonIgnore
	@ManyToOne
	private Account account;

	@ManyToMany
	public List<Product> products;
	
	
	public ShoppingCart() {
		products = new ArrayList<Product>();
		
	}

	public ShoppingCart(Account account) {
	
		this.account = account;

	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public Account getAccount() {
		return account;
	}

	public void setAccount(Account account) {
		this.account = account;
	}

	public List<Product> getProducts() {
		return products;
	}

	public void setProducts(List<Product> products) {
		this.products = products;
	}
	
	
	@Override
	public String toString() {
		return "ShoppingCart [id=" + id + ", account=" + account
				+ ", products=" + products + "]";
	}

	

}