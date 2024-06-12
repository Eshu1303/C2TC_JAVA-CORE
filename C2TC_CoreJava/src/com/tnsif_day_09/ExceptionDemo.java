package com.tnsif_day_09;

public class ExceptionDemo 
{
	public static void main (String[] args)
	{
		
		int arr[];
	
		try //Risky code i.e. the code that has potential to throw exception
		{
		arr= new int [] {10,20,30,40,50};
	
		System.out.println(arr[16]);
		}
		
		catch (ArrayIndexOutOfBoundsException a) //Risk Handling code
		{
			System.out.println(a.getMessage());
			System.out.println("Array index out of bound please check...");

		}
		
		finally
		{
			System.out.println("Hey I will definitely execute...");
		}
		
	
	}
}