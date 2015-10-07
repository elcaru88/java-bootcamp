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

	public Account findByUserName(String userName) {
		return accountRepository.findByUserName(userName);
	}

	public void updateAccount(Account account) {
		accountRepository.save(account);
	}

	public void deleteAccount(Long id) {
		accountRepository.delete(id);
	}

	public boolean existUserName(String userName) {
		boolean exist = false;
		Account account = accountRepository.findByUserName(userName);
		if (account.equals(userName)) {
			exist = true;
		}
		return exist;
	}

	public boolean correctPass(String user, String pass) {
		boolean correct = false;
		Account account = accountRepository.findByUserName(user);

		if (account.equals(user, pass)) {
			correct = true;
		}
		return correct;
	}

}