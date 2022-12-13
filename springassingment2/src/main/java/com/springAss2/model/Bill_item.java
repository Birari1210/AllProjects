package com.springAss2.model;

//Bill_item :- biid, billid, itemid, qty, price.
public class Bill_item {
	
	int billItemid;
	int billid;
	int itemid;
	int qauntity;
	double price;
	
	public int getBillItemid() {
		return billItemid;
	}
	public void setBillItemid(int billItemid) {
		this.billItemid = billItemid;
	}
	public int getBillid() {
		return billid;
	}
	public void setBillid(int billid) {
		this.billid = billid;
	}
	public int getItemid() {
		return itemid;
	}
	public void setItemid(int itemid) {
		this.itemid = itemid;
	}
	public int getQauntity() {
		return qauntity;
	}
	public void setQauntity(int qauntity) {
		this.qauntity = qauntity;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	
	

}
