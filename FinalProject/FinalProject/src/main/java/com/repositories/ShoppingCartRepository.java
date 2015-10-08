package com.repositories;

import java.util.Collection;

import org.springframework.data.jpa.repository.JpaRepository;

import com.model.ShoppingCart;

public interface ShoppingCartRepository extends JpaRepository<ShoppingCart, Long>{
	
	 Collection<ShoppingCart> findByAccountUserName(String userName);
	 
	 ShoppingCart findById (long id);
}
