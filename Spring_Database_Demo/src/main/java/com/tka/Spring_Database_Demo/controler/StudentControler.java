package com.tka.Spring_Database_Demo.controler;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.tka.Spring_Database_Demo.entity.Student;
import com.tka.Spring_Database_Demo.service.StudentService;

@RestController
public class StudentControler {
	
	@Autowired
	StudentService service;
	
	@PostMapping("/savedata")
	public String insertdata(@RequestBody Student s) {
		String msg=service.insertdata(s);
		return msg;
	}

}
