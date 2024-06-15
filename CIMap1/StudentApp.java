package com.springCore.SpringCore.CIMap1;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class StudentApp {
public static void main(String[] args) {
	try(ClassPathXmlApplicationContext context=new ClassPathXmlApplicationContext(new String[] {"StudentApp.xml"})){
		Student student1=(Student)context.getBean("student1");
		Student student2=(Student)context.getBean("student2");
		Student student3=(Student)context.getBean("student3");
		System.out.println(student1);
		System.out.println(student2);
		System.out.println(student3);
	}catch(Exception e) {
		e.printStackTrace();
	}
}
}
