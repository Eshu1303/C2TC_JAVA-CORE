package com.tnsif_day_06;
//Child Class

public class Manager extends Employee{
	
	
	private int teamSize;


	public Manager() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Manager(String employeeName, int employeeId, int employeeSalary,int teamSize) {
		super(employeeName, employeeId, employeeSalary);
		this.teamSize=teamSize;
		// TODO Auto-generated constructor stub
	}


	public int getTeamSize() {
		return teamSize;
	}


	public void setTeamSize(int teamSize) {
		this.teamSize = teamSize;
	}
	@Override
	public String toString() {
		return "Manager [teamSize=" + teamSize + "," + super.toString()
				+  "]";
	}


	

	
	

}
