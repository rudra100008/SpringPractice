package com.springCore.SpringCore.InhertingBean;

public class Employee {
	private int employeeID;
	private String employeeName;
	private String phoneNumber;
	private Address address;
	
	
	public Employee() {
		super();
	}
	public Employee(int employeeID, String employeeName, String phoneNumber,Address address) {
		super();
		this.employeeID = employeeID;
		this.employeeName = employeeName;
		this.phoneNumber = phoneNumber;
		this.address=address;
	}
	public String toString() {
		return "\t---------Employee Information--------\n"+
	             "\nEmployee ID: "+employeeID+
	             "\nEmployee Name: "+employeeName+
	             "\nEmployee PhoneNumber: "+phoneNumber+address.toString();
	}
	
	
	

}
