package com.capgemini.student.test;

import static org.junit.Assert.*;

import org.junit.jupiter.api.Test;

import com.capgemini.student.main.Student;

class StudentTest {

	@Test
	public void AgeWithinRangeException_between_15_and_21(){
		Student s= new Student();
		assertNotNull(s);
		
		}
	
		@Test
		public void  AgeNotWithinRangeException_between_15_and_21(){
			Student s= new Student();
			assertNotNull(s);
		}
		@Test
		public void NameNotValid() {
			
			Student s= new Student();
			assertNotNull(s);
		}
		@Test
		public void NameValid() {
			
			Student s= new Student();
			assertNotNull(s);
		}




}


