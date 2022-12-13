package com.yash.flight.model;

import java.time.Duration;
import java.time.LocalTime;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
@Entity
public class Flight {

	@Id
	@Column(name="flight_id")
	int flightid;
	String flight_name;
	int start_cityid;
	int end_cityid;
	int noofseats;
	LocalTime duration;
//	
//	@OneToOne
//	//@JoinColumn(name="startcity_id")
//	private City  startcity;
//	
//	@OneToOne
//	//@JoinColumn(name="endcity_id")
//	private City endcity;
	
	@OneToOne(cascade = CascadeType.ALL)
	private Plane plane;
     
	
	
	public Flight() {
		
	}

	public int getFlightid() {
		return flightid;
	}

	public void setFlightid(int flightid) {
		this.flightid = flightid;
	}

	public String getFlight_name() {
		return flight_name;
	}

	public void setFlight_name(String flight_name) {
		this.flight_name = flight_name;
	}

	public int getNoofseats() {
		return noofseats;
	}

	public void setNoofseats(int noofseats) {
		this.noofseats = noofseats;
	}

	

	public LocalTime getDuration() {
		return duration;
	}

	public void setDuration(LocalTime duration) {
		this.duration = duration;
	}

	public Plane getPlane() {
		return plane;
	}

	public void setPlane(Plane plane) {
		this.plane = plane;
	}


	public int getStart_cityid() {
		return start_cityid;
	}

	public void setStart_cityid(int start_cityid) {
		this.start_cityid = start_cityid;
	}

	public int getEnd_cityid() {
		return end_cityid;
	}

	public void setEnd_cityid(int end_cityid) {
		this.end_cityid = end_cityid;
	}

	@Override
	public String toString() {
		return "Flight [flightid=" + flightid + ", flight_name=" + flight_name + ", noofseats=" + noofseats
				+ ", duration=" + duration + ",  plane=" + plane + "]";
	}
	
	

	
	
}
