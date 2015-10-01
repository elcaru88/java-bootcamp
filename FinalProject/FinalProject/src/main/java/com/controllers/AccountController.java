package com.controllers;

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

	@RequestMapping(value = "", method = RequestMethod.POST)
	public void createAccount(@RequestBody Account account) {
		accountService.createAccount(account);

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
}
