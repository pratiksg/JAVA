package com.capgemini.main;

import java.io.File;
import java.io.FileReader;
import java.io.Serializable;

public class Employee implements Serializable {

	private int employeeId;
	private String name;
	private double salary;
	
	
	
	public Employee() {
		super();
		
	}
	

	public Employee(int employeeId, String name, double salary) {
		super();
		this.employeeId = employeeId;
		this.name = name;
		this.salary = salary;
		 
	}


	public int getEmployeeId() {
		return employeeId;
	}


	public void setEmployeeId(int employeeId) {
		this.employeeId = employeeId;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public double getSalary() {
		return salary;
	}


	public void setSalary(double salary) {
		this.salary = salary;
	}
	
}
