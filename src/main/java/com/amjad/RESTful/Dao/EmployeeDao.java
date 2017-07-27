package com.amjad.RESTful.Dao;

import java.util.Collection;

import com.amjad.RESTful.Entity.Employee;

public interface EmployeeDao {

	Collection<Employee> getAllEmployees();

	Employee getEmployeeById(int employeeID);

	void removeEmployeeById(int employeeID);

	void updateEmployee(Employee employee);

	void insertEmployeeToDb(Employee employee);	
}
