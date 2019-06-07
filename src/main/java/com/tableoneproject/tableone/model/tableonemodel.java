package com.tableoneproject.tableone.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="customers")
public class tableonemodel {
	
	
	private int id;
	private int customerid;
	private String firstname;
	private String lastname;
	private int age;
	private String gender;
	
	@Id @Column(name="id", nullable=false)
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	@Column(name="customerid", nullable=false)
	public int getCustomerid() {
		return customerid;
	}
	public void setCustomerid(int customerid) {
		this.customerid = customerid;
	}
	@Column(name="firstname", nullable=false)
	public String getFirstname() {
		return firstname;
	}
	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}
	@Column(name="lastname",nullable=false)
	public String getLastname() {
		return lastname;
	}
	public void setLastname(String lastname) {
		this.lastname = lastname;
	}
	@Column(name="age", nullable=false)
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	@Column(name="gender", nullable=false)
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public tableonemodel(int id, int customerid, String firstname, String lastname, int age, String gender) {
		super();
		this.id = id;
		this.customerid = customerid;
		this.firstname = firstname;
		this.lastname = lastname;
		this.age = age;
		this.gender = gender;
	}
	public tableonemodel() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "tableonemodel [id=" + id + ", customerid=" + customerid + ", firstname=" + firstname + ", lastname="
				+ lastname + ", age=" + age + ", gender=" + gender + "]";
	}
	
	
	
	
	
	
	
	
	

}
