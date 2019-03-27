package com.capgemini.exception.main;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class FactorialTest {

	@Test
	public void toCheckDEfaultValue() {
		Factorial factorial=new Factorial();
		assertNotNull(factorial);
		
	}
	@Test
	public void toCheckFactorial() {
		try {
			Factorial factorial=new Factorial(5);
		} catch (InvalidInputException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@Test
	public void toCheckNotFactorial()
	{
		try {
			Factorial factorial=new Factorial(1);
		} catch (InvalidInputException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
