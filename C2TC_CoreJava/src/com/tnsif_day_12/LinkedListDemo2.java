package com.tnsif_day_12;

import java.util.LinkedList;

public class LinkedListDemo2 {

	public static void main(String[] args) {

		LinkedList <Integer> list = new LinkedList <Integer>();
		list.add(10);
		list.add(20);
		list.add(30);
		list.add(40);
		
		System.out.println(list); //10,20,30,40
		//add (index, element)
		list.add(2,99);
		System.out.println(list); //10,20,99,30,40

		
		
		LinkedList <Integer> list1 = new LinkedList <Integer>();
		list1.addFirst(11);
		list1.addFirst(22);
		list1.addFirst(33);
		
		System.out.println(list1); // 33,22,11
		list.addAll(3, list1);
		System.out.println(list); // 10,20,99,33,22,11,30,40
		
	}

}
