package com.tka.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tka.dao.BikesDao;

import com.tka.entity.Bikes;

@Service
public class BikesService {
	
	@Autowired
	BikesDao dao;
	
	public String insertdata(Bikes b) {
		String msg=dao.insertdata(b);
		return msg;
		
	}

}
