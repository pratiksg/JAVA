package com.capgemini.exception;

import static org.junit.Assert.assertNotNull;

import org.junit.jupiter.api.Test;

import com.capgemini.student.main.Student;

public class AgeNotWithinRangeException extends Exception {

	public AgeNotWithinRangeException() {
		super();
		
	}
	@Test
	public void AgeWithinRangeException_between_15_and_21(){
		Student s= new Student();
		assertNotNull(s);
		
		}

	

	
}
