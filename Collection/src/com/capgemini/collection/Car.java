package com.capgemini.collection;

import java.util.Objects;

public class Car implements Comparable<Car> {
	//private String Car;
	private String make;
	private String model;
	private double year;
	private double price;
	
	
	public Car() {
		super();
		// TODO Auto-generated constructor stub
	}


	public Car(String make, String model, double year, double price) {
		super();
		this.make = make;
		this.model = model;
		this.year = year;
		this.price = price;
	}


	public String getMake() {
		return make;
	}


	public void setMake(String make) {
		this.make = make;
	}


	public String getModel() {
		return model;
	}


	public void setModel(String model) {
		this.model = model;
	}


	public double getYear() {
		return year;
	}


	public void setYear(double year) {
		this.year = year;
	}


	public double getPrice() {
		return price;
	}


	public void setPrice(double price) {
		this.price = price;
	}




	@Override
	public int hashCode() {
		
		return Objects.hash(make,model);
	}


	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Car other = (Car) obj;
		if(this.make==other.make && this.model==other.model)
			return true;
		return false;
	}


	@Override
	public int compareTo(Car c) {
		
		return (this.make.compareTo(c.make) );
	}


	
	

}
