package com.yash.autowire;

public class Category {
 int cid;
 String cname;
 
public Category() {
	super();
}
public int getCid() {
	return cid;
}
public void setCid(int cid) {
	this.cid = cid;
}
public String getCname() {
	return cname;
}
public void setCname(String cname) {
	this.cname = cname;
}

public Category(int cid, String cname) {
	super();
	this.cid = cid;
	this.cname = cname;
}
 
 
}
