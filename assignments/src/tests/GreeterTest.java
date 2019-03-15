package tests;
import org.junit.Test;
import main.Greeter;
import static org.junit.Assert.*;
public class GreeterTest{
	@Test
	public void TestGreet(){
	
	assertEquals("Hello",new Greeter().greet());

		
	}
}