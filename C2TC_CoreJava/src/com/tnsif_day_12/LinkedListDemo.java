package com.tnsif_day_12;

import java.util.LinkedList;


public class LinkedListDemo {
	
	public static void main(String [] args) {
		LinkedList list = new LinkedList(); //Linked list declaration
		list.add(23);
		list.add("Ram");
		list.add(56.89);
		list.add(23); // allows duplicate element
		System.out.println(list);
		
	}
}
