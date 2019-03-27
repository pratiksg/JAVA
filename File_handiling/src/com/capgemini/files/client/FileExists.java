package com.capgemini.files.client;

import java.io.File;
public class FileExists {
public static void main(String[]args) {

	File file=new File("C:\\Pratiksha");
	System.out.println(file.exists());
	System.out.println("file found");
	

}

private boolean file;

public Object checkExists() {
	if(file) {
		
		return true;
	}
	else
	
	return false;
}

}