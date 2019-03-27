package com.capgemini.collection;

import static org.junit.Assert.assertEquals;
import java.awt.event.ItemEvent;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

import org.junit.Before;
import org.junit.Test;


public class TelevisionTest {
	
	public static Television sony;
	public static Television samsung;
	public static Television akai;
	
	
	@Before
	public void setUp() {
		sony=new Television ("sony","LCD",true,35000);
		samsung=new Television("samsung","LED",true,45000);
		akai=new Television("akai","plasma",true,40000);
		
	}
	@Test
	public  void testTelevision() {
		ArrayList<Television>tv=new ArrayList<Television>();
		tv.add(sony);
		tv.add(samsung);
		tv.add(akai);
		Iterator<Television>iterator=tv.iterator();
		assertEquals(sony, iterator.next());
		assertEquals(samsung, iterator.next());
		assertEquals(akai, iterator.next());
		}
	@Test
	public void testHowManyTelevision() {
		HashSet<Television>tv1=new HashSet<>();
		tv1.add(sony);
		
		assertEquals(1, tv1.size());
	}
	

}
