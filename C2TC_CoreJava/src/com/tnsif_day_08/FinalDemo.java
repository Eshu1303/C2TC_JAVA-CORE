package com.tnsif_day_08;

public class FinalDemo {
	
	public static void main(String[] args) {
		final float pi=3.14f; //constant value, f is for float 
	}

}

//How to perform inheritance? by using extends key word
 class Parent
{
	void property() 
	{
		System.out.println("Sea facing Bunglow!!!");
	}
	void marry()
	{
		System.out.println("Srilatha....");
	}
}

class Child extends Parent
{
	
	void marry()
	{
		System.out.println("Katrina Kaif....");
	}
}