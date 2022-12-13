 package com.yash.flight.op;

import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalTime;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.yash.flight.dao.FlightDAO;
import com.yash.flight.model.City;
import com.yash.flight.model.Customer;
import com.yash.flight.model.Flight;
import com.yash.flight.model.FlightBooking;
import com.yash.flight.model.Plane;

public class FlightOP {

	public static void main(String[] args) {

		ApplicationContext objCTX = 
				new ClassPathXmlApplicationContext("FlightAppContext.xml");

		FlightDAO fdao =(FlightDAO) objCTX.getBean("flightdao");

		City cobj = new City();
		cobj.setCityid(1125);
		cobj.setCityname("Mumbai");

		City cobj2 = new City();
		cobj2.setCityid(1150);
		cobj2.setCityname("Nagpur");

		City cobj3 = new City();
		cobj3.setCityid(1175);
		cobj3.setCityname("Banglor");

		City cobj4 = new City();
		cobj4.setCityid(1200);
		cobj4.setCityname("Pune");

	
		Plane pobj = new Plane();
		pobj.setPlaneid(230);
		pobj.setPlanename("Shikhar");
		pobj.setLife(15);
		pobj.setYearofmanu(2005);
		pobj.setYearofdeploy(2020);

		Plane pobj2 = new Plane();
		pobj2.setPlaneid(240);
		pobj2.setPlanename("Naman");
		pobj2.setLife(20);
		pobj2.setYearofmanu(2000);
		pobj2.setYearofdeploy(2020);

		Plane pobj3 = new Plane();
		pobj3.setPlaneid(250);
		pobj3.setPlanename("Uddhan");
		pobj3.setLife(25);
		pobj3.setYearofmanu(2010);
		pobj3.setYearofdeploy(2025);

		Flight fobj = new Flight();
		fobj.setFlightid(8080);
		fobj.setFlight_name("IndiGo");
		fobj.setStart_cityid(1125);
		fobj.setEnd_cityid(1200);
		//fobj.setDuration(Duration.ofHours(2));
		fobj.setDuration(LocalTime.now());
		fobj.setNoofseats(70);
		fobj.setPlane(pobj);


		Flight fobj2 = new Flight();
		fobj2.setFlightid(9090);
		fobj2.setFlight_name("Jetway");
		fobj2.setStart_cityid(1200);
		fobj2.setEnd_cityid(1150);
		//fobj2.setDuration(Duration.ofHours(4));
		fobj2.setDuration(LocalTime.now());
		fobj2.setNoofseats(90);
		fobj2.setPlane(pobj2);

		Flight fobj3 = new Flight();
		fobj3.setFlightid(1010);
		fobj3.setFlight_name("AirIndia");
		fobj3.setStart_cityid(1175);
		fobj3.setEnd_cityid(1125);
		//fobj3.setDuration(Duration.ofHours(2));
		fobj3.setDuration(LocalTime.now());
		fobj3.setNoofseats(95);
		fobj3.setPlane(pobj);

		Flight fobj4 = new Flight();
		fobj4.setFlightid(2020);
		fobj4.setFlight_name("Kingfisher");
		fobj4.setStart_cityid(1175);
		fobj4.setEnd_cityid(1200);
		//fobj4.setDuration(Duration.ofHours(3));
		fobj4.setDuration(LocalTime.now());
		fobj4.setNoofseats(120);
		fobj4.setPlane(pobj3);


		Customer custobj = new Customer();
		custobj.setCustid(1);
		custobj.setCustname("Sonali Choure");
		custobj.setCustaddress("Sudarban Colnoy");;
		custobj.setCity("pune");
		custobj.setMobileno(344657640);		
		custobj.setAddharno(3443434);

		Customer custobj2 = new Customer();
		custobj2.setCustid(2);
		custobj2.setCustname("Suraj Kasbe");
		custobj2.setCustaddress("Wadgaon kolhati");;
		custobj2.setCity("Shambaji nagar");
		custobj2.setMobileno(877609632);		
		custobj2.setAddharno(76767676);

		Customer custobj3 = new Customer();
		custobj3.setCustid(3);
		custobj3.setCustname("Shushant Yadhav");
		custobj3.setCustaddress("Hingne home Colnoy");;
		custobj3.setCity("pune");
		custobj3.setMobileno(344657640);		
		custobj3.setAddharno(7676327);

		Customer custobj4 = new Customer();
		custobj4.setCustid(4);
		custobj4.setCustname("Nilesh Shrma");
		custobj4.setCustaddress("Magic Colnoy");;
		custobj4.setCity("delhi");
		custobj4.setMobileno(344657640);		
		custobj4.setAddharno(3443434);

		Customer custobj5 = new Customer();
		custobj5.setCustid(5);
		custobj5.setCustname("Shubham Varma");
		custobj5.setCustaddress("Sudarban Colnoy");;
		custobj5.setCity("Channi");
		custobj5.setMobileno(73287328);		
		custobj5.setAddharno(93465376);



		FlightBooking fbobj = new FlightBooking();
		fbobj.setFbid(23910);
		fbobj.setDate(LocalDate.now());	
		fbobj.setFlight(fobj4);

		FlightBooking fbobj2 = new FlightBooking();
		fbobj2.setFbid(24910);
		fbobj2.setDate(LocalDate.now());	
		fbobj2.setFlight(fobj);

		FlightBooking fbobj3 = new FlightBooking();
		fbobj3.setFbid(25910);
		fbobj3.setDate(LocalDate.now());	
		fbobj3.setFlight(fobj2);
		
		FlightBooking fbobj4 = new FlightBooking();
		fbobj4.setFbid(26910);
		fbobj4.setDate(LocalDate.now());	
		fbobj4.setFlight(fobj3);
		
 //fdao.save(fobj4, cobj5, custobj5, fbobj3, pobj3);
   fdao.save(fobj3, cobj2, custobj2, fbobj4,pobj);
	
	
	}


}
