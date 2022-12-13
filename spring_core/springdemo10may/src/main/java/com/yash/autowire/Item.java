package com.yash.autowire;

public class Item {
  int id;
  String iname;
  float price;
  Category objCat2;
  
public Item() {
	super();
}
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
public Category getObjCat2() {
	return objCat2;
}
public void setObjCat2(Category objCat) {
	this.objCat2 = objCat;
}
	
  void printItem()
  {	  
	System.out.println("Item id:- "+id);
	System.out.println("Item Name:- "+iname);
	System.out.println("Item price:- "+price);
	System.out.println("catid :- "+objCat2.getCid());
	System.out.println("cat name :- "+objCat2.getCname());
  }
}
