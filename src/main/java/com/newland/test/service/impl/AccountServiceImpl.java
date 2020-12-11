package com.newland.test.service.impl;

import org.springframework.stereotype.Service;

import com.newland.test.service.Account;
import com.newland.test.service.AccountService;

@Service
public class AccountServiceImpl implements AccountService {

	@Override
	public void addAccount() {
		System.out.println("addAccount");
	}

	@Override
	public void updateAccount() {
		System.out.println("updateAccount");
	}

	@Override
	public Account queryAccount() {
		System.out.println("queryAccount");
		return new Account();
	}

	@Override
	public void deleteAccount() {
		System.out.println("deleteAccount");
	}

}
