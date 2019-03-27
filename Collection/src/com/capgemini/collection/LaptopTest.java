package com.capgemini.collection;



import static org.junit.Assert.assertEquals;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

import org.junit.BeforeClass;
import org.junit.Test;


public class LaptopTest {

	public static Laptop dell;
	public static Laptop lenovo;
	public static Laptop acer;
	
	@BeforeClass
	public static void setUp()
	{
		dell=new Laptop("dell","8823","windows","i5");
		lenovo=new Laptop("lenovo","656","ubuntu","i3");
		acer=new Laptop("acer","565","windows7","i7");
		}
	


	
	@Test
	public void testLaptopTest() 
	{
		ArrayList<Laptop>laptops=new ArrayList<>();
		laptops.add(dell);
		laptops.add(lenovo);
		laptops.add(acer);
		Iterator<Laptop> iterator = laptops.iterator();
		assertEquals(dell, iterator.next());
		assertEquals(lenovo,iterator.next());
		assertEquals(acer,iterator.next());
		}
	@Test
	public void tsetLaptopHowManyLaptops()
	{
		HashSet<Laptop>laptop=new HashSet<>();
		laptop.add(dell);
		laptop.add(lenovo);
		laptop.add(acer);		
		
		
		assertEquals(3, laptop.size());
		
		
	}
	
}