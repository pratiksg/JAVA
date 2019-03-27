package com.capgemini.main;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.OutputStream;

public  class EmployeeDeserialization{
	Employee employee = new Employee(1,"Pooja",15600);
	
	public Employee EmployeeDerialization() throws IOException, ClassNotFoundException {
	FileInputStream fileInputStream = new FileInputStream("employee.ser");
	ObjectInputStream inputStream = new ObjectInputStream(fileInputStream);
	
	
	Employee e2 = (Employee) inputStream.readObject();
	inputStream.close();
	
	return e2;
}
}