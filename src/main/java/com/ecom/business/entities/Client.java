package com.ecom.business.entities;

public class Client {
	private int idClient;
	private String email;
	private String firstName;
	private String lastName;
	private String phone;
	private String role;
	
	
	public Client(String email, String firstName, String lastName, String phone, String role) {
		this.email = email;
		this.firstName = firstName;
		this.lastName = lastName;
		this.phone = phone;
		this.role = role;
	}
	
	public Client() {
		
	}
	
	public int getIdclient() {
		return idClient;
	}
	public void setIdclient(int idclient) {
		this.idClient = idclient;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getRole() {
		return role;
	}
	public void setRole(String role) {
		this.role = role;
	}
	
	

}
