package com.model;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

@Entity
public class ShoppingCart {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long shoppingCartId;

	@ManyToOne
	private Account account;

	@OneToMany(mappedBy = "shoppingCart")
	public Set<Product> products = new HashSet<>();

	public ShoppingCart() {
	}

	public ShoppingCart(Account account) {
		super();
		this.account = account;

	}

	public long getShoppingCartId() {
		return shoppingCartId;
	}

	public void setShoppingCartId(long shoppingCartId) {
		this.shoppingCartId = shoppingCartId;
	}

	public Account getAccount() {
		return account;
	}

	public void setAccount(Account account) {
		this.account = account;
	}

	public Set<Product> getProduct() {
		return products;
	}


}