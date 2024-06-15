package com.springCore.SpringCore.CICollection2;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class QuizApp {

	public static void main(String[] args) {
		try (ClassPathXmlApplicationContext context=new ClassPathXmlApplicationContext(new String[]{"QuizApp2.xml"})){
			Question question =(Question)context.getBean("question");
			System.out.println(question);
		}catch (Exception e) {
			e.printStackTrace();
		}
	}
}
