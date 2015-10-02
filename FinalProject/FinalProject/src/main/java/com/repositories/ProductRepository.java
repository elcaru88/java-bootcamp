package com.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.model.Product;

public interface ProductRepository extends JpaRepository<Product, Long>{
	
	Product findByName(String name);
	
	Product findByCategory(String category);

}
