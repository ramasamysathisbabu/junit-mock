package org.springbootstarter.controller;

import javax.inject.Inject;
import javax.websocket.server.PathParam;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EmployeeController {

	@Inject
	@Qualifier("adminEmployeeServiceImpl")
	EmployeeService EmployeeService;
	
	@Inject
	ParentBean parentBean;
	
	@RequestMapping(value = "/test", method = RequestMethod.GET)
	public String restEndPointTest(){
		System.out.println("parent bean state:" + parentBean == null ? "parent bean null" : "not null");
		return "Testing a rest end point";
	}
	
	@RequestMapping(value = "/employee/{id}", produces = MediaType.APPLICATION_JSON_VALUE)
	public Employee getEmployee(@PathVariable("id") String employeeId){
		return EmployeeService.getEmployee(employeeId);
	}
	
	@RequestMapping(value = "/add", method = RequestMethod.POST)
	public Employee addEmployee(@RequestBody Employee employee){
		return EmployeeService.addEmployee(employee);
	}
}
