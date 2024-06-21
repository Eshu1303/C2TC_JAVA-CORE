package com.tnsif_day_13;

import java.util.ArrayList;
import java.util.function.Function;
import java.util.stream.Stream;

public class LamdaExpressionDemo {

	public static void main(String[] args) {
		
		Message m1 = (name)-> 
		{
			System.out.println("Hello Good Morning - "+name);
		};
		
		m1.greet("Eshwari");
		
		Cube c = (a) ->
		{
			return (a*a*a);
		};
		System.out.println(c.calculate(7));
		
		
		
		Cube c1= (a)-> a*a*a;
		System.out.println(c1.calculate(97));
		
		
		//Activity- 10 20 30 40 50 60 70 ArrayList
		
		//My approach
		ArrayList<Integer> al = new ArrayList<Integer>();
		al.add(10);
		al.add(20);
		al.add(30);
		al.add(40);
		al.add(50);
		al.add(60);
		al.add(70);
		
		al.forEach(al1 -> System.out.println(al1*al1));
			
	//Mam's approach
			Stream<Integer> stream = Stream.of(10,20,30,40,50,60,70);
			Function<Integer,Integer> sqr = (n)-> n*n;
			stream.map(sqr).forEach(System.out::println);
			
			//Java 8 -----> to reduce the size of code 
	
	}

}
