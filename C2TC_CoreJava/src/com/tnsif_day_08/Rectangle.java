package com.tnsif_day_08;

public class Rectangle extends Shape
{	
	float length, breadth;

	public Rectangle() {
		super();
		length= 5.0f;
		breadth= 5.0f;
		
	}

	public Rectangle(float length, float breadth) {
		super();
		this.length = length;
		this.breadth = breadth;
	}

	@Override
	void calculateArea() {
		// TODO Auto-generated method stub
		super.area = length*breadth;
		
	}
	
	

}
