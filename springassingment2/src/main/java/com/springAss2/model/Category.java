package com.springAss2.model;

public class Category {
	
	int catid;
	String catName;
	
	public int getCatid() {
		return catid;
	}
	public void setCatid(int catid) {
		this.catid = catid;
	}
	public String getCatName() {
		return catName;
	}
	public void setCatName(String catName) {
		this.catName = catName;
	}
	
	
	@Override
	public String toString() {
		return "Category [catid=" + catid + ", catName=" + catName + "]";
	}
	
	

}
