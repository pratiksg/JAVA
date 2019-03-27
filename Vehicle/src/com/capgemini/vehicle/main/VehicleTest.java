package com.capgemini.vehicle.main;

import static org.junit.Assert.assertEquals;
import org.junit.Before;
import org.junit.jupiter.api.Test;
import org.junit.*;

public class VehicleTest {
	
	Vehicle v1=new Vehicle("John",80,45,0);
	Vehicle v2;
	Vehicle v3;
	Vehicle v4;
	@Before
	public void setUp() {
		
		v1=new Vehicle("John",80,45,0);
		v2=new Vehicle("Spider",60,180,0);
		v3=new Vehicle("tony",55,90,0);
		v4=new Vehicle("peter",46,60,0);
		
	}
	

	@Test
	void testChangeSpeedWithValidInputs() {
		assertEquals(100,v1.ChangeSpeed(20));
	}
	@Test
	void testChangeSpeedWithZeroInputs() {
	assertEquals(80,v1.ChangeSpeed(0));
	}
	@Test
	void testChangeSpeedWithNegativeInputs() {
		assertEquals( 20,v1.ChangeSpeed(-20));
	}
	@Test
	void testStop() {
		assertEquals(0,v1.stop());
	}
	@Test
	void testChangeDirectionWithValidInput()
	{
		assertEquals(45, v1.changeDirection(45,0));
		assertEquals(Vehicle.TURN_LEFT,v1.getturnOption());
	}
	@Test
	void testChangeDirectionWithChangedInput()
	{
		assertEquals(45, v1.changeDirection(45,0));
		assertEquals(Vehicle.TURN_RIGHT,v1.getturnOption());
	}
	@Test
	void testToString() {
		assertEquals("80 45",v1.toString());
	}
}	






