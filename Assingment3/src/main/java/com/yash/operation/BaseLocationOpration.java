package com.yash.operation;

import java.util.Scanner;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.yash.dao.BaseLocationDao;
import com.yash.model.BaseLocation;

public class BaseLocationOpration {

	public static void main(String[] args) {

		ApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext.xml");

		BaseLocationDao blobjdao = (BaseLocationDao) ctx.getBean("baselocbeen");
		BaseLocation bsl = new BaseLocation();
		
		System.out.println("base location");
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Base Location ID");
		bsl.setBaseLocationId(sc.nextInt());
		System.out.println("Enter base location name");
		bsl.setBaseLocationName(sc.next());
		
		blobjdao.saveBaseLocation(bsl);
		
		
		
	}

}
