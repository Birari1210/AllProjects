package com.springAss2.model;

import java.sql.Date;

//Bill :- billid, customerid, dateofbill
public class Bill {

	int billid;
	int coustomerid;
	Date dateofbill;
	
	public int getBillid() {
		return billid;
	}
	public void setBillid(int billid) {
		this.billid = billid;
	}
	public int getCoustomerid() {
		return coustomerid;
	}
	public void setCoustomerid(int coustomerid) {
		this.coustomerid = coustomerid;
	}
	public Date getDateofbill() {
		return dateofbill;
	}
	public void setDateofbill(Date dateofbill) {
		this.dateofbill = dateofbill;
	}
	
	@Override
	public String toString() {
		return "Bill [billid=" + billid + ", coustomerid=" + coustomerid + ", dateofbill=" + dateofbill + "]";
	}
	
	
	
	
	
	
}
