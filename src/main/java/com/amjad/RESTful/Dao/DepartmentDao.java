package com.amjad.RESTful.Dao;

import java.util.Collection;

import com.amjad.RESTful.Entity.Department;
import com.amjad.RESTful.Entity.Employee;

public interface DepartmentDao {
	
	Collection<Department> getAllDepartments();

	Department getDepartmentById(int departmentID);

	void removeDepartmentById(int departmentID);

	void updateDepartment(Department department);

	void insertDepartmentToDb(Department department);
}
