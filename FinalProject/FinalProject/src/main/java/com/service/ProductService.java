package com.service;

import com.model.Product;
import com.repositories.ProductRepository;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;

@Service
public class ProductService {

	@Autowired
	private ProductRepository productRepository;

	public ProductService() {
	}

	public Product createProduct(Product product) {
		return productRepository.save(product);
	}

	public Product getProductByName(String name) {
		return productRepository.findByName(name);
	}

	public Product getProductByCategory(String category) {
		return productRepository.findByCategory(category);
	}

	public String getAllProducts() {

		return productRepository.findAll().toString();
	}
}
