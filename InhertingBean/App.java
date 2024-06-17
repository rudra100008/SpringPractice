package com.springCore.SpringCore.InhertingBean;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
	public static void main(String[] args) {
		try (ClassPathXmlApplicationContext context=new ClassPathXmlApplicationContext(new String[] {"InhertingContext.xml"})){
		Employee employee=	(Employee)context.getBean("employee1");
		System.out.println(employee.toString());
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
