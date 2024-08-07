package com.company.model;


import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.CollectionTable;
import jakarta.persistence.Column;
import jakarta.persistence.ElementCollection;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "Complex_Form")
public class Form {	
@Id
@Column(name="ID")
@GeneratedValue(strategy = GenerationType.IDENTITY)
private Long id;
@Column(name = "Name")
private String name;
@Column(name = "Email")
private String email;
@Column(name = "Date")
private String date;
@Column(name = "Phone_Number")
private String phoneNumber;
@Column(name = "Gender")
private String gender;
@OneToOne(cascade = CascadeType.ALL)
@JoinColumn(name = "address_id")
private Address address;
@ElementCollection
@CollectionTable(name = "Course_List", joinColumns = @JoinColumn(name = "form_id"))
@Column(name = "Course")
private List<String> course;
@Column(name = "Country")
private String country;


public Form() {
	super();
	this.address=new Address();
}
public long getId() {
	return id;
}
public void setId(long id) {
	this.id = id;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getEmail() {
	return email;
}
public void setEmail(String email) {
	this.email = email;
}
public String getDate() {
	return date;
}
public void setDate(String date) {
	this.date = date;
}
public String getPhoneNumber() {
	return phoneNumber;
}
public void setPhoneNumber(String phoneNumber) {
	this.phoneNumber = phoneNumber;
}
public String getGender() {
	return gender;
}
public void setGender(String gender) {
	this.gender = gender;
}
public List<String> getCourse() {
	return course;
}
public void setCourse(List<String> course) {
	this.course = course;
}
public Address getAddress() {
	return address;
}
public void setAddress(Address address) {
	this.address = address;
}
public String getCountry() {
	return country;
}
public void setCountry(String country) {
	this.country = country;
}

@Override
public String toString() {
	return "Form [id=" + id + ", name=" + name + ", email=" + email + ", date=" + date + ", phoneNumber=" + phoneNumber
			+ ", gender=" + gender + ", course=" + course + ", country=" + country + ", address=" + address + "]";
}

}
