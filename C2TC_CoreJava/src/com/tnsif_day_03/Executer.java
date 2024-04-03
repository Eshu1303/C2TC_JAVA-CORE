package com.tnsif_day_03;

import java.util.Scanner;

public class Executer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter Customer ID: ");
		int  id = sc.nextInt();
		
		
		System.out.println("Enter Customer Name: ");
		String name = sc.next();
		
		System.out.println("Enter Customer City:");
		String city = sc.next();
		
//		Customer c1= new Customer();
//		c1.setCustomerId(id);
//		c1.setCustomerCity(city);
//		c1.setCustomerName(name);
//		System.out.println("Customer details"+ c1);
		
		Customer c2= new Customer(id, name, city);
		
		System.out.println(c2);
		}

}

