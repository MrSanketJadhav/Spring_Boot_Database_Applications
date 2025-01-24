package com.tka.Spring_Database_Demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tka.Spring_Database_Demo.dao.StudentDao;
import com.tka.Spring_Database_Demo.entity.Student;

@Service
public class StudentService {
	
	@Autowired
	StudentDao dao;
	
	public String insertdata(Student s) { 
	String msg=dao.insertdata(s);
	return msg;
	}
}
