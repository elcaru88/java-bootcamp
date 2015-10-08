package com.service;

import java.util.Collection;

import com.model.Product;
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

	public ShoppingCart getShoppingCart(String userName , long id) {
		System.out.println(shoppingCartRepository.findByAccountUserNameAndId(userName, id));
		return shoppingCartRepository.findByAccountUserNameAndId(userName, id);
		
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
	
	public void addProduct(String userId,long id,Product product) {
	
		ShoppingCart shoppingCart = shoppingCartRepository.findByAccountUserNameAndId(userId, id);
		System.out.println(shoppingCart);
		
		shoppingCart.products.add(product);
		
		System.out.println(shoppingCart);
		
		shoppingCartRepository.save(shoppingCart);
		
		System.out.println(shoppingCart);
	}
	
	
}
