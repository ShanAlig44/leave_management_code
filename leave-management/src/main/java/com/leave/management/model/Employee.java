package com.leave.management.model;

abstract class Employee {
	double vacationDays = 0;
	double workingDays = 260;
	
	
	 public double getVacationDays() {
		return vacationDays;
	}


	public void setVacationDays(double vacationDays) {
		this.vacationDays = vacationDays;
	}


	public double getWorkingDays() {
		return workingDays;
	}


	public void setWorkingDays(double workingDays) {
		this.workingDays = workingDays;
	}


	public void work(int daysWorked) {
        if (daysWorked < 0 || daysWorked > workingDays) {
            throw new IllegalArgumentException("Days worked must be between 0 and 260.");
        }
        float vacationDays= calculateVacationDays(daysWorked);
        this.vacationDays += vacationDays;
    }


	protected abstract float calculateVacationDays(int daysWorked);
	
	
	// Method to take vacation, reducing vacation days
    public void takeVacation(float vacationTaken) {
        if (vacationTaken < 0 || vacationTaken > this.vacationDays) {
            throw new IllegalArgumentException("Invalid vacation days.");
        }
        this.vacationDays -= vacationTaken;
    }
	
	
	
}
