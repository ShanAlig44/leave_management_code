package com.leave.management.model;

public class Manager extends Employee{

	@Override
	protected float calculateVacationDays(int daysWorked) {
	
		return (daysWorked / (float) 260) * EmployeeConstant.VACATION_MANAGER_EMPLOYEE;
		
	}
	
}
	
