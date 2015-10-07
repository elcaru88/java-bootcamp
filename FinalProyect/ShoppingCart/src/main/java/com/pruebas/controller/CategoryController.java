package com.pruebas.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.pruebas.model.Category;
import com.pruebas.model.Product;
import com.pruebas.service.CategoryService;

@RestController
@RequestMapping (value="/category")
public class CategoryController {
	
	CategoryService categoryService;
	
	@Autowired
	public CategoryController (CategoryService categoryService) {
		this.categoryService = categoryService;
	}
	
	 // method to Find products by category 
	@RequestMapping(value="/listProductsById/{id}")
	public ResponseEntity<?> listById(@PathVariable int id){
		Category category = this.categoryService.getEntity(id);
	    List<Product> products = category.getProductList();
	    return new ResponseEntity<List<Product>>( products, HttpStatus.OK);
	}
	
	// method to find a Category by Id
	@RequestMapping(value="/list/{id}" , method = RequestMethod.GET)
	public ResponseEntity<?> getCategory(@PathVariable int id) {
	       Category category = this.categoryService.getEntity(id);
		   return new ResponseEntity<Category>( category, HttpStatus.OK);
	}
	
}
