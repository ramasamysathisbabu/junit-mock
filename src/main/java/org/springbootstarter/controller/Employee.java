package org.springbootstarter.controller;

public class Employee {

	private String empId;
	private String firstName;
	private String lastName;
	public String getEmpId() {
		return empId;
	}
	public void setEmpId(String empId) {
		this.empId = empId;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public Employee(String empId, String firstName, String lastName) {
		super();
		this.empId = empId;
		this.firstName = firstName;
		this.lastName = lastName;
	}
	public Employee() {
		super();
	}
	
	
}
