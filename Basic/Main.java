package com.springCore.Basic;


import java.util.List;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
public static void main(String[] args) {
	try {
		@SuppressWarnings("resource")
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
		
		List<Student> students=context.getBean("student3",List.class);
		for(Student s:students) {
			System.out.println(s);
		}
		/*
		 * Student student1=context.getBean("student1",Student.class); Student
		 * student2=context.getBean("student2",Student.class);
		 * System.out.println(student1+"\n"+student2);
		 */
		
	}catch (Exception e) {
		e.printStackTrace();
	}
}
}
