package com.springCore.Basic;


import java.util.ArrayList;
import java.util.List;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {
//    @Bean
//	public Student student1() {
//    	Student s1=new Student(2,"Rudra","Jorpati");
//		return s1;
//	}
//   
//    @Bean
//	public Student student2() {
//    	Student s2=new  Student(1,"Ashum","Narayantar");
//		return s2;
//	}
	
	@Bean
	public List<Student> student3(){
		List<Student> students = new ArrayList<>();
		students.add(new  Student(1,"Ashum","Narayantar"));
		students.add(new Student(2,"Rudra","Jorpati"));
		return students;
	}
}
