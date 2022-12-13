package com.training.exception.assingment;

import java.util.ArrayList;
import java.util.List;

public class ItemCategoryMain {

	public static void main(String[] args) throws ItemPurchaseLimitExceed{

		Category cat = new Category(1,"dairy");
		Category cat1 = new Category(2,"Food");
		Category cat2 = new Category(3,"home");

		Category cat3 = new Category(4,"medical");
		
		List<Item> item = new ArrayList<>();
		item.add(new Item(1,"Milk",26,cat,10));

		item.add(new Item(2,"chips",260,cat,30));
		item.add(new Item(3,"table",60,cat,40));
		item.add(new Item(4,"tablets",336,cat,50));
		item.add(new Item(5,"sop",88,cat,10));
		
		List<ItemBougth> ib = new ArrayList<>();
		
		
		ib.add(new ItemBougth(2,4));
		
		ib.add(new ItemBougth(4,3));
		ib.add(new ItemBougth(3,3));
		ib.add(new ItemBougth(5,10));
		
		

		for (ItemBougth itemBougth : ib) {
			
			for (Item ilist : item)
			{
			
				if(ilist.getItemId()==itemBougth.getItemId())
				{
					throw new ItemPurchaseLimitExceed("item purchase limit is over you can not buy more item");
				}
				else
				{
					int totalBill = itemBougth.getItemQuantity()*ilist.getPrice();
					System.out.println("total bill is = "+totalBill);
				}
			}
		}
	}
}
