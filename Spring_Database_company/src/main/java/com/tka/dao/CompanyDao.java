package com.tka.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.tka.entity.Company;

@Repository
public class CompanyDao {

	@Autowired
	SessionFactory factory;
	
	public String insertdata(Company cmp) {
		Session session =factory.openSession();
		Transaction tr=session.beginTransaction();
		
		session.persist(cmp);
		tr.commit();
		session.close();
		return "Data Is Inserted";
	}
}
