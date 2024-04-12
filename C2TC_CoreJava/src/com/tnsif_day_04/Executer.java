package com.tnsif_day_04;

public class Executer {

	public static void main(String[] args) {
	  Address address = new Address("Colaba", "Marine Drive", "Mumbai");
	   
	  Person person = new Person("Eshwari", address);
	  
	  System.out.println(person);
	}

}
