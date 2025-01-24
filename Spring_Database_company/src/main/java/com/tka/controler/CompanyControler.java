package com.tka.controler;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.tka.entity.Company;
import com.tka.service.CompanyService;

@RestController
public class CompanyControler {
	
	@Autowired
	CompanyService service;
	
	@PostMapping("/CompanyData")
	public String insertdata(@RequestBody Company cmp) {
		String msg=service.insertdata(cmp);
		return msg;
		
		
	}

}
