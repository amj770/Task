package com.amjad.RESTful.Entity;

public class Department {
	int departmentID;
	String departmentName;
	
	public Department(int departmentID, String departmentName) {
		this.departmentID = departmentID;
		this.departmentName = departmentName;
	}
	
	public Department() {}

	public int getDepartmentID() {
		return departmentID;
	}

	public void setDepartmentID(int departmentID) {
		this.departmentID = departmentID;
	}

	public String getDepartmentName() {
		return departmentName;
	}

	public void setDepartmentName(String departmentName) {
		this.departmentName = departmentName;
	}
}
