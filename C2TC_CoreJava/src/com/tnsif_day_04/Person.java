package com.tnsif_day_04;
//Demo on "HASA" Association
public class Person {
	
	private String name;
	private Address address;
		
	public Person() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public Person(String name, Address address) {
		super();
		this.name = name;
		this.address = address;
	}

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Address getAddress() {
		return address;
	}
	public void setAddress(Address address) {
		this.address = address;
	}


	@Override
	public String toString() {
		return "Person name=" + name + ", \nAddress=" + address ;
	}
	
	
	

}
