package com.yash.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class City {
	
	//City: - cityid, cityname,
				
	@Id
	int cityid;
	String cityName;
	
	
	public int getCityid() {
		return cityid;
	}
	public void setCityid(int cityid) {
		this.cityid = cityid;
	}
	public String getCityName() {
		return cityName;
	}
	public void setCityName(String cityName) {
		this.cityName = cityName;
	}

	

}
