package com.amjad.RESTful.Controller;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.amjad.RESTful.Entity.Employee;
import com.amjad.RESTful.Service.EmployeeService;

@RestController
@RequestMapping("/employees")
public class EmployeeController {
	
	@Autowired
	private EmployeeService employeeService;
	
	@RequestMapping(method = RequestMethod.GET)
	public Collection<Employee> getAllEmployees(){
		return employeeService.getAllEmployees();
	}
	
	@RequestMapping(value = "/{employeeID}", method = RequestMethod.GET)
	public Employee getEmployeeByID(@PathVariable("employeeID") int employeeID) {
		return employeeService.getEmployeeById(employeeID);
	}
	
	@RequestMapping(value = "/{employeeID}", method = RequestMethod.DELETE)
	public void deleteEmployeeByID(@PathVariable("employeeID") int employeeID) {
		employeeService.removeEmployeeById(employeeID);
	}
	
	@RequestMapping(method = RequestMethod.PUT, consumes = MediaType.APPLICATION_JSON_VALUE)
	public void updateEmployeeByID(@RequestBody Employee employee) {
		employeeService.updateEmployee(employee);
	}
	
	@RequestMapping(method = RequestMethod.POST, consumes = MediaType.APPLICATION_JSON_VALUE)
	public void insertEmployeeByID(@RequestBody Employee employee) {
		employeeService.insertEmployee(employee);
	}
}
