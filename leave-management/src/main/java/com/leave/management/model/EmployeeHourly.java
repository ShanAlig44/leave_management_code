package com.leave.management.model;

public class EmployeeHourly extends Employee{
	
		
	@Override
	protected float calculateVacationDays(int daysWorked) {
	
		return (daysWorked / (float) 260) * EmployeeConstant.VACATION_HOURLY_EMPLOYEE;
		
	}
	
	
	

}
