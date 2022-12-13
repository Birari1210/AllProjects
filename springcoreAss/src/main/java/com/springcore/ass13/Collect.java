package com.springcore.ass13;

public class Collect
{
	String moviename;
	String showtime;
	int ticketPrice;
	String businessincrore;
	
	public String getMoviename() {
		return moviename;
	}
	public void setMoviename(String moviename) {
		this.moviename = moviename;
	}
	public String getShowtime() {
		return showtime;
	}
	public void setShowtime(String showtime) {
		this.showtime = showtime;
	}
	public int getTicketPrice() {
		return ticketPrice;
	}
	public void setTicketPrice(int ticketPrice) {
		this.ticketPrice = ticketPrice;
	}
	
	public String getBusinessincrore() {
		return businessincrore;
	}
	public void setBusinessincrore(String businessincrore) {
		this.businessincrore = businessincrore;
	}
	
	public void show() {
		System.out.println("movie name = "+moviename);
		System.out.println("show time = "+showtime);
		System.out.println("Price of ticket = "+ticketPrice);
		System.out.println("Total Collection = "+businessincrore);
		
	} 
}


