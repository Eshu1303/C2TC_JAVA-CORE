package com.tnsif_day_09;

import java.util.Scanner;


public class UserDefinedException
{
	public static void main( String[] args) 
	{
		
		// Take input from user and check for the age>18 or no
		
		int age;
		System.out.println("Enter the age of the candidate: ");
		
		Scanner s= new Scanner (System.in);
		age= s.nextInt();
		
		if (age<18) 
		{
			throw new CantVote("You are under age. You cannot cast the vote");
		}
		else
		{
			System.out.println("You can cast vote!!!");
		}
	}

}

class CantVote extends RuntimeException // -->Unchecked Exception
{
	
	
	public CantVote(String s) {
		super(s);//printStackTrace()
		// TODO Auto-generated constructor stub
	}

}
