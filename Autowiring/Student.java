package com.springCore.SpringCore.Autowiring;

public class Student {
	private String name;
	private Marks marks;
	
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public Student(String name, Marks marks) {
		super();
		System.out.println("Constructor");
		this.name = name;
		this.marks = marks;
	}

	public void setName(String name) {this.name=name;}
	public String getName() {return this.name;}
	public void setMarks(Marks marks) {this.marks=marks;}
	public Marks getMarks() {return marks;}
	@Override
	public String toString() {
		return "Student [name=" + name + ", marks=" + marks + "]";
	}

}
