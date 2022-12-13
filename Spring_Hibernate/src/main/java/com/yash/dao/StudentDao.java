package com.yash.dao;

import org.hibernate.Session;

import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.orm.hibernate5.HibernateTransactionManager;

import com.yash.model.Student;

// student details Ass in Hibernate 

public class StudentDao {
	
	 private HibernateTransactionManager hbmObj;

	 public void setHbmObj( HibernateTransactionManager hbmObj) {
	 	this.hbmObj = hbmObj;
	 }
	 
	 public void insertStudent(Student st)
	  {
	    SessionFactory sf =hbmObj.getSessionFactory();
	     Session objSession = sf.openSession();
	     Transaction t= objSession.beginTransaction();
		objSession.save(st);
		t.commit();
		System.out.println("Student table data is saved");
		objSession.close();
	  }
	 public void updateStudent(Student st)
	  {
	    SessionFactory sf =hbmObj.getSessionFactory();
	    Session objSession = sf.openSession();
	    Transaction t= objSession.beginTransaction();
		objSession.update(st);
		t.commit();
		System.out.println("Student table data is Updated");
		 objSession.close();
	  }
	 
	  public void deleteStudent(Student st)
	  {
		   SessionFactory sf =hbmObj.getSessionFactory();
		    Session objSession = sf.openSession();
		    Transaction t= objSession.beginTransaction();
			  objSession.delete(st);
			  t.commit();
			  System.out.println("Student table data  is Delete");
			  objSession.close();
	  }
}
