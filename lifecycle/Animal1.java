package com.SpringCore.Spring.lifecycle;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class Animal1  implements InitializingBean,DisposableBean
{  private String name;
   private String species;
   private int age;
   
   public void setName(String name) {
	   System.out.println("Set name of animal1");
	   this.name=name;
   }
   public String getName() {
	   
	   return this.name;
   }
public String getSpecies() {
	return species;
}
public void setSpecies(String species) {
	this.species = species;
}
public int getAge() {
	return age;
}
public void setAge(int age) {
	this.age = age;
}
@Override
public String toString() {
	return "Animal [name=" + name + ", species=" + species + ", age=" + age + "]";
}


@Override
public void afterPropertiesSet() throws Exception {
	System.out.println(" Initializing of animal1 class");
	
}
@Override
public void destroy() throws Exception {
	System.out.println("Destroy of animal1 class");
	
}
   
   
}

