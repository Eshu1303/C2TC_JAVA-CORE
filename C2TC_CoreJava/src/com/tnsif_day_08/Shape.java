package com.tnsif_day_08;

public abstract class Shape //We cannot create objects for abstract classes
{
//Task by Manager	
	float area;
	
	abstract void calculateArea(); //No Body
	
	void display()
	{
		System.out.println("Area of this Shape = " + area);
	}
	
}
