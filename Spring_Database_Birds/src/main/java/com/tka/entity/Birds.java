package com.tka.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Birds {
	
	@Id
	private int bird_name;
	private String bird_color;
	
	public int getBird_name() {
		return bird_name;
	}
	public void setBird_name(int bird_name) {
		this.bird_name = bird_name;
	}
	public String getBird_color() {
		return bird_color;
	}
	public void setBird_color(String bird_color) {
		this.bird_color = bird_color;
	}
	@Override
	public String toString() {
		return "Birds [bird_name=" + bird_name + ", bird_color=" + bird_color + "]";
	}
	public Birds(int bird_name, String bird_color) {
		super();
		this.bird_name = bird_name;
		this.bird_color = bird_color;
	}
	public Birds() {
			}

    
	
	

}
