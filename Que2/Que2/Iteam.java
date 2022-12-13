package Que2;

import java.sql.Date;


public class Iteam {
	private int iteamid;
	private String iname;
	private int subcatid;
	private int price;
	private Date dom;
	private int instock;
	private float discount;
	private Date doe;
	public Subcatagory s;
	
	

	public int getIteamid() {
		return iteamid;
	}

	public void setIteamid(int iteamid) {
		this.iteamid = iteamid;
	}

	public String getIname() {
		return iname;
	}

	public void setIname(String iname) {
		this.iname = iname;
	}

	public int getSubcatid() {
		return subcatid;
	}

	public void setSubcatid(int subcatid) {
		this.subcatid = subcatid;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public Date getDom() {
		return dom;
	}

	public void setDom(Date dom) {
		this.dom = dom;
	}

	public int getInstock() {
		return instock;
	}

	public void setInstock(int instock) {
		this.instock = instock;
	}

	public float getDiscount() {
		return discount;
	}

	public void setDiscount(float discount) {
		this.discount = discount;
	}

	public Date getDoe() {
		return doe;
	}

	public void setDoe(Date doe) {
		this.doe = doe;
	}

	public Subcatagory getS() {
		return s;
	}

	public void setS(Subcatagory s) {
		this.s = s;
	}

	@Override
	public String toString() {
		return "Iteam [iteamid=" + iteamid + ", iname=" + iname + ", subcatid=" + subcatid + ", price=" + price
				+ ", dom=" + dom + ", instock=" + instock + ", discount=" + discount + ", doe=" + doe + ", s=" + s
				+ "]";
	}

	
	

}