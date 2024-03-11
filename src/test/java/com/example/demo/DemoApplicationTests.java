package com.example.demo;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.example.demo.controller.AccountController;

@SpringBootTest
class DemoApplicationTests {

	@Autowired
	AccountController accountController;
	
	@Test
	void contextLoads() {
	}
	
	@Test
	String testMsg() {
		return accountController.getMsg();
	}

}
