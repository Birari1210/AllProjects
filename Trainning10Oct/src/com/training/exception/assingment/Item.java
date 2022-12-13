package com.training.exception.assingment;

public class Item {
	
	int itemId;
	String itemName;
	int price;

	int itemqty;
	Category category;
	
	
	public Item(int itemId, String itemName, int price, Category category, int itemqty) {
		super();
		this.itemId = itemId;
		
		this.itemName = itemName;
		this.price = price;
		this.itemqty = itemqty;
		this.category = category;
	}
	
	public int getItemId() {
		return itemId;
	}
	public void setItemId(int itemId) {
		this.itemId = itemId;
	}
	public String getItemName() {
		return itemName;
	}
	public void setItemName(String itemName) {
		this.itemName = itemName;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public int getItemqty() {
		return itemqty;
	}
	public void setItemqty(int itemqty) {
		this.itemqty = itemqty;
	}
	public Category getCategory() {
		return category;
	}
	public void setCategory(Category category) {
		this.category = category;
	}
	
	
	
	

}
