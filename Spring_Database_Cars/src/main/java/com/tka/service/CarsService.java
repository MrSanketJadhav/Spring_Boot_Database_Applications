package com.tka.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tka.dao.CarsDao;
import com.tka.entity.Cars;

@Service
public class CarsService {
	
	@Autowired
	 CarsDao car;
	 
	public String insertdata(Cars c) {
		String msg=car.insertData(c);
		return "msg";
	}

}
