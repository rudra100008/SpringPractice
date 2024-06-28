package com.springCore.SpringCore.AutowiringAnnotation;

public class Address {
  public String city;
  public String country;
  
  public void setCity(String city) {
	  this.city=city;
  }
  public String  getCity() {
	  return this.city;
  }
  public void setCountry(String country) {
	  this.country=country;
  }
  public String getCountry() {
	  return this.country;
  }
@Override
public String toString() {
	return "Address [city=" + city + ", country=" + country + "]";
}
  
}
