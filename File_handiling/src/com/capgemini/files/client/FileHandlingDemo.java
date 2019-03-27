package com.capgemini.files.client;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class FileHandlingDemo {

	public static void main(String[] args) throws IOException {
		/*
		 * File file=new File("C:\\Pratiksha"); System.out.println(file.exists()); File
		 * folder= new File("C:\\Pratiksha\\New folder\\src");
		 * System.out.println(folder.exists());
		 * 
		 */
		/*
		 * File file = new File("text.txt"); if (!file.exists()) { file.createNewFile();
		 * System.out.println("file is created successfully"); }
		 */
		// FileWriter writer= new FileWriter(file);
		/*
		 * PrintWriter writer=new PrintWriter(new FileWriter(file,true));
		 * writer.println("Hello...\n"); writer.println("how are you\n");
		 * writer.println("I hope you are fine\n"); writer.println("bye\n");
		 * 
		 * writer.close(); System.out.println("Content has been written successfully");
		 * }
		 */
		/*
		 * FileReader reader = new
		 * FileReader("C:\\Pratiksha\\New folder\\src\\hello.java"); BufferedReader
		 * bReader = new BufferedReader(reader); PrintWriter writer=new
		 * PrintWriter("C:\\Pratiksha\\New folder\\src\\Greetor.java"); String content;
		 * while ((content = bReader.readLine()) != null) {
		 * //System.out.println(content); writer.println(content);
		 * 
		 * } System.out.println("--success--"); writer.close(); bReader.close();
		 * reader.close();
		 * 
		 * }
		 */
		File newDir = new File("mydir");
		if (!newDir.exists()) {
			newDir.mkdir();
			System.out.println("Folder is successfully created");

		}
		File file = new File(newDir, "myfile.txt");
		if (!file.exists())
			file.createNewFile();
		System.out.println("file is successfully created");
	}
}