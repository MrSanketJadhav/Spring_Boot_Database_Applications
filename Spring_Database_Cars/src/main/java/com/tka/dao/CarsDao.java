package com.tka.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.tka.entity.Cars;

@Repository
public class CarsDao {

	@Autowired
	private SessionFactory factory;

	public String insertData(Cars c) {

		Session session = factory.openSession();
		Transaction tr = session.beginTransaction();
		session.persist(c);
		session.close();
		tr.commit();
		return "Data Inserted Sucessfully";

	}

}
