package com.capgemini.lambda.model;

import java.util.Comparator;
import java.util.TreeSet;

public class EmployeeClient {
	public static void main(String[] args) {
		
	Comparator<Employee>c=new Comparator<Employee>() {

		@Override
		public int compare(Employee e1, Employee e2) {
			
			return Integer.compare(e1.getEmployee(), e2.getEmployee());
			
		}
		Comparator<Employee>c=(e1,e2)->Integer.compare(e1.getEmployeeId(), e2.getEmployeeId());
	
	};	
	TreeSet <Employee>employees=new TreeSet<>(c);
	
	employees.add(new Employee(101,"Alex","HR",34000));
	employees.add(new Employee(56,"Grant","Admin",12000));
	employees.add(new Employee(88,"Bob","Admin",56000));
	employees.add(new Employee(12,"Taylor","HR",12000));
	
	for(Employee employee:employees) {
		System.out.println(employee);
	}
}
}
