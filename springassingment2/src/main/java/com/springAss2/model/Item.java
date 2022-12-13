package com.springAss2.model;

import java.sql.Date;

//Item :- itemid, iname, subcatid, price, dom (not null), date_of_expiry(null allowed), instock, discount
public class Item {
	
	int itemid;
	String itemName;
	int subcatid;
	double price;
	Date dom;
	Date doe;
	int instock;
	int discount;
	
	public Subcategory sb;
	
	
	
	public int getItemid() {
		return itemid;
	}
	public void setItemid(int itemid) {
		this.itemid = itemid;
	}
	public String getItemName() {
		return itemName;
	}
	public void setItemName(String itemName) {
		this.itemName = itemName;
	}
	public int getSubcatid() {
		return subcatid;
	}
	public void setSubcatid(int subcatid) {
		this.subcatid = subcatid;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public Date getDom() {
		return dom;
	}
	public void setDom(Date dom) {
		this.dom = dom;
	}
	public Date getDoe() {
		return doe;
	}
	public void setDoe(Date doe) {
		this.doe = doe;
	}
	public int getInstock() {
		return instock;
	}
	public void setInstock(int instock) {
		this.instock = instock;
	}
	public int getDiscount() {
		return discount;
	}
	public void setDiscount(int discount) {
		this.discount = discount;
	}
	
	public Subcategory getSb() {
		return sb;
	}
	public void setSb(Subcategory sb) {
		this.sb = sb;
	}
	
	@Override
	public String toString() {
		return " itemid=" + itemid + ", itemName=" + itemName + ", subcatid=" + subcatid + ", price=" + price
				+ ", dom=" + dom + ", doe=" + doe + ", instock=" + instock + ", discount=" + discount ;
	}
	

	
}
