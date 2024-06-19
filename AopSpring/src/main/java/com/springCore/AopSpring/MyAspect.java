package com.springCore.AopSpring;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;

@Aspect
public class MyAspect {
	@Before("execution(* com.springCore.AopSpring.PaymentServicesImpl.makePayment())")
  public void paymentStart() {
	  System.out.println("Payment Starting..........");
  }
	@After("execution(* com.springCore.AopSpring.PaymentServicesImpl.makePayment())")
	  public void paymentStop() {
		  System.out.println("Payment Stopped..........");
	  }
}
