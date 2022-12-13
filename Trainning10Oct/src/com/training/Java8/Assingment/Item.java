package com.training.Java8.Assingment;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class Item {

	int itemid;
	String iname;
	LocalDate dom;
	LocalDate dof;
	float price;

	public Item(int itemid, String iname, LocalDate dom, LocalDate dof, float price) {
		super();
		this.itemid = itemid;
		this.iname = iname;
		this.dom = dom;
		this.dof = dof;
		this.price = price;
	}

	public int getItemid() {
		return itemid;
	}

	public void setItemid(int itemid) {
		this.itemid = itemid;
	}

	public String getIname() {
		return iname;
	}

	public void setIname(String iname) {
		this.iname = iname;
	}

	public LocalDate getDom() {
		return dom;
	}

	public void setDom(LocalDate dom) {
		this.dom = dom;
	}

	public LocalDate getDof() {
		return dof;
	}

	public void setDof(LocalDate dof) {
		this.dof = dof;
	}

	public float getPrice() {
		return price;
	}

	public void setPrice(float price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "Item [itemid=" + itemid + ", iname=" + iname + ", dom=" + dom + ", dof=" + dof + ", price=" + price
				+ "]";
	}

	public static void main(String[] args) {

		List<Item> ilist = new ArrayList<>();

		ilist.add(new Item(1, "dairymilk", LocalDate.of(2022, 05, 22), LocalDate.of(2022, 10, 23), 30.0f));
		ilist.add(new Item(2, "bisckit", LocalDate.of(2020, 01, 10), LocalDate.of(2021, 10, 10), 50.0f));
		ilist.add(new Item(3, "Coconut oil", LocalDate.of(2022, 04, 12), LocalDate.of(2023, 05, 20), 70.0f));

		ilist.add(new Item(4, "nil", LocalDate.of(2020, 05, 22), LocalDate.of(2022, 10, 23), 40.0f));
		ilist.add(new Item(5, "dairymilk", LocalDate.of(2021, 05, 20), LocalDate.of(2021, 07, 17), 30.0f));
		ilist.add(new Item(6, "bottel", LocalDate.of(2020, 05, 22), null, 30.0f));
		ilist.add(new Item(7, "T Shirt", LocalDate.of(2020, 05, 22), null, 50.0f));
		ilist.add(new Item(8, "mobile", LocalDate.of(2020, 05, 22), null, 40.0f));

	//	System.out.println(ilist);

		Double totalavgPrice = ilist.stream().collect(Collectors.averagingDouble(s1 -> s1.price));

		System.out.println("Total average price of all item  " + totalavgPrice);

		// int maxHigh = ilist.stream().map(Item::getPrice).max(Integer::compare).get();

		List<Item> pname = ilist.stream().filter(e -> e.price <= totalavgPrice).collect(Collectors.toList());
		System.out.println("items  Average price");
		for (Item products : pname) 
		{
			System.out.println("item name = " + products.iname +  " item price= " + products.price);
		}
		
		System.out.println("-----------details of item highest and lowest price----------------------------");

		float highest = ilist.stream().map(Item::getPrice).max(Float::compareTo).get();
		float lowest = ilist.stream().map(Item::getPrice).min(Float::compareTo).get();

		//List<Item> highest = ilist.stream().map(Item::getPrice).max(Float::compareTo).get();
		//List<Item> itemlist = ilist.stream().filter(e->e.price).max(Item::compareTo).collect(Collectors.toList());
		
		System.out.println("Item with highest price:- " + highest);
		System.out.println("Item with lowest price:- " + lowest);
		
		
		
		System.out.println("***************");
		float max1 = ilist.stream().filter(doe -> null == doe.getDof()).map(Item::getPrice).max(Float::compare).get();

		List<Item> iname = ilist.stream().filter(e -> e.price == max1).collect(Collectors.toList());
		
		for (Item p : iname) 
		{
			if (p.dof == null) 
			{
				System.out.println("item name = " + p.iname + " item price= " + p.price);
			}
		}
		// System.out.println("" +max1);
			
		System.out.println("*************************Set**********************************************");
//			Set<Item> iname1 = ilist.stream().collect(Collectors.toSet());
//			for(Item s:iname1)
//			 {
//		 			 System.out.println("item name = "+s.iname+" item price= "+s.price);
//		 		 
//			 }

		Set<Float> priceset = ilist.stream().map(p -> p.price).collect(Collectors.toSet());
		for (Float s : priceset) 
		{
			System.out.println("item price in list to set ==" + s);
		}

		System.out.println("**************list to set item name*******");
		
		Set<String> inameset = ilist.stream().map(i -> i.iname).collect(Collectors.toSet());

		for (String n : inameset) 
		{
			System.out.println("item price in list to set =" + n);
		}

		System.out.println("--------------5 remove duplicate price--------------------------------------------------------");

		List<Float> remeove = ilist.stream().map(e -> e.getPrice()).distinct().collect(Collectors.toList());

		for (Float p : remeove) 
		{
			System.out.println(" item price= " + p);

		}
		// System.out.println(remeove);
	}

}
