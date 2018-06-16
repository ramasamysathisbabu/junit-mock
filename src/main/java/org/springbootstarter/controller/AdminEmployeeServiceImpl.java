package org.springbootstarter.controller;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service
//@Qualifier("adminEmployeeBean")
public class AdminEmployeeServiceImpl implements EmployeeService{

	@Override
	public Employee getEmployee(String employeeId) {
		return new Employee("AdminId::" + employeeId, "Admin FirstName", "Admin Last Miller");
	}

	public Employee addEmployee(Employee employee){
		employee.setFirstName(employee.getFirstName() + "-add-endpoint");
		return employee;
	}
}
