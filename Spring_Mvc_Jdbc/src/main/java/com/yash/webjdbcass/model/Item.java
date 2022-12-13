package com.yash.webjdbcass.model;

public class Item {
	private int id;
	private String iname;
	private float price;
	private int quantity;
	private float discount;
	private double total;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getIname() {
		return iname;
	}
	public void setIname(String iname) {
		this.iname = iname;
	}
	public float getPrice() {
		return price;
	}
	public void setPrice(float price) {
		this.price = price;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	public float getDiscount() {
		return discount;
	}
	public void setDiscount(float discount) {
		this.discount = discount;
	}
	public double getTotal() {
		return (price * quantity)-((price*quantity*discount)/100);
	}
	public void setTotal(double total) {
		this.total = total;
	}
	
	
}
