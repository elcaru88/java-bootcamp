package com.controllers;

import java.util.Collection;
import com.model.ShoppingCart;
import com.service.AccountService;
import com.service.ShoppingCartService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
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

	private void validateUser(String userId) {
		if (!accountService.findByUserName(userId))
			throw new UserNotFoundWrongPassException(account.userName);
	}

	@RequestMapping(method = RequestMethod.POST)
	void add(@PathVariable String userName,
			@RequestBody ShoppingCart input) {
		this.validateUser(userName);
		shoppingCartService.createShoppingCart(
				new ShoppingCart(accountService.findByUserName(userName)));
	}

	@RequestMapping(value = "/{shoppingCartId}", method = RequestMethod.GET)
	ShoppingCart getShoppingCart(@PathVariable String userId,
			@PathVariable Long shoppingCartId) {
		validateUser(userId);
		return shoppingCartService.getShoppingCart(shoppingCartId);
	}

	@RequestMapping(method = RequestMethod.GET)
	Collection<ShoppingCart> getShoppingCart(@PathVariable String userName) {
		validateUser(userName);
		return shoppingCartService.findByAccountUsername(userName);
	}

	@RequestMapping(value = "/{shoppingCartId}", method = RequestMethod.PUT)
	public void updateShoppingCart(@PathVariable String userName,
			@PathVariable("shoppingCartId") Long shoppingCartId,
			@RequestBody ShoppingCart shoppingCart) {
		validateUser(userName);

		this.shoppingCartService.updateShoppingCart(shoppingCart);
	}

	@RequestMapping(value = "/{shoppingCartId}", method = RequestMethod.DELETE)
	public void deleteShoppingCart(@PathVariable String userName,
			@PathVariable("shoppingCartId") Long shoppingCartId) {
		validateUser(userName);

		this.shoppingCartService.deleteShoppingCart(shoppingCartId);
	}

}

