package com.springCore.SpringCore.CICollection3;

public class StudentInfo {
	private String name;
	private String address;
	private float marks;
	public StudentInfo() {
		super();
		// TODO Auto-generated constructor stub
	}
	public StudentInfo(String name, String address, float marks) {
		super();
		this.name = name;
		this.address = address;
		this.marks = marks;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public float getMarks() {
		return marks;
	}
	public void setMarks(float marks) {
		this.marks = marks;
	}
	@Override
	public String toString() {
		return "StudentInfo [name=" + name + ", address=" + address + ", marks=" + marks + "]";
	}
	

}
