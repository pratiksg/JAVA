package com.capgemini.employee.model;

public class MarketingExecutive  extends Employee{
	
	
	private int kilometres;
	private int tourAllowance;
	private int telephoneAllowance;
	
	
	
	

	public MarketingExecutive() {
		super();
	}
	
	
	public MarketingExecutive(int kilometres, int tourAllowance, int telephoneAllowance) {
		super();
		this.kilometres = kilometres;
		this.tourAllowance = tourAllowance;
		this.telephoneAllowance = telephoneAllowance;
	}




	
	
	
	@Override
	public double getGrossSalary() {
		int kilometres=50;
		tourAllowance=(5*50);
		telephoneAllowance=1500;
		double MarketingExecutiveGrossSalary=(kilometres+tourAllowance+telephoneAllowance);
	
		return MarketingExecutiveGrossSalary;
	}


	@Override
	public double getNetSalary() {
		
		double PT=200;
		double PF= (getBasicSalary()*12)/100;
		double MarketingExecutiveNetSalary=getGrossSalary()-(PT+PF);
		
		return MarketingExecutiveNetSalary;
	}




	
	
	
	
	
}
