package com.spring_hibernate.myapp.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;


import org.springframework.format.annotation.DateTimeFormat;

@Entity
public class Student {
	
	@Id 
	@Column
	//@GeneratedValue(strategy=GenerationType.AUTO)
	//@NotNull
	private int stdno;
	@Column
	//@NotNull
	//@Size(min=2, max=30)
	private String firstname;
	@Column
	//@NotNull
	//@Size(min=2, max=30)
	private String lastname;
	@Column
	//@NotNull
	//@DateTimeFormat(pattern="MM/dd/yyyy")
	private Date joindate;
	@Column
	private String streetname;
	@Column
	private String city;
	@Column
	private String state;
	@Column
	private String country;
	@Column
	public int getStdno() {
		return stdno;
	}
	public void setStdno(int stdno) {
		this.stdno = stdno;
	}
	public String getFirstname() {
		return firstname;
	}
	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}
	public String getLastname() {
		return lastname;
	}
	public void setLastname(String lastname) {
		this.lastname = lastname;
	}
	public Date getJoindate() {
		return joindate;
	}
	public void setJoindate(Date joindate) {
		this.joindate = joindate;
	}
	public String getStreetname() {
		return streetname;
	}
	public void setStreetname(String streetname) {
		this.streetname = streetname;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}

}
