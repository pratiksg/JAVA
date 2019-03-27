package com.capgemini.exception.main;

public class Factorial {
	private int number;
	private int Integer_MAX_VALUE;
	private int Integer_MIN_VALUE;
	private int factorial;

	public Factorial() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Factorial(int number)throws InvalidInputException {
		super();
		this.number = number;
	}

	public int getNumber(int number, int factorial) {
		int factorial1=-1;
		if(number>2)
			while(number!=1)
				factorial1=number*factorial1;
		return (number--);
	}


}
