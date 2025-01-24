package com.tka.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tka.dao.EmployeDao;
import com.tka.entity.Employe;

@Service
public class EmployeService {
	
	@Autowired
	EmployeDao dao;
	
	public String insertdata(Employe emp) {
		String msg=dao.insertdata(emp);
		return msg;
		
	}

}
