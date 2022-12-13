package yashspringtest;

public class Address {
  	
	String post;
	String city;
	String state;
	public Address(String post, String city, String state) {
		
		this.post = post;
		this.city = city;
		this.state = state;
	}
 public void display()
 {
	 System.out.println("vilage post -"+post);
	 System.out.println("District -"+city);
	 System.out.println("State -"+state);
 }
	
}
