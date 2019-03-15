package tests;

import org.junit.Test;
import main.Country;
import static org.junit.Assert.*;
import org.junit.Before;
public class CountryTest
{
	Country country[];
	@Before
	public void setUp()
	{
		country=new Country[4];
		country[0]=new Country("India",2564897,95565);
		country[1]=new Country("USA",3568794,59625);
		country[2]=new Country("UK",5485558,84628);
		country[3]=new Country("Australia",3568448,635487);	
	}
 
	@Test
	public void  testCountryWithTheLargestArea()
	{
		Country expectedOutput=new Country("UK",5485558,84628);
		Country actualOutput = new Country().countryWithTheLagestArea(country);
		assertEquals(expectedOutput.getName(),actualOutput.getName());
		assertEquals(expectedOutput.getArea(),actualOutput.getArea());
		assertEquals(expectedOutput.getPopulation(),actualOutput.getPopulation());
	}

}
