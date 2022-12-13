package com.training.exception.assingment;

public class Category {
	
	
	int catId;
	String categoryName;
	
	

	public Category(int catId, String categoryName) {
		super();
		this.catId = catId;
		this.categoryName = categoryName;
	}

	public int getCatId() {
		return catId;
	}

	public void setCatId(int catId) {
		this.catId = catId;
	}

	public String getCategoryName() {
		return categoryName;
	}

	public void setCategoryName(String categoryName) {
		this.categoryName = categoryName;
	}
	
	
}
