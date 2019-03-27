package com.capgemini.test;

import static org.junit.Assert.*;

import java.io.File;
import java.io.IOException;

import org.junit.Test;

import com.capgemini.files.client.FileExists;
import com.capgemini.main.Employee;
import com.capgemini.main.EmployeeSerialization;

public class EmployeeTest {
	
	@Test
	public void testToCheckFileExist() {
		FileExists file = new FileExists();
		assertEquals(false,file.checkExists());
		
	}

	/*@Test
	public void testForSerialization()throws IOException{
		Employee e= new Employee(1,"Pooja",15600);
		EmployeeSerialization employeeserialization=new EmployeeSerialization();
		
		employeeserialization.EmployeeSerialization("manager.ser");
		assertTrue(true, File.exists());
		
	}*/
	public void testForserialization()throws IOException,ClassNotFoundException{
		EmployeeSerialization employyeserialization=new EmployeeSerialization();
		Employee employee1=new Employee(10,"Pooja",15600);
		assertTrue(employee1.equals(EmployeeDerialization(employee1)));
	}


	private Object EmployeeDerialization(Employee employee1) {
		
		return null;
	}


	

}
