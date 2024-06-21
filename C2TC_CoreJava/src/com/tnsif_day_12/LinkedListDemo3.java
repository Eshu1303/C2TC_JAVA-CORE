package com.tnsif_day_12;

import java.util.Iterator;
import java.util.LinkedList;

public class LinkedListDemo3 {
	 public static void main(String [] args) {
		 
		 LinkedList<String> list = new LinkedList<String>();
		 	list.add("JAVA");
			list.add("C++");
			list.add("Python");
			list.add("C");
			list.add("ML");
			System.out.println(list); //
			System.out.println(list);
			list.remove(3);
			list.removeLast();
			System.out.println(list);
			list.removeFirst();
			System.out.println(list);
			//to iterate the elements
			//descending iterator --> print tail to head
			Iterator<String> it = list.descendingIterator(); 
			
			while(it.hasNext()) //true 
			{
				System.out.println(it.next()); // returns the next element
			}
		
			
			
	 }
}
