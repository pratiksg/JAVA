package com.capgemini.exception;

import org.junit.runners.model.Statement;

public class StudentException {

	
	static void checkAge(int age) {
		if (age>21 && age<15) {
			
			try {
				throw new Exception("age is out of range");
			} catch (Exception e) {
				
				e.printStackTrace();
			}
			
		}
		else
		{
			
			System.out.println("age is invalid");
		}
		
	}
	
	
	
	
	
}
