package tests;
import org.junit.Test;
import main.Date;
import static org.junit.Assert.*;

	public class DateTest
{	
	Date date=new Date(26,8,1995);
	@Test
	public void testDateAsString()
	{
		assertEquals(20/9/1996,date.DateAsString());

	}	
	
}