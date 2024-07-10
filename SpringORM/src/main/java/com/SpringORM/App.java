package com.SpringORM;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.SpringORM.dao.StudentDao;
import com.SpringORM.entity.Student;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	ApplicationContext applicationContext =new ClassPathXmlApplicationContext("config.xml");
    	 StudentDao studentDao= applicationContext.getBean("studentDao",StudentDao.class);
    	 Student student=new Student(2234,"Ashum Bhuju","Narayantar");
    	 int r= studentDao.insert(student);
        System.out.println( "Done"+r );
    }
}
