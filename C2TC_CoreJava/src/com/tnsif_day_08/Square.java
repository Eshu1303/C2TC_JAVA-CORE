package com.tnsif_day_08;

public class Square extends Shape
{
	float side;
	
	
	public Square() {
		side= 2.0f;
	}


	public Square(float side) {
		super();
		this.side = side;
	}


	@Override
	void calculateArea() {
		// TODO Auto-generated method stub
		super.area= side*side;
		
	}
	

}
