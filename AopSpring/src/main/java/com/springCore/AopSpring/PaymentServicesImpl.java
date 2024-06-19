package com.springCore.AopSpring;

public class PaymentServicesImpl implements PaymentServices {

	@Override
	public void makePayment() {
		System.out.println("Amount Debited.......");
		
		
		System.out.println("Amount Credited.........");
	}

}
