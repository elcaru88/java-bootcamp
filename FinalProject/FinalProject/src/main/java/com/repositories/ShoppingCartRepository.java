package com.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.model.ShoppingCart;

public interface ShoppingCartRepository extends JpaRepository<ShoppingCart, Long> {

	List<ShoppingCart> findByAccountUserName(String userName);

	ShoppingCart findByAccountUserNameAndId(String userName, long id);
}
