package com.example.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/demo")
public class AccountController {

//	@Autowired
//	AccountService accountService;
	
//	@PostMapping("/setAccount")
//	public Account setAccount(@RequestBody Account account) {
//		return accountService.setAccount(account);
//	}
//	
//	@GetMapping("/getAccounts")
//	public List<Account> getAccounts(){
//		return accountService.getAccounts();
//	}

	@GetMapping("/msg")
	public String getMsg(){
		return "Working?";
	}
	}
