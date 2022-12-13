package com.yash.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.orm.hibernate5.HibernateTransactionManager;

import com.yash.model.FlightBooking;


public class FlightBookingDao {

	private HibernateTransactionManager hbmObj;

	public void setHbmObj(HibernateTransactionManager hbmObj) {
		this.hbmObj = hbmObj;
	}
	
	
	public void addFlightBook(FlightBooking fbobj)
	{
		SessionFactory sf =hbmObj.getSessionFactory();
	    Session objSession = sf.openSession();
	    Transaction t= objSession.beginTransaction();
		  objSession.save(fbobj);
		  t.commit();
		  System.out.println(" data is added in Flight booking table");
		  objSession.close();
	}
}
