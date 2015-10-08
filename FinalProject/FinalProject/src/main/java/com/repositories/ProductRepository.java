package com.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.model.Product;

public interface ProductRepository extends JpaRepository<Product, Long>{
	
	Product findByName(String name);
	
	List<Product> findByCategory(String category);

}
