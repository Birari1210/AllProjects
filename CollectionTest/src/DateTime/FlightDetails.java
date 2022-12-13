package DateTime;

import java.util.List;

public class FlightDetails {
	
	String flight_Name;
	int flight_fare;
	
	String startingCity;
	String endingCity;
	int distance;
	
	public FlightDetails(String flight_Name, int flight_fare, String startingCity, String endingCity, int distance) {
		super();
		this.flight_Name = flight_Name;
		this.flight_fare = flight_fare;
		this.startingCity = startingCity;
		this.endingCity = endingCity;
		this.distance = distance;
	}

//	@Override
//	public String toString() {
//		return "FlightDetails [flight_Name=" + flight_Name + ", flight_fare=" + flight_fare + ", startingCity="
//				+ startingCity + ", endingCity=" + endingCity + ", distance=" + distance + "]";
//	}
//
//	public static List<String> stream() {
//		// TODO Auto-generated method stub
//		return null;
//	}
	
	

}
