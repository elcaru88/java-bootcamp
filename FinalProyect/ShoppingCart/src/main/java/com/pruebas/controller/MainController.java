package com.pruebas.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.pruebas.service.CartService;
import com.pruebas.service.CategoryService;
import com.pruebas.service.ItemService;
import com.pruebas.service.ProductService;

@RestController
@RequestMapping(value="/MainApp")
public class MainController {
	
	CategoryService categoryService;
	ProductService productService;
	ItemService itemService;
	CartService cartService;
	
	@Autowired
	public MainController(CategoryService categoryService, ProductService productService, ItemService itemService,
			CartService cartService) {
		this.categoryService = categoryService;
		this.productService = productService;
		this.itemService = itemService;
		this.cartService = cartService;
	}
	
	
//	@RequestMapping(value="/createCart")
//	public String createCart( @ )
//	
	
	
	
}
