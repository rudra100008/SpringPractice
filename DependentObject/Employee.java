package com.springCore.SpringCore.DependentObject;

public class Employee {
	private int employeeId;
	private String employeeName;
	private float employeeSalary;
	private Address address;
	public Employee() {super();}
	public Employee(int id,String name,float salary,Address address) {
		super();
	     this.employeeId=id;
	     this.employeeName=name;
	     this.employeeSalary=salary;
	     this.address=address;
	}
	
	
	public int getEmployeeId() {
		return employeeId;
	}
	public void setEmployeeId(int employeeId) {
		this.employeeId = employeeId;
	}
	public String getEmployeeName() {
		return employeeName;
	}
	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}
	public float getEmployeeSalary() {
		return employeeSalary;
	}
	public void setEmployeeSalary(float employeeSalary) {
		this.employeeSalary = employeeSalary;
	}
	@Override
	public String toString() {
		return "\t-----Employee Details---\n"+"\nEmployeeID: "+employeeId+"\nEmployeeName: "+employeeName+"\nEmployeeSalary: "+employeeSalary+address.toString(); 
	}

}
