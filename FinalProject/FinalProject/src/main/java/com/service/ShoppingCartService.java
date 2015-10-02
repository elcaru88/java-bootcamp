package com.service;

import java.util.Collection;

import com.model.ShoppingCart;
import com.repositories.ShoppingCartRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ShoppingCartService {

	@Autowired
	private ShoppingCartRepository shoppingCartRepository;

	public ShoppingCartService() {
	}

	public ShoppingCart createShoppingCart(ShoppingCart shoppingCart) {
		return shoppingCartRepository.save(shoppingCart);
	}

	public ShoppingCart getShoppingCart(long id) {
		return shoppingCartRepository.findOne(id);
	}

	public void updateShoppingCart(ShoppingCart shoppingCart) {
		shoppingCartRepository.save(shoppingCart);
	}

	public void deleteShoppingCart(Long id) {
		shoppingCartRepository.delete(id);
	}

	public Collection<ShoppingCart> findByAccountUsername(String userName) {
		
		return shoppingCartRepository.findByAccountUserName(userName);
	}

}
