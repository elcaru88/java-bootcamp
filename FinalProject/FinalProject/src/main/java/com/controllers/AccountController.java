package com.controllers;

import javax.servlet.http.HttpServletResponse;

import com.exception.UserExist;
import com.exception.UserNotFoundWrongPassException;
import com.model.Account;
import com.service.AccountService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/account")
public class AccountController {

	@Autowired
	private AccountService accountService;

	@RequestMapping(method = RequestMethod.POST)
	public void createAccount(
			@RequestParam(value = "userName", required = true) String userName,
			@RequestParam(value = "password", required = true) String password) {
		if(!accountService.existUserName(userName))
		accountService.createAccount(new Account(userName,password));
		else
		new UserExist(userName);
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
	public void login(
			@RequestParam(value = "userName", required = true) String userName,
			@RequestParam(value = "password", required = true) String password,
			HttpServletResponse response) throws Exception{
		if(accountService.correctPass(userName, password))
			response.sendRedirect("/"+userName+"/shoppingCart");
		else
			new UserNotFoundWrongPassException(userName);
		
	}
	
}