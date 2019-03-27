package com.capgemini.main;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class WordCount {
	public int countWord(String filedestination) throws IOException {
		File file = new File("C:\\pratiksha\\file1.txt");
		BufferedReader reader = new BufferedReader(new FileReader(file));
		String content;
		int count = 0;
		while ((content = reader.readLine()) != null) {
			for (String words : content.trim().split("\\n"))
				;
			{
				count++;

			}
		}
		reader.close();
		return count;

	}
}