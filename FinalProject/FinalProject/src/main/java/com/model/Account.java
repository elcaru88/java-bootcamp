package com.model;

import java.util.HashSet;
import java.util.Set;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Account {

	@OneToMany(mappedBy = "account")
	private Set<ShoppingCart> shoppingCart = new HashSet<>();
	

	@Id
	@GeneratedValue
	private Long id;

	@JsonIgnore
	public String password;
	public String userName;

	public Account(String name, String password) {
		this.userName = name;
		this.password = password;
	}

	Account() {
	}

	 public Set<ShoppingCart> getShoppingCart() {
	        return shoppingCart;
	    }
	
	public String getPassword() {
		return password;
	}

	public String getUserName() {
		return userName;
	}

}