package org.springbootstarter;

import static org.mockito.Matchers.anyString;
import static org.mockito.Mockito.when;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.jsonPath;

import org.hamcrest.Matchers;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.springbootstarter.controller.Employee;
import org.springbootstarter.controller.EmployeeController;
import org.springbootstarter.controller.EmployeeService;
import org.springframework.http.MediaType;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;

@RunWith(SpringJUnit4ClassRunner.class)
public class EmployeeControllerTest {

	private MockMvc mockMvc;
	
	@Mock
	EmployeeService EmployeeService;
	
	@InjectMocks
	private EmployeeController employeeController;
	
	@Before
	public void setUp(){
		mockMvc = MockMvcBuilders.standaloneSetup(employeeController).build();
	}
	
	@Test
	public void testRestEndPointTest() throws Exception{
		when(EmployeeService.getEmployee(anyString())).thenReturn(new Employee("AdminId::", "Admin FirstName", "Admin Last Miller"));
		
		mockMvc.perform(MockMvcRequestBuilders.get("/employee/{id}", "1").accept(MediaType.APPLICATION_JSON_VALUE)).andExpect(MockMvcResultMatchers.status().isOk())
		.andExpect(jsonPath("$.empId", Matchers.is("AdminId::")));
		;
	}
}
