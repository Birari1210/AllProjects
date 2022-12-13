package com.yash.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.orm.hibernate5.HibernateTransactionManager;

import com.yash.model.BaseLocation;
import com.yash.model.Employee;

public class BaseLocationDao {
	
	private HibernateTransactionManager hbmObj;

	public void setHbmObj(HibernateTransactionManager hbmObj) {
		this.hbmObj = hbmObj;
	}
	
	public void saveBaseLocation(BaseLocation blobj)
	{
		SessionFactory sf =hbmObj.getSessionFactory();
	    Session objSession = sf.openSession();
	    Transaction t= objSession.beginTransaction();
		  objSession.save(blobj);
		  t.commit();
		  System.out.println("Employee data is save");
		  objSession.close();
	}
	
}
