package com.pruebas.model;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="carts")
public class Cart {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="idcart")
	private int idcart;
	
	// un cart tiene un user
	@ManyToOne
    @JoinColumn(name = "iduser")
	private User user;
	
	// un cart tiene uno o mas items
	@OneToMany(fetch = FetchType.EAGER,  cascade = CascadeType.ALL)
	private List<Item> items;
	
	public Cart() {
		
	}

	public int getIdcart() {
		return idcart;
	}

	public void setIdcart(int idcart) {
		this.idcart = idcart;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public List<Item> getItems() {
		return items;
	}

	public void setItems(List<Item> items) {
		this.items = items;
	}


	
}
