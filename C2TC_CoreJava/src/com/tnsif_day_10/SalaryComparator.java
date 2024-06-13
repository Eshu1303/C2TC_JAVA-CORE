package com.tnsif_day_10;

import java.util.Comparator;

public class SalaryComparator implements Comparator<Employee>  {

	@Override
	public int compare(Employee o1, Employee o2) {
		// TODO Auto-generated method stub
		return Double.compare(o1.getSalary(), o2.getSalary());
	}
	
	
}
