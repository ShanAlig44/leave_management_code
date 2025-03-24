package com.leave.management.model;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class EmployeeController {
	
	
	private List<Employee> employeeList;
	
    public EmployeeController() {
        employeeList = new ArrayList<>();
        for (int i = 0; i < 1; i++) {
            employeeList.add(new EmployeeHourly());
            employeeList.add(new EmployeeSalaried());
            employeeList.add(new Manager());
        }
    }
    
    
    @GetMapping("/all_employees")
    public List<Employee> getAllEmployee(){
    	return employeeList;
    }
    
    @GetMapping("/work")
    public String work(@RequestParam int employeeId, @RequestParam int daysWorked) {
        try {
        	
            employeeList.get(employeeId).work(daysWorked);
            return "Employee " + employeeId + " worked for " + daysWorked + " days.";
        } catch (IllegalArgumentException e) {
            return e.getMessage();
        }
    }
    @GetMapping("/takeVacation")
    public String takeVacation(@RequestParam int employeeId, @RequestParam float daysUsed) {
        try {
            employeeList.get(employeeId).takeVacation(daysUsed);
            return "Employee " + employeeId + " took " + daysUsed + " vacation days.";
        } catch (IllegalArgumentException e) {
            return e.getMessage();
        }
    }

}
