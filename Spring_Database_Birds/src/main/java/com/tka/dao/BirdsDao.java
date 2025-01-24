package com.tka.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.tka.entity.Birds;

@Repository
public class BirdsDao {
	
	@Autowired
	SessionFactory factory;
	
	
	public String insertdata(Birds b) {
	 Session session=factory.openSession();
	 Transaction tr=session.beginTransaction();
	 
	 session.persist(b);
	 session.close();
	 tr.commit();
	 return "data is inserted";
		
	}

}
