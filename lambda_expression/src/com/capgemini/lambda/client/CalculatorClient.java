package com.capgemini.lambda.client;

import com.capgemini.lambda.model.Calculator;

public class CalculatorClient {
	public static void main(String[] args) {
		Calculator addition=(x,y) -> x+y;
		System.out.println(addition.calculate(23, 12));
		
		Calculator subtraction=(x,y) -> x-y;
		System.out.println(subtraction.calculate(34, 12));
		
		Calculator division=(x,y) -> x/y;
		System.out.println(division.calculate(34, 12));
		
		Calculator multiplication=(x,y) -> x*y;
		System.out.println(multiplication.calculate(34, 12));
		
		
		
	}
}
