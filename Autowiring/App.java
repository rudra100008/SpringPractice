package com.springCore.SpringCore.Autowiring;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
  public static void main(String[] args) {
	try(ClassPathXmlApplicationContext context =new ClassPathXmlApplicationContext(new String[] {"com/springCore/SpringCore/Autowiring/config.xml"})){
	Student student=(Student)context.getBean("student");
	System.out.println(student);
	}catch (Exception e) {
		e.printStackTrace();
	}
}
}
