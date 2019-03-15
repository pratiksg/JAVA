package tests;

import org.junit.Test;
import main.Triangle;
import static org.junit.Assert.*;



public class TriangleTest
{
	
	@Test
	public void isRight()
	{	
		Triangle triangle = new Triangle(3,2,9);
		assertTrue(triangle.isRight());
	}
	@Test
	public void isScalene()
	{
		Triangle triangle = new Triangle(4,6,7);
		assertTrue(triangle.isScalene());

	}
	@Test
	public void isEquilateral()
	{
		Triangle triangle = new Triangle(5,5,5);
		assertTrue(triangle.isEquilateral());
	}
	@Test
	public void isIsosceles()
	{
		Triangle triangle = new Triangle(4,4,6);
		assertTrue(triangle.isIsosceles());
	}

}