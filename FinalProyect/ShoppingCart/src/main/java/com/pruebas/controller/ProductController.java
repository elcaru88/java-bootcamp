package com.pruebas.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.pruebas.model.Product;
import com.pruebas.service.ProductService;

@RestController
@RequestMapping(value="/product")
public class ProductController {
	
	ProductService productService;
	
	@Autowired
	public ProductController (ProductService productService) {
	this.productService = productService;
	}
	
	// method serarch products by name
	@RequestMapping(value="/getProductByName" , method = RequestMethod.GET)
	public ResponseEntity<?> getCategory2(@PathVariable String name) {
		List<Product> products = this.productService.getEntities();
		for (Product p : products) {
			if  ( p.getName().equals(name)) {
			}
			else{ products.remove(p);
			}
		}
		return new ResponseEntity<List<Product>>( products,  HttpStatus.OK);
	}
	
	// method to list all products
	@RequestMapping(value="/list" , method = RequestMethod.GET)
	public ResponseEntity<?> getAllProducts(){
		List<Product> products = this.productService.getEntities();
	    return new ResponseEntity<List<Product>>( products, HttpStatus.OK);
	}
	
	// method to get a Product by ID
	@RequestMapping(value="/list/{id}" , method = RequestMethod.GET)
	public ResponseEntity<?> getProduct(@PathVariable int id) {
	       Product product = this.productService.getEntity(id);
		   return new ResponseEntity<Product>( product, HttpStatus.OK);
	}
	
	// Method to Create a Product    
	@RequestMapping(value = "/create", method = RequestMethod.POST)
	public ResponseEntity<?> createUser(@RequestBody Product product) {
	      this.productService.addEntity(product);
		  return new ResponseEntity<Product>( product, HttpStatus.OK);
	}
	
	
}
