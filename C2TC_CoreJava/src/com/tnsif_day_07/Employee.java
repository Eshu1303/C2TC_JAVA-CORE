package com.tnsif_day_07;

public class Employee 
{
	private String name; // object bound var
	private int id; // object bound var
	static private String companyName = "Google"; // class bound var
	
	//constructor
	public Employee(String name, int id) {
		super();
		// TODO Auto-generated constructor stub
		this.name = name;
		this.id = id;
	}

	@Override
	public String toString() {
		return "Employee [Name=" + name + ", ID=" + id + ", Company Name = " + companyName +"]";
	}
	
	
	

}
