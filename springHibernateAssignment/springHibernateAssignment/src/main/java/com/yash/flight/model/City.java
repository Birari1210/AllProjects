package com.yash.flight.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class City {

	@Id
	@Column(name="city_id")
	int cityid;
	String cityname;
	
	
	public City() {
		
	}
	public int getCityid() {
		return cityid;
	}
	public void setCityid(int cityid) {
		this.cityid = cityid;
	}
	public String getCityname() {
		return cityname;
	}
	public void setCityname(String cityname) {
		this.cityname = cityname;
	}
	@Override
	public String toString() {
		return "City [cityid=" + cityid + ", cityname=" + cityname + "]";
	}
	
	
	
}
