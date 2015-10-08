package com.controllers;

import java.util.List;

import com.model.Product;
import com.service.ProductService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/product")
public class ProductController {

	@Autowired
	private ProductService productService;

	@RequestMapping(value = "", method = RequestMethod.POST)
	public void createProduct(@RequestBody Product product) {
		this.productService.createProduct(product);

	}

	@RequestMapping(value = "", method = RequestMethod.GET)
	public String getAllProduct() {
		return productService.getAllProducts();
	}

	@RequestMapping(value = "/findByName/{name}", method = RequestMethod.GET)
	public Product getProductByName(@PathVariable("name") String name) {
		return productService.getProductByName(name);

	}

	@RequestMapping(value = "/findByCategory/{category}", method = RequestMethod.GET)
	public List<Product> getProductByCategory(@PathVariable("category") String category) {
		return productService.getProductByCategory(category);

	}

}
