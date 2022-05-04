package com.ecom.business.entities;

public class Card {
	private int idCard;
	private Article product;
	private Client client;
	int quantity;

	public Card(Article product, Client client, int quantity) {
		this.product = product;
		this.client = client;
		this.quantity = quantity;
	}

	public int getIdCard() {
		return idCard;
	}
	public void setIdCard(int idCard) {
		this.idCard = idCard;
	}
	public Article getProduct() {
		return product;
	}
	public void setProduct(Article product) {
		this.product = product;
	}
	public Client getClient() {
		return client;
	}
	public void setClient(Client client) {
		this.client = client;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
}
