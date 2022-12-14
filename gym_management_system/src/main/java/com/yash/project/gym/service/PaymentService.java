package com.yash.project.gym.service;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;

import com.yash.project.gym.model.Payment;
import com.yash.project.gym.repository.PaymentRepo;

@Service
public class PaymentService {
	
	@Autowired 
	PaymentRepo pRepoObj;

	public void save_Payment(Payment payObj) {
		
		pRepoObj.save(payObj);
	}

	public Object getPaymentforAdmin() {
		
			return pRepoObj.findAll();
	}
//-------------------------save payement method---------------------------------
//	public void addpayement(Payment objpayment)
//	{
//		pRepoObj.save(objpayment);
//	}
}
