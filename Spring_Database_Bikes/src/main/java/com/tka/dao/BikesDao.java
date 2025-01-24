package com.tka.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.tka.entity.Bikes;

@Repository
public class BikesDao {

	@Autowired
	SessionFactory factory;

	public String insertdata(Bikes b) {
		Session session = factory.openSession();
		Transaction tr = session.beginTransaction();

		session.persist(b);
		tr.commit();
		session.close();

		return "Data is inserted";
	}

}
