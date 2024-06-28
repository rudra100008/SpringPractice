package com.springCore.SpringCore.AutowiringAnnotation;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
	
	public static void main(String[] args) {
		try(ClassPathXmlApplicationContext context =new ClassPathXmlApplicationContext(new String[] {" com/springCore/SpringCore/AutowiringAnnotation/config.xml"})){
			Employee employee=(Employee)context.getBean("employee");
			System.out.println(employee);
		}catch (Exception e) {
			e.printStackTrace();
		}
	}

}
