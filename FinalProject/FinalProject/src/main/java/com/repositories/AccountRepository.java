package com.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.model.Account;

public interface AccountRepository extends JpaRepository<Account, Long> {

	Account findByUserName(String userName);

}