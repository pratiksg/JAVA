package com.capgemini.collection;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

import org.junit.BeforeClass;
import org.junit.Test;

public class SchoolTest {

	private static School AnantEnglishSchool;
	private static School NewEnglishSchool;
	
	@BeforeClass
	public static void setUp() {
		AnantEnglishSchool=new School("pratiksha","satara","karad");
		NewEnglishSchool=new School("pooja","pune","mulshi");
	}
	@Test
	public void testSchoolDistrictCity() {
		ArrayList<School>sc= new ArrayList<>();
		sc.add(AnantEnglishSchool);
		sc.add(NewEnglishSchool);
		Iterator<School>iterator=sc.iterator();
		assertEquals(AnantEnglishSchool, iterator.next());
		assertEquals(NewEnglishSchool,iterator.next());
	}
	@Test
	public  void testDuplicate() {
		HashSet<School>school1=new HashSet<>();
		school1.add(AnantEnglishSchool);
		school1.add(NewEnglishSchool);
		school1.add(AnantEnglishSchool);
		assertEquals(2, school1.size());
	}
}


