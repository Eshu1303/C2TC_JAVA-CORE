package com.tnsif_day_11;

import java.util.ArrayList;
import java.util.List;

public class ArrayListDemo {

	public static void main(String[] args) {
		ArrayList al= new ArrayList();
		
		List a = new ArrayList();
		
		System.out.println(al.size());
		al.add("Eshwari");
		al.add(45679382);
		al.add(31);
		al.add("Mumbai Marine Lines");
		
		
		al.add(2, "Eating");
		System.out.println(al);
		
		al.isEmpty();
		System.out.println(al.isEmpty());
		
		
		//Introduction to Generics ----> it was introduced to provide type safety in collection object.
		
		
		ArrayList <String> babyName = new ArrayList();
		babyName.add("Eshwari");
		babyName.add("Akash");
		babyName.add("Soham");
		babyName.add("Ritika");
//		babyName.add(123);
		
		//int Integer.... float Float.... bool Boolean.. in angular brackets we cannot use primitive data types we have to use wrapper class.
	}

}
