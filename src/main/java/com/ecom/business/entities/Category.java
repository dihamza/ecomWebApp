package com.ecom.business.entities;

public class Category {
	private int idCategory;
	private String categoryName;
	public Category(int idCategory, String categoryName) {
		super();
		this.idCategory = idCategory;
		this.categoryName = categoryName;
	}
	public int getIdCategory() {
		return idCategory;
	}
	public void setIdCategory(int idCategory) {
		this.idCategory = idCategory;
	}
	public String getCategoryName() {
		return categoryName;
	}
	public void setCategoryName(String categoryName) {
		this.categoryName = categoryName;
	}
	
	
	
}
