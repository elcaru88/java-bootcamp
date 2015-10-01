package com.service;

import java.util.Optional;

import com.model.Account;
import com.repositories.AccountRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AccountService {

	@Autowired
	private AccountRepository accountRepository;

	public AccountService() {
	}

	public Account createAccount(Account account) {
		return accountRepository.save(account);
	}
	
	public Optional<Account> findByUserName(String userName){
		return accountRepository.findByUserName(userName);
	}

	public void updateAccount(Account account) {
		accountRepository.save(account);
	}

	public void deleteAccount(Long id) {
		accountRepository.delete(id);
	}
	
}