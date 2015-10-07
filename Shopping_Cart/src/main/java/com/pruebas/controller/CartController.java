package com.pruebas.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.pruebas.model.Cart;
import com.pruebas.service.CartServiceImp;

@RestController
@RequestMapping("/cart")
public class CartController {
	
	@Autowired
	private CartServiceImp cartServiceImp;
	
	@RequestMapping(value = "/buy", method = RequestMethod.POST, produces = "application/json")
	public ResponseEntity<Cart> createCart(@RequestBody Cart cart) {
		cartServiceImp.addEntity(cart);
		return new ResponseEntity<Cart>(cart, HttpStatus.OK);
	}
	
	public void pay() {
		
	}

}
