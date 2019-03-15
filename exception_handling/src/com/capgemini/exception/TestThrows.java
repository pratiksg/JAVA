package com.capgemini.exception;

import java.io.IOException;

class M{
	
	void method()throws IOException{

		throw new IOException("hello");
	
}

public class TestThrows {
	public void main(String[] args) {
		
	
	try {
		M m=new M();
		m.method();
		
		
		
		
	}
	catch(Exception e){System.out.println("Exception handled");}
		
		
		System.out.println("normal flow");
		
		
	}
	
	

}
}
