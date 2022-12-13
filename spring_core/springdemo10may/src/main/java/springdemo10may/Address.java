package springdemo10may;

public class Address {
 String addline1;
 String city;
 String state;
public Address(String addline1, String city, String state) {
	 
	this.addline1 = addline1;
	this.city = city;
	this.state = state;
}
 public void showAddress()
 {	 
	System.out.println("Address line 1:- "+addline1);
	System.out.println("City:- "+city);
	System.out.println("state:- "+state);
 }
}
