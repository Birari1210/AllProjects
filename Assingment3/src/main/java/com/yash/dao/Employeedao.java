package com.yash.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.orm.hibernate5.HibernateTransactionManager;

import com.yash.model.Employee;

public class Employeedao {
	
	private HibernateTransactionManager hbmObj;

	public void setHbmObj(HibernateTransactionManager hbmObj) {
		this.hbmObj = hbmObj;
	}

	public void saveEmp(Employee emp)
	{
		SessionFactory sf =hbmObj.getSessionFactory();
	    Session objSession = sf.openSession();
	    Transaction t= objSession.beginTransaction();
		  objSession.save(emp);
		  t.commit();
		  System.out.println("Employee data is save");
		  objSession.close();
	}
	
}
