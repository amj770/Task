package com.amjad.RESTful.Dao;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.amjad.RESTful.Entity.Employee;

@Repository
public class EmployeeDaoImpl implements EmployeeDao{
	@Autowired
	private static Map<Integer, Employee> employees;
	
	static {
		employees = new HashMap<Integer, Employee>(){
			{
				put(1, new Employee(1, 1, "John", "Doe"));
				put(2, new Employee(2, 2, "Alex", "Slade"));
				put(3, new Employee(3, 3, "Anna", "harper"));
			}
		};
	}
	
	@Override
	public Collection<Employee> getAllEmployees(){
		return this.employees.values();
	}

	@Override
	public Employee getEmployeeById(int employeeID) {
		return this.employees.get(employeeID);
	}

	@Override
	public void removeEmployeeById(int employeeID) {
		this.employees.remove(employeeID);
	}

	@Override
	public void updateEmployee(Employee employee) {
		Employee emp  = employees.get(employee.getEmployeeID());
		emp.setDepartmentID(employee.getDepartmentID());
		emp.setFirstName(employee.getFirstName());
		emp.setLastName(employee.getLastName());
		employees.put(employee.getEmployeeID(), employee);
	}

	@Override
	public void insertEmployeeToDb(Employee employee) {
		this.employees.put(employee.getEmployeeID(), employee);	
	}
}
