package com.yash.operation;

import java.util.Scanner;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.yash.dao.CustomerDao;
import com.yash.model.Customer;

public class CustomerOpe {

	public static void main(String[] args) {
		
		ApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext.xml");
		
		CustomerDao custdao = (CustomerDao) ctx.getBean("custBean");
		Customer cust = new Customer();
		////Customer : custid, custname, customeraddress, mobileno,  city, aadharno. 

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Customer Id ");
		cust.setCustid(sc.nextInt());
		System.out.println("Enter Customer name ");
		cust.setCustname(sc.next());
		System.out.println("Enter customer address");
		cust.setCustaddress(sc.next());
		
		System.out.println("Enter Mobile Number ");
		cust.setMobileno(sc.nextInt());
		System.out.println("Enter City ");
		cust.setCity(sc.next());
		System.out.println(" Enter aadhar number");
		cust.setAadharno(sc.nextLong());
		
		custdao.addCustomer(cust);//method

	}
}
