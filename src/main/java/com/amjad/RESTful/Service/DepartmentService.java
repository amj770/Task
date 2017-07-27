package com.amjad.RESTful.Service;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.amjad.RESTful.Dao.DepartmentDao;
import com.amjad.RESTful.Dao.EmployeeDao;
import com.amjad.RESTful.Entity.Department;
import com.amjad.RESTful.Entity.Employee;

@Service
public class DepartmentService {
	@Autowired
	private DepartmentDao departmentDao;
	
	public Collection<Department> getAllDepartments(){
		return this.departmentDao.getAllDepartments();
	}
	
	public Department getDepartmentById(int departmentID){
		return this.departmentDao.getDepartmentById(departmentID);
	}
	
	public void removeDepartmentById(int departmentID) {
		this.departmentDao.removeDepartmentById(departmentID);
	}

	public void updateDepartment(Department department) {
		this.departmentDao.updateDepartment(department);
	}

	public void insertDepartment(Department department) {
		departmentDao.insertDepartmentToDb(department);
	}
}
