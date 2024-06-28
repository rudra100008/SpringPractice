package com.springCore.SpringCore.AutowiringAnnotation;

import org.springframework.beans.factory.annotation.Autowired;

public class Employee {
  public String name;
  @Autowired
  public Address address;
  
  public Employee() {
	  super();
  }
  public Employee(String name,Address address) {
	  super();
	this.name=name;
	this.address=address;
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
