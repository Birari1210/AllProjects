package com.yash.flight.dao;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Query;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.HibernateTransactionManager;

import com.yash.flight.model.Flight;
import com.yash.flight.model.Plane;

public class FlightHqlDAO {

	
	@Autowired
	private HibernateTransactionManager objFHTM;
	

	public void  getAllPlane(){
		System.out.println("====Print total number of planes operating in total.====");
		SessionFactory sf = objFHTM.getSessionFactory();
		Session objSession = sf.openSession();
		Transaction t = objSession.beginTransaction();
		//List<Plane> plist = new ArrayList<Plane>();
		//Criteria ctr = objSession.createCriteria(Plane.class);
		//plist = ctr.list();
		Query q =objSession.createQuery("select plane_id,planename,count(plane_id) from plane");
		List<Integer>allplane = q.getResultList();
		//return  (List<Plane>) ctr.uniqueResult();
	}
	
	public List<Flight> getAllFlightWithCity(){
		System.out.println("==== Write query to find total number of flights from each cities.====");
		SessionFactory sf = objFHTM.getSessionFactory();
		Session objSession = sf.openSession();
		Transaction t= objSession.beginTransaction();
		return null;
	}
	
}
