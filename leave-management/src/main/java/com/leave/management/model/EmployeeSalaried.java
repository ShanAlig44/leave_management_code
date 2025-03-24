package com.leave.management.model;

public class EmployeeSalaried extends Employee{

	@Override
	protected float calculateVacationDays(int daysWorked) {
		return (daysWorked / (float) 260) * EmployeeConstant.VACATIONE_SALARIES_EMPLOYEE;
		
	}

}
