package com.springCore.SpringCore.CIMap2;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class EmployeeApp {
   public static void main(String[] args) {
	try(ClassPathXmlApplicationContext context=new ClassPathXmlApplicationContext(new String[] {"employeeApp.xml"}) ) {
		Employee employee=(Employee)context.getBean("employee");
		System.out.println(employee);
	} catch (Exception e) {
		// TODO: handle exception
	}
}
}
