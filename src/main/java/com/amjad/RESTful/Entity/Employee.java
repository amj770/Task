package com.amjad.RESTful.Entity;

public class Employee {
	int employeeID;
	int departmentID;
	String firstName;
	String lastName;
	
	public Employee(int employeeID, int departmentID, String firstName, String lastName) {
		this.employeeID = employeeID;
		this.departmentID = departmentID;
		this.firstName = firstName;
		this.lastName = lastName;
	}

	public Employee() {}
	
	public int getEmployeeID() {
		return employeeID;
	}

	public void setEmployeeID(int employeeID) {
		this.employeeID = employeeID;
	}

	public int getDepartmentID() {
		return departmentID;
	}

	public void setDepartmentID(int departmentID) {
		this.departmentID = departmentID;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
}
