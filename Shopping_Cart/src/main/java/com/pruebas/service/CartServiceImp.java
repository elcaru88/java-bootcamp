package com.pruebas.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.pruebas.dao.CartDAO;
import com.pruebas.model.Cart;

@Service
public class CartServiceImp {
	
	@Autowired
	CartDAO cartDAO;
	
	public boolean addEntity(Cart cart) {
		cartDAO.addEntity(cart);
		return true;
	}

	public Cart getEntity(int id) {
		Cart result = cartDAO.getEntity(id);
		return result;
	}

	public List<Cart> getEntities() {
		List<Cart> result = new ArrayList<Cart>();
		for (Cart cart : cartDAO.getEntities()) {      //
			result.add(cart);
		}
		return result;
	}

	public boolean updateEntity(Cart cart) {
		cartDAO.updateEntity(cart);
		return true;
	}
	

}
