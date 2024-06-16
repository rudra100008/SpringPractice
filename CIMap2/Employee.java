package com.springCore.SpringCore.CIMap2;

import java.util.Map;

public class Employee {
	private int employeeID;
	private String employeeName;
	private   Map<EmployeeInfo, EmployeeInfo2> einfo;
	
	
	public Employee() {
		super();
	}
	public Employee(int id,String employeeName,Map<EmployeeInfo, EmployeeInfo2> einfo) {
		super();
		this.employeeID=id;
		this.employeeName=employeeName;
		this.einfo=einfo;
	}
	public String toString() {
		StringBuilder sb=new StringBuilder();
		sb.append("\t------Employee Information-------\n")
		.append("\nEmployeeID: ").append(employeeID)
		.append("\nEmployeeName: ").append(employeeName);
		for(Map.Entry<EmployeeInfo, EmployeeInfo2> entry:einfo.entrySet()) {
			EmployeeInfo einfo1=entry.getKey();
			EmployeeInfo2 einfo2=entry.getValue();
			sb.append("\n").append(einfo1).append(einfo2);
		}
		return sb.toString();
	}

}
