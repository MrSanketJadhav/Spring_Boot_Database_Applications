package com.tka.controler;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.tka.entity.Employe;
import com.tka.service.EmployeService;

@RestController
public class EmployeControler {
	
	@Autowired
	EmployeService service;	
	
	@PostMapping("/EmployeData")
	 public String insertdata(@RequestBody Employe emp) {
		String msg=service.insertdata(emp);
		return msg;
		 
		 
	 }
}
