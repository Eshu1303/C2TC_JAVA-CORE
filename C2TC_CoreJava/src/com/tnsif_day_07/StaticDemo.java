package com.tnsif_day_07;

public class StaticDemo 
{
	static private int serialNo;
	int section;
	
	//static block
	static
	{
		System.out.println("I am a Static Block!!!");
		serialNo= 1300;
	}

	
	//Default constructor
	public StaticDemo() {
		super();
		// TODO Auto-generated constructor stub
		System.out.println("I am default Constructor Block!!!");
		section++;
		serialNo++;

	}


	@Override
	public String toString() {
		return "Static Demo [Section = " + section +", Serial No = "+ serialNo + "]";
	}
	
	static void display()
	{
		System.out.println("Serial No = "+ serialNo);
	}
	

	
	
	

	
	
	

}
