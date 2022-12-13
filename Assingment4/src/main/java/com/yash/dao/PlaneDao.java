package com.yash.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.orm.hibernate5.HibernateTransactionManager;

import com.yash.model.Plane;


public class PlaneDao {
	
	private HibernateTransactionManager hbmObj;

	public void setHbmObj(HibernateTransactionManager hbmObj) {
		this.hbmObj = hbmObj;
	}
	
	
	public void addPlane(Plane pobj)
	{
		SessionFactory sf =hbmObj.getSessionFactory();
	    Session objSession = sf.openSession();
	    Transaction t= objSession.beginTransaction();
		  objSession.save(pobj);
		  t.commit();
		  System.out.println(" data is added in plane table");
		  objSession.close();
	}

}
