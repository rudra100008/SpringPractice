package com.springCore.SpringCore.CIMap1;

import java.util.Map;

public class Student {
	private int studentId;
	private Map<String, Double> studentInfo; 
	
	public Student() {
		super();
	}
	public Student( int id, Map<String, Double> sinfo) {
		super();
		this.studentId=id;
		this.studentInfo=sinfo;
	}
	public int getStudentId() {
		return studentId;
	}
	public void setStudentId(int studentId) {
		this.studentId = studentId;
	}
	public Map<String, Double> getStudentInfo() {
		return studentInfo;
	}
	public void setStudentInfo(Map<String, Double> studentInfo) {
		this.studentInfo = studentInfo;
	}
	
	public String toString() {
		
		StringBuilder sb= new StringBuilder();
		sb.append("\\t----Student Info-----\\n")
		.append("\nStudent ID: ").append(studentId);//Student ID printed
		for(Map.Entry<String, Double> entry:studentInfo.entrySet()) { //loop to iterate through whole map
			sb.append("\nStudent Name: ").append(entry.getKey())//Student Name printed
			.append("\nStudent Marks: ").append(entry.getValue());//Student Marks printed
		}
		return sb.toString() ;
		
	}

	

}
