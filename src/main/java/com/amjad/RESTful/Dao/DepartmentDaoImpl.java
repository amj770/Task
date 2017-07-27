package com.amjad.RESTful.Dao;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.amjad.RESTful.Entity.Department;
import com.amjad.RESTful.Entity.Employee;

@Repository
public class DepartmentDaoImpl implements DepartmentDao{
	
	@Autowired
	private static Map<Integer, Department> departments;
	
	static {
		departments = new HashMap<Integer, Department>(){
			{
				put(1, new Department(1, "Computer Scienece"));
				put(2, new Department(2, "Finanace"));
				put(3, new Department(3, "Maths"));
			}
		};
	}

	@Override
	public Collection<Department> getAllDepartments(){
		return this.departments.values();
	}

	@Override
	public void removeDepartmentById(int departmentID) {
		this.departments.remove(departmentID);
	}

	@Override
	public void updateDepartment(Department department) {
		Department dept  = departments.get(department.getDepartmentID());
		dept.setDepartmentID(department.getDepartmentID());
		dept.setDepartmentName(department.getDepartmentName());
		departments.put(department.getDepartmentID(), department);
	}

	@Override
	public Department getDepartmentById(int departmentID) {
		return this.departments.get(departmentID);
	}
	
	@Override
	public void insertDepartmentToDb(Department department) {
		this.departments.put(department.getDepartmentID(), department);	
	}
}
