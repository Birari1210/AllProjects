package com.yash;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.yash.dao.CustomerDAO;
import com.yash.model.Customer;

public class CustomerOperation {
 public static void main(String s[])
 {
	 ApplicationContext objCTX = new ClassPathXmlApplicationContext("applicationcontext.xml");
	 CustomerDAO cdao = (CustomerDAO)objCTX.getBean("custDao");
	 Customer cobj = new Customer();
	// code to insert the data
	 cobj.setFname("vijay");
	 cobj.setLname("sharma");
	 cobj.setAddress("123 vikas nagar  ");
	cobj.setCity("indore");
	  cdao.saveCustomer(cobj); 
	 //update function 
	/* cobj.setFname("vidhya");
	 cobj.setLname("sharma");
	 cobj.setAddress("302/2 vallabh nagar pune");
	 cobj.setCustid(3);
	 cdao.updateCustomer(cobj); */
	// cobj.setCustid(2);
	// cdao.delCustomer(cobj);
 }
}
