package com.springCore.SpringCore.CIMap2;

public class EmployeeInfo {
	private String post;
	private String email;
	private String country;
	private double salary;
	public EmployeeInfo() {
		super();
	}
	public EmployeeInfo(String post, String email, String country, double salary) {
		super();
		this.post = post;
		this.email = email;
		this.country = country;
		this.salary = salary;
	}
	public String toString() {
		return "\nEmail: "+email + "\nPost: "+post+"\nCountry: "+country+"\nSalary: "+salary;
	}
	
	

}
