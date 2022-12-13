package com.yash.flight.model;

import java.time.LocalDate;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
@Entity
public class FlightBooking {
	@Id
	@Column(name="fb_id")
	int fbid;
	LocalDate date;
	
	@ManyToOne
	@JoinColumn(name="flight_id")
	private  Flight flight;

	
	
	public FlightBooking() {
	
	}

	public int getFbid() {
		return fbid;
	}

	public void setFbid(int fbid) {
		this.fbid = fbid;
	}

	public LocalDate getDate() {
		return date;
	}

	public void setDate(LocalDate date) {
		this.date = date;
	}

	public Flight getFlight() {
		return flight;
	}

	public void setFlight(Flight flight) {
		this.flight = flight;
	}

	@Override
	public String toString() {
		return "FlightBooking [fbid=" + fbid + ", date=" + date +"]";
	}
	
}
