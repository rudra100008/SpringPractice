package com.springCore.SpringCore.Autowiring;

public class Marks {
	private int math;
	private int science;
	
	public Marks() {
		super();
	}

	public Marks(int math, int science) {
		super();
		this.math = math;
		this.science = science;
	}

	public int getMath() {return math;}

	public void setMath(int math) {this.math = math;}

	public int getScience() {return science;}

	public void setScience(int science) {this.science = science;}

	@Override
	public String toString() {
		return "[math=" + math + ", science=" + science + "]";
	}
	
	
	

}
