package org.springbootstarter.controller;

public interface EmployeeService {

		public Employee getEmployee(String employeeId);
		
		public Employee addEmployee(Employee employee);
}
