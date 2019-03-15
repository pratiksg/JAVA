package com.capgemini.employee.test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import org.junit.Before;
import org.junit.Test;

import com.capgemini.employee.model.Employee;



public class EmployeeTest {
	private Employee e;
	
	@Before
	public void setUp() {
		e=new Employee(101,"John Doe",20000,1000);
	}

		
		@Test
		public void employeeObjectIsCreatedWithDefaultConstructor() {
			
			Employee e= new Employee();
			assertNotNull(e);
			
			}
		public void employeeObjectIsCreatedWithParameterisedConstructor() {
			Employee e=new Employee(101,"John Doe",20000,1000);
			assertNotNull(e);
			assertEquals(101, e.getEmployeeId());
			assertEquals("John Doe",e.getEmployeeName());
			assertEquals(20000, e.getBasicSalary(),0.01);
			assertEquals(1000, e.getMedical(),0.01);
		
			
			}
		@Test
		public void testemployeeGrossSalary() {
			e.getGrossSalary();
			assertEquals(20000, e.getBasicSalary(),0.01);
		}
		
		@Test
		public void testemployeeNetSalary() {
			e.getNetSalary();
			assertEquals(20000, e.getBasicSalary(),0.01);
		}
		
		
}
