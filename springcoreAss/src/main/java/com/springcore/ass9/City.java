package com.springcore.ass9;

//9. WAP to inject distance between different cities. Now user will input two cities name and on 
//the basis of the city name distance will be printed
public class City 
{
	String cityName;
	int distance;

	
	public String getCityName() {
		return cityName;
	}


	public void setCityName(String cityName) {
		this.cityName = cityName;
	}


	public int getDistance() {
		return distance;
	}


	public void setDistance(int distance) {
		this.distance = distance;
	}


	void display() {
		System.out.println("city name- " + getCityName());
		System.out.println("distance- " + getDistance());
	}


}



