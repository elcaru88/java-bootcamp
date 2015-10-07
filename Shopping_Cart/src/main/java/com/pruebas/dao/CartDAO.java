package com.pruebas.dao;

import java.util.List;

import com.pruebas.model.Cart;

public interface CartDAO {
	
	public boolean addEntity(Cart entity);
	public Cart getEntity (int id);
	public List<Cart> getEntities ();
	public boolean updateEntity (Cart entity);

}
