package com.capgemini.student.main;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import com.capgemini.exception.AgeNotWithinRangeException;
import com.capgemini.exception.NameNotValidException;

public class Student {
	private int rollNO;
	private String	name;
	private int	age;
	private String course;
	
	public Student() {
		super();
		
	}
	

	public Student(int rollNO, String name, int age, String course) throws AgeNotWithinRangeException,NameNotValidException{
		super();
		if(age<=15 && age>=21) {
			
			System.out.println("age is in range");
			this.age=age;
		}
		else {
			
			throw new AgeNotWithinRangeException();
		}
		this.rollNO = rollNO;
		this.name = name;
		this.course = course;
		
	}
	
		
	public static boolean validateLetters(String txt) {

	    String regx = "[a-zA-Z]+\\.?";
	    Pattern pattern = Pattern.compile(regx,Pattern.CASE_INSENSITIVE);
	    Matcher matcher = pattern.matcher(txt);
	    return matcher.find();
	    //throw new NameNotValidException();

	}

		
	


	public int getRollNO() {
		return rollNO;
	}


	public void setRollNO(int rollNO) {
		this.rollNO = rollNO;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public int getAge() {
		return age;
	}


	public void setAge() {
		this.age = age;
	}


	public String getCourse() {
		return course;
	}


	public void setCourse(String course) {
		this.course = course;
	}
	


	


	
	
	

}
