import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import com.capgemini.exception.InValidDayException;

class MyDateTest {

	
	
	@Test
			public void testObjectInitializationForDay()throws InvalidDayException,InvalidMonthException{
		MyDate d=new MyDate(56,9,2017);
		
	}
	@Test
	public void testObjectInitialisationForMonth()throws  InvalidDayException,InvalidMonthException{
		MyDate d=new MyDate(6,10,2016);
	}
	@Test
	public void testObjectInitialisationInvalidInputs()throws  InvalidDayException,InvalidMonthException{
		MyDate d= new MyDate(5,18,2018);
		assertEquals(5,d.getDay());
	}
	
}
	