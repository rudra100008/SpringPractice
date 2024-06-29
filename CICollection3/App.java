package com.springCore.SpringCore.CICollection3;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
 public static void main(String[] args) {
	try(ClassPathXmlApplicationContext context= new ClassPathXmlApplicationContext("com/springCore/SpringCore/CICollection3/config.xml")){
		Student student=(Student) context.getBean("student");
		System.out.println(student);
	}catch (Exception e) {
	 e.printStackTrace();
	}
}
}
