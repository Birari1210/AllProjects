package com.yash.model;

import java.sql.Date;

import javax.persistence.Entity;
import javax.persistence.Id;

//Flight_booking_:- fbid, flightid, date.
@Entity
public class FlightBooking {

	@Id
	int fbid;
	int flightid;
	
	Date date;

	public int getFbid() {
		return fbid;
	}

	public void setFbid(int fbid) {
		this.fbid = fbid;
	}

	public int getFlightid() {
		return flightid;
	}

	public void setFlightid(int flightid) {
		this.flightid = flightid;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}
	
	
}
