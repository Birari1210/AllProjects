package com.yash.flight.dao;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.yash.flight.model.City;
import com.yash.flight.model.Customer;
import com.yash.flight.model.Flight;
import com.yash.flight.model.FlightBooking;
import com.yash.flight.model.Plane;
import com.yash.hibernate.model.Project;

public class FlightDAO {

	
	private org.springframework.orm.hibernate5.HibernateTransactionManager hbmObj;

	public void setHbmObj(org.springframework.orm.hibernate5.HibernateTransactionManager hbmObj) {
		this.hbmObj=hbmObj;
	}
	
	public void save(Flight f,City c,Customer cu, FlightBooking fb,Plane p) {
		
		SessionFactory sf =hbmObj.getSessionFactory();
		Session objSession = sf.openSession();
		Transaction t = objSession.beginTransaction();
		
		objSession.save(f);
		objSession.save(c);
		objSession.save(cu);
		objSession.save(fb);
		objSession.save(p);
		t.commit();
		System.out.println("Data is Saved..");
		objSession.close();
		
	}
	
	
}
