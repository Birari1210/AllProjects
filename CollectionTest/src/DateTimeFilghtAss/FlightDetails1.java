package DateTimeFilghtAss;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class FlightDetails1 {

	public static void main(String[] args) {

		List<Flight> Flist = new ArrayList<>();
																   //Fare												
		Flist.add(new Flight("Dhl66114", "Delhi", "Bhopal", 1580.4, 8800));
		Flist.add(new Flight("Ams54541", "Bhuneshwar", "Amritasar", 742, 4500));
		Flist.add(new Flight("Ind21345", "Varanasi", "Indore", 854.4, 5300));
		Flist.add(new Flight("Bmy66454", "Bombay", "Amritasar", 630, 7100));
		Flist.add(new Flight("Bmj05019", "Bombay", "Jalgaon", 350, 3540));  // lowest distance
		Flist.add(new Flight("Jlg00019", "Jalgaon", "Hyderabad", 1780, 7450));

		//1) Print all flight name Lowest Distance Covered
		List<String> distnames = Flist.stream().sorted((c1, c2) -> c1.distance > c2.distance ? 1 : -1)
				.filter(e -> e.distance >= 0).map(e -> e.flightname).collect(Collectors.toList());
		System.out.println("flight distance lowest to Highest ");
		distnames.forEach(System.out::println);
		
		//2)flight less than average fare 
		double avgfare = Flist.stream().collect(Collectors.averagingDouble(e -> e.fare));
	     System.out.println("total Avarage count "+avgfare);
	   
		List<String> lessAvgfare = Flist.stream().filter(e -> e.fare < avgfare).map(e -> e.flightname).collect(Collectors.toList());
		System.out.println("flight name less than avarage fare " + lessAvgfare);
				
				
     }

}
