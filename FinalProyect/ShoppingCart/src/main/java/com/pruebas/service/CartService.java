package com.pruebas.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.pruebas.dao.CartDAO;
import com.pruebas.dao.ItemDAO;
import com.pruebas.model.Cart;
import com.pruebas.model.Item;

@Service
public class CartService {
	
	@Autowired
	CartDAO cartDAO;
	
	@Autowired 
	ItemDAO itemDAO;
	
	
	public boolean addEntity(Cart cart) {
		return cartDAO.addEntity(cart);
	}
	
	public Cart getEntity(int id) {
		System.out.println("Service Get Entity Method");
		return cartDAO.getEntity(id);
	}
	
	public List<Cart> getEntities() {
		List<Cart> result = new ArrayList<Cart>();
		for (Cart t : cartDAO.getEntities()) {
			result.add(t);
		}
		return result;
	}
	
	public boolean updateEntity(Cart cart) {
		return cartDAO.updateEntity(cart);
	}

	public String addItem(Item item) {
		
		itemDAO.addEntity(item);
		return item.getQuantity() + " " + item.getProduct().getName()
						+ "Added to cart!";
	}

}
