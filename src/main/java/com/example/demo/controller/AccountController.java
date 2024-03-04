package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.Account;
import com.example.demo.service.AccountService;

@RestController
@RequestMapping("/demo")
public class AccountController {

	@Autowired
	AccountService accountService;
	
	@PostMapping("/setAccount")
	public Account setAccount(@RequestBody Account account) {
		return accountService.setAccount(account);
	}
	
	@GetMapping("/getAccounts")
	public List<Account> getAccounts(){
		return accountService.getAccounts();
	}
}
