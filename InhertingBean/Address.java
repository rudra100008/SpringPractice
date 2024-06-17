package com.springCore.SpringCore.InhertingBean;

public class Address {
	private String city,country;

	public Address() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Address(String city, String country) {
		super();
		this.city = city;
		this.country = country;
	}
	public String toString() {
		return "\nCity: "+city+"\nCountry: "+country ;
	}
	

}
