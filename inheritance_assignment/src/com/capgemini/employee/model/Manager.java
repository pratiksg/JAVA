package com.capgemini.employee.model;

public class Manager extends Employee {
	

	public Manager() {
		super();
		
	}
		

	public Manager(int employeeId, String employeeName, double basicSalary, double medical) {
		super(employeeId, employeeName, basicSalary, medical);
		
	}
	private double FoodAllowance;
	private double PetrolAllowance;
	private double OtherAllowance;
	@Override
	public double getGrossSalary() {
		PetrolAllowance=(8* getBasicSalary())/100;
		FoodAllowance=(13* getBasicSalary())/100;
		OtherAllowance=(3* getBasicSalary())/100;
		double ManagerGrossSalary=super.getGrossSalary()+FoodAllowance+PetrolAllowance+OtherAllowance;
		return ManagerGrossSalary;
	}

	@Override
	public double getNetSalary() {
		double PT=200;
		double PF= (getBasicSalary()*12)/100;
		double ManagerNetSalary=getGrossSalary()-(PT+PF);
		
		return  ManagerNetSalary;
	}









	
	
	
	
	
		
	}
	
	
	
	
	
	


