package com.capgemini.collection;

import static org.junit.Assert.*;

import java.util.HashMap;
import java.util.HashSet;

import org.junit.BeforeClass;
import org.junit.Test;

public class StudentTest {

	public static Student pratiksha;
	public static Student pooja;
	public static Student divya;
	
	@BeforeClass
	public static void setUp() {
		pratiksha= new Student("pratiksha",13,"satara");
		pooja=new Student("pooja",15,"pune");
		divya=new Student("divya",30,"mumbai");
		
	}
	@Test
	public void testDuplicateName() {
		HashSet<Student>students=new HashSet<>();
		
			students.add(divya);
			students.add(pooja);
			students.add(pratiksha);
			assertEquals(3,students.size());
		}
	@Test
	public void testStudentByNaturalOrder() {
	HashMap <String,String> map = new HashMap<>();
	map.put(pratiksha.getName(), "mango");
	map.put(pooja.getName(), "orange");
	map.put(divya.getName(), "pineapple");
	
	
	}
	
	
	
	


}


