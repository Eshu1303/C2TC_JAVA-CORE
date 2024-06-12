package com.tnsif_day_08;

public class AbstractDemo {
	
	public static void main(String[] args) {
		Square s = new Square();
		s.calculateArea();
		s.display();
		
		Rectangle r = new Rectangle();
		r.calculateArea();
		r.display();
		
		
		Shape sh;
		sh= new Square (10.5f);
		sh.calculateArea();
		sh.display();
		
		Shape sp;
		sp= new Rectangle (30.0f, 40.6f );
		sp.calculateArea();
		sp.display();
	}

}
