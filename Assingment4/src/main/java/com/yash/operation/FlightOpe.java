package com.yash.operation;

import java.time.LocalTime;
import java.util.Scanner;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.yash.dao.FlightDao;
import com.yash.model.Flight;

//Flight :- flightid, flight_name, pid,start_cityid, end_cityid, duration, noofseats

public class FlightOpe {

	public static void main(String[] args) {
		
		ApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext.xml");

		FlightDao fdao = (FlightDao) ctx.getBean("flightBean");
		Flight fth = new Flight();
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Flight id");
		fth.setFlightid(sc.nextInt());
		System.out.println("Enter flight name ");
		fth.setFlightname(sc.next());
		System.out.println("Enter plane id");
		fth.setPid(sc.nextInt());
		System.out.println("Enter start City id");
		fth.setStartcityid(sc.nextInt());
		System.out.println("Enter end city id");
        fth.setEndcityid(sc.nextInt());
        
//        System.out.println("Enter flight duration ");
//        String s = sc.next();
//        LocalTime lt1 = LocalTime.now();
//        fth.setDurartion(lt1);
        
        System.out.println("Enter flight duration ");
        fth.setDuration(sc.nextFloat());
        
        System.out.println("Enter number of seat");
        fth.setNoofseats(sc.nextInt());

        fdao.addFlight(fth);
	}

}
