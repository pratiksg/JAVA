package com.capgemini.lambda.model;

import java.util.Comparator;
import java.util.Objects;

public class Employee {

	private int employeeId;
	private String employeeName;
	private String employeeDepartment;
	private double employeeSalary;
	
	public Employee() {
		super();
		
	}

	public Employee(int employeeId, String employeeName, String employeeDepartment, double employeeSalary) {
		super();
		this.employeeId = employeeId;
		this.employeeName = employeeName;
		this.employeeDepartment = employeeDepartment;
		this.employeeSalary = employeeSalary;
	}
	@Override
	public String toString() {
		return "Employee [employeeId=" + employeeId + ", employeeName=" + employeeName + ", employeeDepartment="
				+ employeeDepartment + ", employeeSalary=" + employeeSalary + "]";
	}
	
	@Override
	public boolean equals(Object obj) {
		if(obj==null)
			return false;
		if(obj==this)
			return true;
		Employee employee=(Employee)obj;
		if(this.employeeId==employee.employeeId &&this.employeeName==employee.employeeName)
			return true;
		return false;
	}
	@Override
	public int hashCode() {
		return Objects.hash(employeeId,employeeName);
	}

	public int getEmployee() {
		// TODO Auto-generated method stub
		return 0;
	}

	public int getEmployee(Comparator<Employee> c) {
		// TODO Auto-generated method stub
		return 0;
	}

	public int getEmployeeId() {
		// TODO Auto-generated method stub
		return 0;
	}
	
}

