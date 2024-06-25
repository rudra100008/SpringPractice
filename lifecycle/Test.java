package com.SpringCore.Spring.lifecycle;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	
	public static void main(String[] args) {
		@SuppressWarnings("resource")
		AbstractApplicationContext context=new ClassPathXmlApplicationContext("com/SpringCore/Spring/lifecycle/lifecycleConfig.xml");
		context.registerShutdownHook();
		Animal animal=(Animal)context.getBean("animal");
		System.out.println(animal);
		
		
		
		System.out.println("------------------------------------------------------------");
		Animal1 animal1=(Animal1)context.getBean("animal1");
		System.out.println(animal1);
		
	}
}
