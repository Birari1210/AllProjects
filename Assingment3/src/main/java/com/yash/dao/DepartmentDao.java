package com.yash.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.orm.hibernate5.HibernateTransactionManager;

import com.yash.model.Department;


public class DepartmentDao {

	private HibernateTransactionManager hbmObj;

	public void setHbmObj(HibernateTransactionManager hbmObj) {
		this.hbmObj = hbmObj;
	}

	public void saveDepartment( Department dobj)
	{
		SessionFactory sf =hbmObj.getSessionFactory();
	    Session objSession = sf.openSession();
	    Transaction t= objSession.beginTransaction();
		objSession.save(dobj);
		t.commit();
		System.out.println("department data is save");
		objSession.close();
	}
	
}
