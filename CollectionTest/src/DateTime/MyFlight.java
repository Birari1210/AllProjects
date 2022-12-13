package DateTime;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class MyFlight {

	public static void main(String[] args) {
		

		FlightDetails f = new FlightDetails("AirInd01123", 12000, "Bhopal", "jalgaon", 560);
	    FlightDetails f2 = new FlightDetails("Indigo3036", 4000, "Mumbai", "Indor", 1220);
		FlightDetails f3 = new FlightDetails("AirInd01123", 12000, "Dehli", "Bangalore", 664);

		List<FlightDetails> fList = new ArrayList<>();
		
		fList.add(f);
		fList.add(f2);
		fList.add(f3);
		
		//System.out.println(fList);
		
//		List<String> dnames = fList.stream().sorted((c1, c2) -> c1.distance > c2.distance ? 1 : -1).filter(e -> e.distance >= 0).map(e -> e.fname).collect(Collectors.toList());
//		System.out.println("flight distance lowest to Highest "+dnames);
//		dnames.forEach(System.out::println);
//		
	//	List<String> DCover = fList.stream().sorted(c,c1)->c.distance>c1.distance ?1:1).filter(e->e))
			
	}	
}
