package com.tnsif_day_04;

public class Address {
	
	private String street;
	private String landmark;
	private String city;
	
	
	public Address() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	
	public Address(String street, String landmark, String city) {
		super();
		this.street = street;
		this.landmark = landmark;
		this.city = city;
	}



	public String getStreet() {
		return street;
	}
	public void setStreet(String street) {
		this.street = street;
	}
	public String getLandmark() {
		return landmark;
	}
	public void setLandmark(String landmark) {
		this.landmark = landmark;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}


	@Override
	public String toString() {
		return "street=" + street + ", \nlandmark=" + landmark + ", \ncity=" + city ;
	}
	
	

}
