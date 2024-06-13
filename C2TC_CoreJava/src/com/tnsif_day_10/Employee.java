package com.tnsif_day_10;
//Entity Class
//public class Employee implements Comparable<Employee> 
public class Employee 
{
	
	private String name;
	private double salary;
	private int eid;
	
	public Employee(String name, double salary, int eid) {
		super();
		this.name = name;
		this.salary = salary;
		this.eid = eid;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	public int getEid() {
		return eid;
	}

	public void setEid(int eid) {
		this.eid = eid;
	}

	@Override
	public String toString() {
		return "Employee [name=" + name + ", salary=" + salary + ", eid=" + eid + "]";
	}

//	@Override
//	public int compareTo(Employee otherObject) {
//		// TODO Auto-generated method stub
//		
//		return Integer.compare(this.eid, otherObject.eid); //this is current object and that is other object.
//	}
	

}
	
	
	
	

