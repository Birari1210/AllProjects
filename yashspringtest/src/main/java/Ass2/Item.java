package Ass2;

public class Item {
	
	String itemname;
	double price;
	double discount;
	Category categoryObj;
	Company comObj;
	public String getItemname() {
		return itemname;
	}
	public void setItemname(String itemname) {
		this.itemname = itemname;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public double getDiscount() {
		return discount;
	}
	public void setDiscount(double discount) {
		this.discount = discount;
	}
	public Category getCategoryObj() {
		return categoryObj;
	}
	public void setCategoryObj(Category categoryObj) {
		this.categoryObj = categoryObj;
	}
	public Company getComObj() {
		return comObj;
	}
	public void setComObj(Company comObj) {
		this.comObj = comObj;
	}
	
	public void Details()
	  {
		  System.out.println("item name :- "+itemname);
		  System.out.println("item price  :- "+price);
		  System.out.println("item discount :- "+discount);
		  categoryObj.showcat();
		  comObj.showCompany();
		 
	  

}
}
