package com.billdesk.evm.merchantdemoserver.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import com.billdesk.evm.merchantdemoserver.model.Payment;
import com.billdesk.evm.merchantdemoserver.service.PaymentService;

@RestController
public class OrderController {
	@Autowired
	private PaymentService payementService;
	@PostMapping
	public Payment makePayment(@RequestBody String paymentRequest) {
		//post to 3ds 
		//response from 3ds send back to client.
		Payment payment2 = payementService.makePayment();
		
		return payment2;
		
	}
	
	@GetMapping
	public String getPaymentDetatils() {
		return "yes its here";
		
	}
}
