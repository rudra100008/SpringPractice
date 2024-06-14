package com.springCore.SpringCore.CICollection;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class QuizApp {
public static void main(String[] args) {
	try(ClassPathXmlApplicationContext context=new ClassPathXmlApplicationContext(new String[]{"quizContext.xml"})) {
		Question question1 = (Question) context.getBean("question1");
		Question question2 = (Question) context.getBean("question2");
		Question question3 = (Question) context.getBean("question3");
		System.out.println(question1);
		System.out.println(question2);
		System.out.println(question3);
	}catch (Exception e) {
		e.printStackTrace();
	}
}
}
