package com.tka.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Cars {
	
	@Id
	private int car_modelno;
	private String car_name;
	private String car_price;
	private String car_brand;
	public int getCar_modelno() {
		return car_modelno;
	}
	public void setCar_modelno(int car_modelno) {
		this.car_modelno = car_modelno;
	}
	public String getCar_name() {
		return car_name;
	}
	public void setCar_name(String car_name) {
		this.car_name = car_name;
	}
	public String getCar_price() {
		return car_price;
	}
	public void setCar_price(String car_price) {
		this.car_price = car_price;
	}
	public String getCar_brand() {
		return car_brand;
	}
	public void setCar_brand(String car_brand) {
		this.car_brand = car_brand;
	}
	public Cars(int car_modelno, String car_name, String car_price, String car_brand) {
		super();
		this.car_modelno = car_modelno;
		this.car_name = car_name;
		this.car_price = car_price;
		this.car_brand = car_brand;
	}
	public Cars() {
		
	}
	@Override
	public String toString() {
		return "Cars [car_modelno=" + car_modelno + ", car_name=" + car_name + ", car_price=" + car_price
				+ ", car_brand=" + car_brand + "]";
	}

	

}
