package com.tka.Spring_Database_Demo.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Student {
	
	@Id
	private int std_id;
	private String std_name;
	private String std_age;
	
	public int getStd_id() {
		return std_id;
	}
	public void setStd_id(int std_id) {
		this.std_id = std_id;
	}
	public String getStd_name() {
		return std_name;
	}
	public void setStd_name(String std_name) {
		this.std_name = std_name;
	}
	public String getStd_age() {
		return std_age;
	}
	public void setStd_age(String std_age) {
		this.std_age = std_age;
	}
	
	public Student(int std_id, String std_name, String std_age) {
		super();
		this.std_id = std_id;
		this.std_name = std_name;
		this.std_age = std_age;
	}
	

	public Student() {
		
	}
	
	@Override
	public String toString() {
		return "Student [std_id=" + std_id + ", std_name=" + std_name + ", std_age=" + std_age + "]";
	}
	
	

}
