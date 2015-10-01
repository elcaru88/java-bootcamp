package com.controllers;

import java.util.Collection;
import com.model.ShoppingCart;
import com.service.AccountService;
import com.service.ShoppingCartService;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

@RestController
@RequestMapping("/{userId}/shoppingCart")
public class ShoppingCartController {

	@Autowired
	private ShoppingCartService shoppingCartService;

	@Autowired
	private AccountService accountService;

	private void validateUser(String userId) {
		accountService.findByUserName(userId).orElseThrow(
				() -> new UserNotFoundException(userId));
	}

	@RequestMapping(method = RequestMethod.POST)
	ResponseEntity<?> add(@PathVariable String userName,
			@RequestBody ShoppingCart input) {
		this.validateUser(userName);
		return  this.accountService
				.findByUserName(userName)
				.map(account -> {
					ShoppingCart result = shoppingCartService
							.createShoppingCart(new ShoppingCart(account));

					HttpHeaders httpHeaders = new HttpHeaders();
					httpHeaders.setLocation(ServletUriComponentsBuilder
							.fromCurrentRequest().path("/{id}")
							.buildAndExpand(result.getShoppingCartId()).toUri());
					return new ResponseEntity<>(null, httpHeaders,
							HttpStatus.CREATED);
				}).get();

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

@ResponseStatus(HttpStatus.NOT_FOUND)
class UserNotFoundException extends RuntimeException {

	public UserNotFoundException(String userId) {
		super("could not find user '" + userId + "'.");
	}
}
