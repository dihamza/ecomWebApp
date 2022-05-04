package com.ecom.business.entities;

public class Article {
	private int idArticle;
	private String designation;
	private Double price;
	private int categoryId;
	private String photoDir;
	
	public Article(int idArticle, String designation, Double price, int categoryId, String photoDir) {
		super();
		this.idArticle = idArticle;
		this.designation = designation;
		this.price = price;
		this.categoryId = categoryId;
		this.photoDir = photoDir;
	}
	public int getIdArticle() {
		return idArticle;
	}
	public void setIdArticle(int idArticle) {
		this.idArticle = idArticle;
	}
	public String getDesignation() {
		return designation;
	}
	public void setDesignation(String designation) {
		this.designation = designation;
	}
	public Double getPrice() {
		return price;
	}
	public void setPrice(Double price) {
		this.price = price;
	}
	public int getCategoryId() {
		return categoryId;
	}
	public void setCategoryId(int categoryId) {
		this.categoryId = categoryId;
	}
	public String getPhotoDir() {
		return photoDir;
	}
	public void setPhotoDir(String photoDir) {
		this.photoDir = photoDir;
	}
	
}
