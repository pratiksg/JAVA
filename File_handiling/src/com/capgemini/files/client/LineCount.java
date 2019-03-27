package com.capgemini.files.client;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.LineNumberReader;

public class LineCount {

	public static void main(String[] args) throws IOException {

try{
    		
    		File file =new File("C:\\Pratiksha\\file1.txt");
    		
    		if(file.exists()){
    			
    		    FileReader fr = new FileReader(file);
    		    LineNumberReader lnr = new LineNumberReader(fr);
    		    
    		    int linenumber = 0;
    		    
    	            while (lnr.readLine() != null){
    	        	linenumber++;
    	            }
    	 
    	            System.out.println("Total lines : " + linenumber);
    	 
    	            lnr.close();
    	        
    		     
    		}else{
    			 System.out.println("File does not exists!");
    		}
    		
    	}catch(IOException e){
    		e.printStackTrace();
    	}
	
    }
}