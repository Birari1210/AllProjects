package com.springAss2.model;

//Subcatgory :- subcatid, catid, subcatname.

public class Subcategory {

	int subcatid;
	int catid;
	String subcatname;
	
	public int getSubcatid() {
		return subcatid;
	}
	public void setSubcatid(int subcatid) {
		this.subcatid = subcatid;
	}
	public int getCatid() {
		return catid;
	}
	public void setCatid(int catid) {
		this.catid = catid;
	}
	public String getSubcatname() {
		return subcatname;
	}
	public void setSubcatname(String subcatname) {
		this.subcatname = subcatname;
	}
	@Override
	public String toString() {
		return "Subcategory [subcatid=" + subcatid + ", catid=" + catid + ", subcatname=" + subcatname + "]";
	}
		
	
}
