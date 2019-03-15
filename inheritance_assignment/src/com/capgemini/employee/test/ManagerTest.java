package com.capgemini.employee.test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import org.junit.Test;

import com.capgemini.employee.model.Manager;

public class ManagerTest {

		Manager m= new Manager();
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
			assertEquals(20000, m.getBasicSalary(),0.01);
	
	
		}
		public void testWithRightNetSalary() {
	
			assertEquals(20000, m.getBasicSalary(),0.01);
	
		}
}