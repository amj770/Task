package com.amjad.RESTful.Controller;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.amjad.RESTful.Entity.Department;
import com.amjad.RESTful.Entity.Employee;
import com.amjad.RESTful.Service.DepartmentService;


@RestController
@RequestMapping("/departments")
public class DepartmentController {
	@Autowired
	private DepartmentService departmentService;
	
	@RequestMapping(method = RequestMethod.GET)
	public Collection<Department> getAllDepartments(){
		return departmentService.getAllDepartments();
	}
	
	@RequestMapping(value = "/{departmentID}", method = RequestMethod.GET)
	public Department getDepartmentByID(@PathVariable("departmentID") int departmentID) {
		return departmentService.getDepartmentById(departmentID);
	}
	
	@RequestMapping(value = "/{departmentID}", method = RequestMethod.DELETE)
	public void deleteDepartmentByID(@PathVariable("departmentID") int departmentID) {
		departmentService.removeDepartmentById(departmentID);
	}
	
	@RequestMapping(method = RequestMethod.PUT, consumes = MediaType.APPLICATION_JSON_VALUE)
	public void updateDepartmentByID(@RequestBody Department department) {
		departmentService.updateDepartment(department);
	}
	
	@RequestMapping(method = RequestMethod.POST, consumes = MediaType.APPLICATION_JSON_VALUE)
	public void insertDepartmentByID(@RequestBody Department department) {
		departmentService.insertDepartment(department);
	}
}
