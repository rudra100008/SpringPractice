package com.springCore.SpringCore.AutowiringAnnotation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
/*  @Autowired  annotation is used in  constructor,property and setter function  
 * @Qualifier annotation is used to specify which bean to be called/used like in this address2 bean is called same way you can call address1 also
 * if you replace it with address2
 * */
public class Employee {
  public String name;
  @Autowired
  @Qualifier("address2")
  public Address address;
  
  public Employee() {
	  super();
  }
 
  public Employee(String name,Address address) {
	  super();
	this.name=name;
	this.address=address;
	System.out.println("Setters");
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public Address getAddress() {
	return address;
}

public void setAddress(Address address) {
	this.address = address;
}
@Override
public String toString() {
	return "Employee [name=" + name + ", address=" + address + "]";
}
  
}
