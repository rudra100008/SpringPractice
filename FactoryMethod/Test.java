package com.SpringCore.Spring.FactoryMethod;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
	
	
	public static void main(String[] args) {
		try(ClassPathXmlApplicationContext context=new ClassPathXmlApplicationContext("com/SpringCore/Spring/FactoryMethod/factorycontext.xml")){
			A a=(A)context.getBean("a");
			a.message();
		}catch (Exception e) {
			e.printStackTrace();
		}
	}

}
