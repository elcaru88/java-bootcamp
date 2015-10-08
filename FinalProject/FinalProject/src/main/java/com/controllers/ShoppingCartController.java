package com.controllers;

import java.util.Collection;

import com.exception.UserNotFoundWrongPassException;
import com.model.ShoppingCart;
import com.service.AccountService;
import com.service.ProductService;
import com.service.ShoppingCartService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/{userId}/shoppingCart")
public class ShoppingCartController {

	@Autowired
	private ShoppingCartService shoppingCartService;

	@Autowired
	private AccountService accountService;

	@Autowired
	private ProductService productService;

	private void validateUser(String userId) {
		accountService.findByUserName(userId);

		if (accountService.existUserName(userId)) {
		}

		else
			throw new UserNotFoundWrongPassException(userId);
	}

	@RequestMapping(method = RequestMethod.POST)
	void createCart(@PathVariable String userId) {
		this.validateUser(userId);
		
		shoppingCartService.createShoppingCart(
				new ShoppingCart(accountService.findByUserName(userId)));
	}

	@RequestMapping(value = "/{shoppingCartId}", method = RequestMethod.GET)
	ShoppingCart getShoppingCart(@PathVariable String userId,
			@PathVariable Long shoppingCartId) {
		validateUser(userId);

		return shoppingCartService.getShoppingCart(userId, shoppingCartId);
	}

	@RequestMapping(method = RequestMethod.GET)
	Collection<ShoppingCart> getShoppingCart(@PathVariable String userId) {
		validateUser(userId);
		return shoppingCartService.findByAccountUsername(userId);
	}

	@RequestMapping(value = "/{shoppingCartId}/{productName}", method = RequestMethod.POST)
	public void addProduct(@PathVariable String userId,
			@PathVariable("shoppingCartId") Long shoppingCartId,
			@PathVariable("productName") String productName) {

		validateUser(userId);

		shoppingCartService.addProduct(userId, shoppingCartId,
				productService.getProductByName(productName));

	}

	@RequestMapping(value = "/{shoppingCartId}", method = RequestMethod.DELETE)
	public void deleteShoppingCart(@PathVariable String userId,
			@PathVariable("shoppingCartId") Long shoppingCartId) {
		
		validateUser(userId);

		shoppingCartService.deleteShoppingCart(shoppingCartId);
	}

}
