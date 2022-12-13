package com.yash.operation;

import java.util.Scanner;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.yash.dao.CityDao;
import com.yash.model.City;

public class CityOpe {

	public static void main(String[] args) {

		ApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext.xml");
		
		CityDao citydao =(CityDao) ctx.getBean("cityBean");
		City cityobj = new City();
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter City Id");
       cityobj.setCityid(sc.nextInt());
       
       System.out.println("Enter City Name");
       cityobj.setCityName(sc.next());
       
       citydao.addCity(cityobj);
       
	}
	
	

}
