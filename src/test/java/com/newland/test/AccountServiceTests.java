package com.newland.test;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.newland.test.service.AccountService;

@RunWith(SpringRunner.class)
@SpringBootTest
public class AccountServiceTests {
	
	@Autowired
	private AccountService accountService; 
	
	@Test
	public void addAccount() {
		accountService.addAccount();
	}

	@Test
	public void updateAccount() {
		accountService.updateAccount();
	}

//	@Test
//	public Account queryAccount() {
//		System.out.println("queryAccount");
//		return new Account();
//	}

	@Test
	public void deleteAccount() {
		accountService.deleteAccount();
	}

	public AccountService getAccountService() {
		return accountService;
	}

	public void setAccountService(AccountService accountService) {
		this.accountService = accountService;
	}

}
