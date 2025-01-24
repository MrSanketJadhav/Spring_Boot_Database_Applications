package com.tka.control;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.tka.entity.Bikes;
import com.tka.service.BikesService;

@RestController
public class BikesControl {
	
	@Autowired
	BikesService service;

	@PostMapping("/BikesData")
	public String insertdata(@RequestBody Bikes b) {
		String msg=service.insertdata(b);
		return msg;
	}
	           
		
}
