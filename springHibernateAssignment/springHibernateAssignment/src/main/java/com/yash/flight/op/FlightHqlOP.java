package com.yash.flight.op;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.yash.flight.dao.FlightDAO;
import com.yash.flight.dao.FlightHqlDAO;

public class FlightHqlOP {

 public static void main(String[] args) {
	
	 ApplicationContext objCTX = new ClassPathXmlApplicationContext("FlightAppContext.xml");
	 
	 FlightHqlDAO objfhql = (FlightHqlDAO) objCTX.getBean("flightDao");
	
	 objfhql.getAllPlane();
	 
}
	
	
}
