package com.SpringCore.Spring.CI;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
	public static void main(String[] args) {
		ApplicationContext context=new ClassPathXmlApplicationContext("com/SpringCore/Spring/CI/contextCi.xml");
	    Addition addition=(Addition)context.getBean("add");
	    Addition addition1=(Addition)context.getBean("add1");
	    addition.addition();
	    addition1.addition();
	}

}
