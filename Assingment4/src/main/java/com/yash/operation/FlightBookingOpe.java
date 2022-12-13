package com.yash.operation;

import java.sql.Date;

import java.time.LocalTime;
import java.util.Scanner;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.yash.dao.FlightBookingDao;
import com.yash.model.FlightBooking;


public class FlightBookingOpe {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext.xml");

		FlightBookingDao fbdao = (FlightBookingDao) ctx.getBean("fbBean");
		FlightBooking fb = new FlightBooking();
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Flight Booking id");
		fb.setFbid(sc.nextInt());
		
		System.out.println("Enter Flight id ");
		fb.setFlightid(sc.nextInt());
				
		System.out.println("Enter booking Date ");
		String str = sc.next();
		Date d1 = Date.valueOf(str);
		fb.setDate(d1);
		
		fbdao.addFlightBook(fb);
	}

}
