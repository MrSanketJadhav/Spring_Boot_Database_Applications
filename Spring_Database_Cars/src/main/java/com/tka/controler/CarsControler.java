package com.tka.controler;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.tka.entity.Cars;
import com.tka.service.CarsService;

@RestController
public class CarsControler {

	@Autowired
	CarsService cars;

	@PostMapping("/MyCars")
	public String insertdata(@RequestBody Cars c) {
		String msg = cars.insertdata(c);
		return "msg";

	}

}
