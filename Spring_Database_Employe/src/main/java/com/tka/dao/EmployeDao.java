package com.tka.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.tka.entity.Employe;

@Repository
public class EmployeDao {
	
	@Autowired
	SessionFactory factory;
	 
	public String insertdata(Employe emp) {
		
		Session session=factory.openSession();
		Transaction tr=session.beginTransaction();
		
		session.persist(emp);
		session.close();
		tr.commit();
	 return "Data Is Inserted";
	}

}
