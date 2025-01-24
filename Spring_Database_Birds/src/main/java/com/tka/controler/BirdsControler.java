package com.tka.controler;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.tka.entity.Birds;
import com.tka.service.BirdsService;

@RestController
public class BirdsControler {
	
	@Autowired
	BirdsService service;
	
	@PostMapping("/BirdsData")
	public String insertdata(@RequestBody Birds b) {
		String msg=service.insertdat(b);
		return msg;
	}

}
