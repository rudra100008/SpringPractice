package com.springCore.Basic;

public class Student {
	private int id;
    private String name;
    private String address;

    public  Student(){
    	super();
    }
    public Student(int id,String name,String address) {
    	super();
    	this.id=id;
    	this.name=name;
    	this.address=address;
    }
    public  void setId(int id) {
    	this.id=id;
    }
    public int getId() {
    	return this.id;
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
	public String toString() {
		return "Student[\n ID: "+this.id +"\nName: "+this.name+"\nAddress: "+this.address+"\n]";
	}
    
}
