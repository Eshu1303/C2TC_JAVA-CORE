package com.tnsif_day_10;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ComparableExecuter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<Employee> emps = new ArrayList<Employee>();
		emps.add(new Employee("Soham",1012000.0, 105));
		emps.add(new Employee("Natasha",1000200.0, 101));
		emps.add(new Employee("Akash",1202500.0, 104));
		emps.add(new Employee("Asha",100035.0, 103));
		emps.add(new Employee("Shraddha",30000.0, 102));
		
		
		//Unsorted Objects
		System.out.println("Natural Ordering of employee: ");
		emps.forEach(System.out::println);
		
		
//		Collections.sort(emps);
//		System.out.println("************");
//		System.out.println("Sorted Ordering of employee: ");
//		emps.forEach(System.out:: println);
		
		
		// Below is for Salary comparison
		Collections.sort(emps, new SalaryComparator());
		System.out.println("************");
		System.out.println("Sorted Ordering of employees on the basis of Salary: ");
		emps.forEach(System.out:: println);
		
		//Below is for Name comparison
		System.out.println("************");
		Collections.sort(emps, new NameComparator());
		System.out.println("Sorted Ordering of employees on the basis of Names: ");
		emps.forEach(System.out:: println);
		
		
		
		}

}
