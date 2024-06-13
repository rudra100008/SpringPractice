package com.springCore.SpringCore.CICollection;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class QuizApp {
public static void main(String[] args) {
	try(ClassPathXmlApplicationContext context=new ClassPathXmlApplicationContext(new String[]{"quizContext.xml"})) {
		Question question = (Question) context.getBean("question");
		System.out.println(question);
		
	}catch (Exception e) {
		e.printStackTrace();
	}
}
}
