package com.pruebas.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.pruebas.model.Product;
import com.pruebas.service.ProductServiceImp;

@RestController
@RequestMapping("/product")
public class ProductController {
	
	@Autowired
	private ProductServiceImp productServiceImp;
	
	@RequestMapping(value = "/list", method = RequestMethod.GET)
	 public List<Product> listProduct(){
		List<Product> product = productServiceImp.getEntities();        //
		return product;
	 }
	
	@RequestMapping(value = "/create", method = RequestMethod.POST, produces = "application/json")
	public ResponseEntity<Product> createProduct(@RequestBody Product product) {
		productServiceImp.addEntity(product);
		return new ResponseEntity<Product>(product, HttpStatus.OK);
	}

}
