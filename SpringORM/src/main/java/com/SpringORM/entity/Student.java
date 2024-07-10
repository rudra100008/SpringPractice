package com.SpringORM.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "Student_Details")
public class Student {
	@Id
	@Column(name = "Student_Id")
  private int studentID;
	@Column(name = "Student_Name")
  private String  studentName;
	@Column(name = "Student_City")
  private String studentCity;
	
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Student(int studentID, String studentName, String studentCity) {
		super();
		this.studentID = studentID;
		this.studentName = studentName;
		this.studentCity = studentCity;
	}

	public int getStudentID() {
		return studentID;
	}

	public void setStudentID(int studentID) {
		this.studentID = studentID;
	}

	public String getStudentName() {
		return studentName;
	}

	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}

	public String getStudentCity() {
		return studentCity;
	}

	public void setStudentCity(String studentCity) {
		this.studentCity = studentCity;
	}
	
  
}
