package com.capgemini.employee.model;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class MarketingExecutiveTest {

	
	MarketingExecutive me=new MarketingExecutive();
	
	@Test
	public void setUp() {
		
	
	}

	@Test
	public void testToCheckObjectIsCreated() {
	Manager manager = new Manager();
	assertNotNull(manager);
	}

	@Test 
	public void grossSalaryOfManager() {
	
	}
	

	public void testWithRightGrossSalary() {
		assertEquals(20000, me.getBasicSalary(),0.01);


	}
	public void testWithRightNetSalary() {


		assertEquals(20000, me.getBasicSalary(),0.01);
	}
}


