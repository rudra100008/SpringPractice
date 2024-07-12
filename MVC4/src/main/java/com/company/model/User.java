package com.company.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name ="Employee")
public class User {
@Id
@Column(name = "Employee_Id")
@GeneratedValue(strategy = GenerationType.AUTO)
private int id;
@Column(name = "Employee_Name")
private String name;
@Column(name = "Employee_Email")
private String email;
@Column(name = "Employee_Password")
private String password;



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
public String getPassword() {
	return password;
}
public void setPassword(String password) {
	this.password = password;
}
@Override
public String toString() {
	return "User [name=" + name + ", email=" + email + ", password=" + password + "]";
}

}
