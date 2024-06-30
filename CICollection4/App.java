package com.springCore.SpringCore.CICollection4;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
	public static void main(String[] args) {
		try(ClassPathXmlApplicationContext context =new ClassPathXmlApplicationContext(new String[] {"com/springCore/SpringCore/CICollection4/config.xml"})){
			Book book =(Book) context.getBean("book");
			System.out.println(book.toString());
		}catch (Exception e) {
			
			e.printStackTrace();
		}
	}

}
