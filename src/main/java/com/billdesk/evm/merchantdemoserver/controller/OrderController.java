package com.billdesk.evm.merchantdemoserver.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class OrderController {
	@PostMapping
	public String makePayment(@RequestBody String payment) {
		return payment;
		
	}
	
	@GetMapping
	public String getPaymentDetatils() {
		return "yes its here";
		
	}
}
