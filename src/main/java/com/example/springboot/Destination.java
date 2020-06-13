package com.example.springboot;


public class Destination {

	private String name;
	private String address;
	private String attraction;
	
	
	/* initialize the object*/
	
	public Destination() {}
	
	

	/*Destination Model object */
	public Destination(String name, String address, String attraction) {
		super();
		this.name = name;
		this.address = address;
		this.attraction = attraction;
	}
	
	
	
	public String getName() {
		return name;
	}
/*	public void setName(String name) {
		this.name = name;
	}*/
	public String getAddress() {
		return address;
	}
/*	public void setAddress(String address) {
		this.address = address;
	}*/
	public String getAttraction() {
		return attraction;
	}
/*	public void setAttraction(String attraction) {
		this.attraction = attraction;
	}*/
	
}
