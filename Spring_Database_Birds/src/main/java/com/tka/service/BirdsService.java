package com.tka.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tka.dao.BirdsDao;
import com.tka.entity.Birds;

@Service
public class BirdsService {
	
	@Autowired
	BirdsDao dao;
	
	public String insertdat(Birds b) {
		String msg=dao.insertdata(b);
		return msg;
	}

}
