package com.yash.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.orm.hibernate5.HibernateTransactionManager;
import com.yash.model.Customer;
public class CustomerDAO {
  private HibernateTransactionManager hbmObj;

public void setHbmObj( HibernateTransactionManager hbmObj) {
	this.hbmObj = hbmObj;
}
  public void saveCustomer(Customer c)
  {
    SessionFactory sf =hbmObj.getSessionFactory();
    Session objSession = sf.openSession();
    Transaction t= objSession.beginTransaction();
	  objSession.save(c);
	  t.commit();
	  System.out.println("data is saved");
	  objSession.close();
  }
  public void updateCustomer(Customer c)
  {
	   SessionFactory sf =hbmObj.getSessionFactory();
	    Session objSession = sf.openSession();
	    Transaction t= objSession.beginTransaction();
		  objSession.update(c);
		  t.commit();
		  System.out.println("data is updated");
		  objSession.close();
  }
  public void delCustomer(Customer c)
  {
	   SessionFactory sf =hbmObj.getSessionFactory();
	    Session objSession = sf.openSession();
	    Transaction t= objSession.beginTransaction();
		  objSession.delete(c);
		  t.commit();
		  System.out.println("data is deleted");
		  objSession.close();
  }
}
