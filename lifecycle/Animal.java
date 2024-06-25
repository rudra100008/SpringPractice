package com.SpringCore.Spring.lifecycle;

public class Animal {
   private String name;
   private String species;
   private int age;
   
   public void setName(String name) {
	   System.out.println("Set name of animal");
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

public void init() {
	System.out.println("Init lifecycle.......");
}
public void destroy() {
	System.out.println("Destroy lifecycle........");
}
   
   
}
