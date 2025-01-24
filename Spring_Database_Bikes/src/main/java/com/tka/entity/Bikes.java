package com.tka.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
@Entity
public class Bikes {
	
	@Id
	private int bike_model_no;
	private String bike_model_name;
	private String bike_model_price;
	public int getBike_model_no() {
		return bike_model_no;
	}
	public void setBike_model_no(int bike_model_no) {
		this.bike_model_no = bike_model_no;
	}
	public String getBike_model_name() {
		return bike_model_name;
	}
	public void setBike_model_name(String bike_model_name) {
		this.bike_model_name = bike_model_name;
	}
	public String getBike_model_price() {
		return bike_model_price;
	}
	public void setBike_model_price(String bike_model_price) {
		this.bike_model_price = bike_model_price;
	}
	@Override
	public String toString() {
		return "Bikes [bike_model_no=" + bike_model_no + ", bike_model_name=" + bike_model_name + ", bike_model_price="
				+ bike_model_price + "]";
	}
	public Bikes(int bike_model_no, String bike_model_name, String bike_model_price) {
		super();
		this.bike_model_no = bike_model_no;
		this.bike_model_name = bike_model_name;
		this.bike_model_price = bike_model_price;
	}
	public Bikes() {
		
	}
	
	
	
	

}
