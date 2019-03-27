package com.capgemini.vehicle.main;

public class Vehicle {


	public static Object TURN_LEFT;
	public static Object TURN_RIGHT;
	
	private String ownerName;
	private int currentSpeed;
	private int direction;
	private int vehicleId;
	private int turnOption;
	
	
	public Vehicle() {
		super();
		
	}


	public Vehicle(String ownerName, int currentSpeed, int direction, int vehicleId) {
		super();
		this.ownerName = ownerName;
		this.currentSpeed = currentSpeed;
		this.direction = direction;
		this.vehicleId = vehicleId;
	}


	public String getOwnerName() {
		return ownerName;
	}


	public void setOwnerName(String ownerName) {
		this.ownerName = ownerName;
	}


	public int getCurrentSpeed() {
		return currentSpeed;
	}


	public void setCurrentSpeed(int currentSpeed) {
		this.currentSpeed = currentSpeed;
	}


	public int getDirection() {
		return direction;
	}


	public void setDirection(int direction) {
		this.direction = direction;
	}


	public int getVehicleId() {
		return vehicleId;
	}


	public void setVehicleId(int vehicleId) {
		this.vehicleId = vehicleId;
	}
	public int getturnOption() {
	
		return turnOption;
	}
	
	
	public void start() {
		
		
	}
	public int stop() {
		this.currentSpeed=0;
		return this.currentSpeed;
		
	}
		
	public int changeDirection(int direction ,int turnOption) {
		this.turnOption=turnOption;
		this.direction=direction;
		return this.direction;
		
	}
	public static int getHighestVehicleIdentificationNumberIssued() {
		
		
		return getHighestVehicleIdentificationNumberIssued();
	}
	public String toString() {
		return currentSpeed+""+direction;
	}


	public Object ChangeSpeed(int i) {
		// TODO Auto-generated method stub
		return null;
	}
	}
	

