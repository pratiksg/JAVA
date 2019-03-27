package com.capgemini.collection;

import static org.junit.Assert.*;

import java.util.ArrayList;

import java.util.HashSet;
import java.util.Iterator;
import java.util.TreeSet;

import org.junit.BeforeClass;
import org.junit.Test;


public class CarTest {

	public static Car swift;
	public static Car maruti;
	public static Car audi;
	
	
	@BeforeClass
	public static void setUp()
	{
	      swift = new Car("india","lxi",2017,300000);
	      maruti=new Car("china","vxi",2016,450000);
	      audi=new Car("france","lx",2015,500000);
		}
	private Object china;
	private Object france;
	private Object india;

	@Test
	public void testCarTest() {
		ArrayList<Car>car=new ArrayList<>();
		car.add(swift);
		car.add(maruti);
		car.add(audi);
		Iterator<Car>iterator=car.iterator();
		assertEquals(swift, iterator.next());
		assertEquals(maruti, iterator.next());
		assertEquals(audi, iterator.next());
		}
	@Test
	public void testDuplicateCar() {
		HashSet<Car>car1=new HashSet<>();
		car1.add(audi);
		car1.add(maruti);
		car1.add(swift);
		car1.add(swift);
		
		assertEquals(3, car1.size());
	}
	@Test
	public void testAscendigOrder() {
		TreeSet<Car>carc=new TreeSet<>();
		carc.add(audi);
		carc.add(swift);
		carc.add(maruti);
		
		Iterator<Car>iterator=carc.iterator();
		assertEquals(maruti,iterator.next());
		assertEquals(audi,iterator.next());
		assertEquals(swift,iterator.next());
		
	}
	
	
	
}


