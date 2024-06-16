package com.springCore.SpringCore.CIMap2;

public class EmployeeInfo2 {
  private String number;
  private String address;
public EmployeeInfo2() {
	super();
	// TODO Auto-generated constructor stub
}
public EmployeeInfo2(String number, String address) {
	super();
	this.number = number;
	this.address = address;
}
  public String toString() {
	  return "\nAddress: "+address+"\nPhoneNumber: "+number;
  }
}
