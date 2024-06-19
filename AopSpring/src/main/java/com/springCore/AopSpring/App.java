package com.springCore.AopSpring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App 
{
    public static void main( String[] args )
    {
    	ApplicationContext context=new ClassPathXmlApplicationContext("com/springCore/AopSpring/config.xml");
    	
    	PaymentServices ps=context.getBean("paymentService",PaymentServices.class);
    	ps.makePayment();
    }
}
