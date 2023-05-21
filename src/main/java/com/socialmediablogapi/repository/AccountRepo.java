package com.socialmediablogapi.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.socialmediablogapi.model.Account;

@Repository
public interface AccountRepo extends JpaRepository<Account, Integer> {

	 Account findByUsername(String username);
}
