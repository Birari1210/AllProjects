package com.yash.model;

import java.time.LocalTime;

import javax.persistence.Entity;
import javax.persistence.Id;

//Flight :- flightid, flight_name, pid,start_cityid, end_cityid, duration, noofseats

@Entity
public class Flight {

	@Id
	int flightid;
	String flightname;
	int pid;
	int startcityid;
	int endcityid;
	float duration;
	//LocalTime durartion;
	int noofseats;
	
	
	
	public float getDuration() {
		return duration;
	}
	public void setDuration(float duration) {
		this.duration = duration;
	}
	
	
	public int getFlightid() {
		return flightid;
	}
	public void setFlightid(int flightid) {
		this.flightid = flightid;
	}
	public String getFlightname() {
		return flightname;
	}
	public void setFlightname(String flightname) {
		this.flightname = flightname;
	}
	public int getPid() {
		return pid;
	}
	public void setPid(int pid) {
		this.pid = pid;
	}
	public int getStartcityid() {
		return startcityid;
	}
	public void setStartcityid(int startcityid) {
		this.startcityid = startcityid;
	}
	public int getEndcityid() {
		return endcityid;
	}
	public void setEndcityid(int endcityid) {
		this.endcityid = endcityid;
	}
//	public LocalTime getDurartion() {
//		return durartion;
//	}
//	public void setDurartion(LocalTime durartion) {
//		this.durartion = durartion;
//	}
	public int getNoofseats() {
		return noofseats;
	}
	public void setNoofseats(int noofseats) {
		this.noofseats = noofseats;
	}
	
	
	
}
