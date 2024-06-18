package com.springCore.SpringCore.SICollection;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
	public static void main(String[] args) {
		try(ClassPathXmlApplicationContext context=new ClassPathXmlApplicationContext(new String[] {"SIcontext.xml"})){
			Question question =(Question)context.getBean("question");
			System.out.println(question);
		}catch (Exception e) {
			e.printStackTrace();
		}
	}

}
