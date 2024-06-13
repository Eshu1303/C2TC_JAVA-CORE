package com.tnsif_day_10;

import java.util.Comparator;

public class NameComparator implements Comparator<Employee> {
	//for comparing Strings we use
	// ==, equals, compareTo --> for strings comparison
	@Override
	public int compare(Employee o1, Employee o2) {
		// TODO Auto-generated method stub
		
		return o1.getName().compareTo(o2.getName());
	}

}
