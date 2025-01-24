package com.tka.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Company {
	
	@Id
	private int cmp_id;
	private String cmp_name;
	private String cmp_ownername;
	private String cmp_Type;
	public int getCmp_id() {
		return cmp_id;
	}
	public void setCmp_id(int cmp_id) {
		this.cmp_id = cmp_id;
	}
	public String getCmp_name() {
		return cmp_name;
	}
	public void setCmp_name(String cmp_name) {
		this.cmp_name = cmp_name;
	}
	public String getCmp_ownername() {
		return cmp_ownername;
	}
	public void setCmp_ownername(String cmp_ownername) {
		this.cmp_ownername = cmp_ownername;
	}
	public String getCmp_Type() {
		return cmp_Type;
	}
	public void setCmp_Type(String cmp_Type) {
		this.cmp_Type = cmp_Type;
	}
	@Override
	public String toString() {
		return "Company [cmp_id=" + cmp_id + ", cmp_name=" + cmp_name + ", cmp_ownername=" + cmp_ownername
				+ ", cmp_Type=" + cmp_Type + "]";
	}
	public Company(int cmp_id, String cmp_name, String cmp_ownername, String cmp_Type) {
		super();
		this.cmp_id = cmp_id;
		this.cmp_name = cmp_name;
		this.cmp_ownername = cmp_ownername;
		this.cmp_Type = cmp_Type;
	}
	public Company() {

	}
	
	

}
