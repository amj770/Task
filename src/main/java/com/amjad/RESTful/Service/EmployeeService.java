package com.amjad.RESTful.Service;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.amjad.RESTful.Dao.EmployeeDao;
import com.amjad.RESTful.Entity.Employee;

@Service
public class EmployeeService {
	@Autowired
	private EmployeeDao employeeDao;
	
	public Collection<Employee> getAllEmployees(){
		return this.employeeDao.getAllEmployees();
	}
	
	public Employee getEmployeeById(int employeeID){
		return this.employeeDao.getEmployeeById(employeeID);
	}

	public void removeEmployeeById(int employeeID) {
		this.employeeDao.removeEmployeeById(employeeID);
	}

	public void updateEmployee(Employee employee) {
		this.employeeDao.updateEmployee(employee);
	}

	public void insertEmployee(Employee employee) {
		employeeDao.insertEmployeeToDb(employee);
	}
}
