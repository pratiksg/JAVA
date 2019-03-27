package com.capgemini.files.model;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Map.Entry;
import java.util.TreeMap;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Grep 
{
	public int line;
	public int count;
	
	public TreeMap<Integer, String>	checkString() throws IOException 
	{
		String pattern = "Java";
		String content;
		line = 0;
		
		TreeMap<Integer, String> map = new TreeMap<Integer, String>();
		
		FileReader reader = new FileReader("C:\\pratiksha\\file.txt");
		BufferedReader breader = new BufferedReader(reader);
		
		
		while ((content=breader.readLine()) != null)
		{
			int count = 0;
			
			Pattern p = Pattern.compile(pattern);
			Matcher m = p.matcher(content);
			
			++line;
			
			while (m.find())
			{
				count++;
			}
			if(count > 0)
			{
				System.out.println("Line Number"+ line+ "contains count of java is" + count);
				map.put(line, content);
			}
		}
		for(Entry<Integer, String> m : map.entrySet())
		{
			System.out.println(m.getKey()+ " " + m.getValue());
		}
		breader.close();
		reader.close();
		return map;
	}
}
