package com.capgemini.main;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.Reader;
import java.io.Serializable;

public class EmployeeSerialization {
	static Employee e= new Employee(1,"Pooja",15600);
	
	public void EmployeeSerialization1(String string) throws IOException {

	FileOutputStream fileOutputStream = new FileOutputStream("manager.ser");
	ObjectOutputStream outputStream = new ObjectOutputStream(fileOutputStream);
	
	outputStream.writeObject(e);
	outputStream.close();
}

	public void EmployeeSerialization(String string) {
		// TODO Auto-generated method stub
		
	}

	

	
}