package com.springcore.ass8;

import java.util.Comparator;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

//8. WAP inject list of item to bean and after this arrange all of the, item name in ascending and 
//descending order. Also remove any duplicate name of item if present

public class Item {
	
	List<String> itemlist;

	public Item(List<String> itemlist) {
		super();
		this.itemlist = itemlist;
	}

	void showItem()
	{
		System.out.println("Item list Sorted in ascending order");
		List<String> sortedlist = itemlist.stream().sorted().collect(Collectors.toList());
		System.out.println(sortedlist);

	}

	void decendingOrder() 
	{
		System.out.println("Item list Sorted in descending");

		List<String> sortlist = itemlist.stream().sorted(Comparator.reverseOrder()).collect(Collectors.toList());
		System.out.println(sortlist);
	}

	void removeDuplicateItem()
	{
		System.out.println("remove duplicate item from list");
		Set<String> itemset = itemlist.stream().collect(Collectors.toSet());
		System.out.println(itemset);
	}

}
