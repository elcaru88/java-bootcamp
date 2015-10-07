package com.controllers;

import com.exception.UserExist;
import com.exception.UserNotFoundWrongPassException;
import com.model.Account;
import com.service.AccountService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/account")
public class AccountController {

	@Autowired
	private AccountService accountService;

	@RequestMapping(method = RequestMethod.POST)
	public void createAccount(@RequestBody Account account ) {
		if(!accountService.existUserName(account.userName))
		accountService.createAccount(account);
		else
			throw new UserExist(account.userName);
	}

	@RequestMapping(value = "/{id}", method = RequestMethod.PUT)
	public void updateAccount(@PathVariable("id") Long id,
			@RequestBody Account account) {
		accountService.updateAccount(account);
	}

	@RequestMapping(value = "/{id}", method = RequestMethod.DELETE)
	public void deleteAccount(@PathVariable("id") Long id) {

		accountService.deleteAccount(id);
	}
	
	
	
	@RequestMapping(method = RequestMethod.GET)
	public String  login(@RequestBody Account account) {
		if(accountService.equals(account))
			return "user granted access";
					
		else
			throw new UserNotFoundWrongPassException(account.userName);
		
	}
	
}