package com.yash.flight.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Customer {
	@Id
	@Column(name="cust_id")
	int custid;
	String custname;
	String custaddress;
	String city;
	long mobileno;
	long addharno;
	
	
	public Customer() {
	}
	public int getCustid() {
		return custid;
	}
	public void setCustid(int custid) {
		this.custid = custid;
	}
	public String getCustname() {
		return custname;
	}
	public void setCustname(String custname) {
		this.custname = custname;
	}
	public String getCustaddress() {
		return custaddress;
	}
	public void setCustaddress(String custaddress) {
		this.custaddress = custaddress;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public long getMobileno() {
		return mobileno;
	}
	public void setMobileno(long mobileno) {
		this.mobileno = mobileno;
	}
	public long getAddharno() {
		return addharno;
	}
	public void setAddharno(long addharno) {
		this.addharno = addharno;
	}
	@Override
	public String toString() {
		return "Customer [custid=" + custid + ", custname=" + custname + ", custaddress=" + custaddress + ", city="
				+ city + ", mobileno=" + mobileno + ", addharno=" + addharno + "]";
	}
	
	
	
}
