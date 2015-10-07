package com.model;

import java.util.HashSet;
import java.util.Set;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Account {

	@OneToMany(mappedBy = "account")
	private Set<ShoppingCart> shoppingCart = new HashSet<>();
	

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
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

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result
				+ ((password == null) ? 0 : password.hashCode());
		result = prime * result
				+ ((userName == null) ? 0 : userName.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Account other = (Account) obj;
		if (password == null) {
			if (other.password != null)
				return false;
		} else if (!password.equals(other.password))
			return false;
		if (userName == null) {
			if (other.userName != null)
				return false;
		} else if (!userName.equals(other.userName))
			return false;
		return true;
	}

	public boolean equals(String newUserName){
		boolean exist = false;
		if(userName.equalsIgnoreCase(newUserName)){
			exist=true;
		}
		return exist;
	}
	
	
}