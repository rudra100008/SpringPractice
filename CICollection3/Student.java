package com.springCore.SpringCore.CICollection3;

import java.util.List;

public class Student {
 private String id;
 private List<StudentInfo> studentList;
public Student() {
	super();
	// TODO Auto-generated constructor stub
}
public Student(String id, List<StudentInfo> studentList) {
	super();
	this.id = id;
	this.studentList = studentList;
}
public String getId() {
	return id;
}
public void setId(String id) {
	this.id = id;
}
public List<StudentInfo> getStudentList() {
	return studentList;
}
public void setStudentList(List<StudentInfo> studentList) {
	this.studentList = studentList;
}
@Override
public String toString() {
	return "Student [id=" + id + ", studentList=" + studentList + "]";
}

}
