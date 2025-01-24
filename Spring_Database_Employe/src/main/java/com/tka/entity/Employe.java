package com.tka.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Employe {
	
	@Id
	private int emp_id;
	private String emp_name;
	private String emp_salary;
	private String emp_role;
	public int getEmp_id() {
		return emp_id;
	}
	public void setEmp_id(int emp_id) {
		this.emp_id = emp_id;
	}
	public String getEmp_name() {
		return emp_name;
	}
	public void setEmp_name(String emp_name) {
		this.emp_name = emp_name;
	}
	public String getEmp_salary() {
		return emp_salary;
	}
	public void setEmp_salary(String emp_salary) {
		this.emp_salary = emp_salary;
	}
	public String getEmp_role() {
		return emp_role;
	}
	public void setEmp_role(String emp_role) {
		this.emp_role = emp_role;
	}
	@Override
	public String toString() {
		return "Employe [emp_id=" + emp_id + ", emp_name=" + emp_name + ", emp_salary=" + emp_salary + ", emp_role="
				+ emp_role + "]";
	}
	public Employe(int emp_id, String emp_name, String emp_salary, String emp_role) {
		super();
		this.emp_id = emp_id;
		this.emp_name = emp_name;
		this.emp_salary = emp_salary;
		this.emp_role = emp_role;
	}
	public Employe() {
	
	}
	
	
}

