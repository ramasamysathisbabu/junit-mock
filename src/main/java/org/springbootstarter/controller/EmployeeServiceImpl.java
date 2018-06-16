package org.springbootstarter.controller;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service
@Qualifier("employeeBean")
public class EmployeeServiceImpl implements EmployeeService{

	@Override
	public Employee getEmployee(String employeeId) {
		return new Employee("Employee::" + employeeId, "Dave", "Miller");
	}

	@Override
	public Employee addEmployee(Employee employee) {
		// TODO Auto-generated method stub
		return null;
	}

}
