package com.billdesk.evm.merchantdemoserver.serviceimpl;

import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
import com.billdesk.evm.merchantdemoserver.model.Payment;
import com.billdesk.evm.merchantdemoserver.service.PaymentService;

@Service
public class PaymentServiceImpl implements PaymentService{

	@Override
	public Payment makePayment() {
		RestTemplate restTemplate = new RestTemplate();
		Payment payment1 = restTemplate.getForObject("https://gturnquist-quoters.cfapps.io/api/random", Payment.class);
		return payment1;
	}

}
