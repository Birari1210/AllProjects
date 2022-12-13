package com.training.exception.assingment;

public class ItemBougth {

	int itemId;
	int itemQuantity;
	Item item;
	
	public ItemBougth(int itemId, int itemQuantity, Item item) {
		super();
		this.itemId = itemId;
		this.itemQuantity = itemQuantity;
		this.item = item;
	}
	
	
	public ItemBougth(int itemId, int itemQuantity) {
		super();
		this.itemId = itemId;
		this.itemQuantity = itemQuantity;
	}


	public int getItemId() {
		return itemId;
	}
	public void setItemId(int itemId) {
		this.itemId = itemId;
	}
	public int getItemQuantity() {
		return itemQuantity;
	}
	public void setItemQuantity(int itemQuantity) {
		this.itemQuantity = itemQuantity;
	}
	public Item getItem() {
		return item;
	}
	public void setItem(Item item) {
		this.item = item;
	}
	
	
	
	
}
