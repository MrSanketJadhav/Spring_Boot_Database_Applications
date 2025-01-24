package com.tka.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tka.dao.CompanyDao;
import com.tka.entity.Company;

@Service
public class CompanyService {
	
	@Autowired
	CompanyDao dao;
	
	
	public String insertdata(Company cmp) {
		String msg=dao.insertdata(cmp);
		return msg;
	   
	}

}
