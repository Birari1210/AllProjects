package com.springcore.ass15;

public class Customer {
	
	String name;
	String address;
	Item itemObj;
    Category categoryObj;
    

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}


	public Item getItemObj() {
		return itemObj;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public void setItemObj(Item itemObj) {
		this.itemObj = itemObj;
	}


	public Category getCategoryObj() {
		return categoryObj;
	}


	public void setCategoryObj(Category categoryObj) {
		this.categoryObj = categoryObj;
	}

	public void display()
	{
		System.out.println("Costomer Name :-"+name);
		System.out.println("Costemer Address :-"+address);
		
		itemObj.itemDetails();
		categoryObj.showcat();
	}
	

}
