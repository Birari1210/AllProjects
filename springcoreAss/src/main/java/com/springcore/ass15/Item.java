package com.springcore.ass15;

public class Item {
	
	String itemname;
	double price;
	
	public String getItemname() {
		return itemname;
	}
	public void setItemname(String itemname) {
		this.itemname = itemname;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	
	public void itemDetails()
	{
		 System.out.println("item name :- "+itemname);
		 System.out.println("item price :-"+price);
		 
	}
	

}
