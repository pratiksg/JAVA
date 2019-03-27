package com.capgemini.collection;

import static org.junit.Assert.assertEquals;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

import org.junit.Before;
import org.junit.Test;

public class CellphoneTest {

	public static Cellphone oppo;
	public static Cellphone micromax;
	public static Cellphone asus;
	
	
	@Before
	public void setUp() {
		oppo=new Cellphone("oppo",3,"front_rear_camera","android",13000);
		micromax=new Cellphone("micromax",2,"notch_screen","android",15000);
		asus=new Cellphone("asus",3,"dual_camera","android",16000);
				
	}
	@Test
	public void testCellphone() {
		ArrayList<Cellphone>phone= new ArrayList<Cellphone>();
		phone.add(oppo);
		phone.add(micromax);
		phone.add(asus);
		Iterator<Cellphone>iterator=phone.iterator();
		assertEquals(oppo, iterator.next());
		assertEquals(micromax,iterator.next());
		assertEquals(asus, iterator.next());
		
	}
	@Test
	public void testCelphoneDuplicate() {
		HashSet<Cellphone>phone1=new HashSet<>();
		phone1.add(oppo);
		phone1.add(micromax);
		phone1.add(asus);
		assertEquals(3, phone1.size());
	
	}
}

