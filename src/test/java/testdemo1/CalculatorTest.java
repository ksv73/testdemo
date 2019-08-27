package testdemo1;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import com.cgi.demo.Calculator;

public class CalculatorTest {
	
	public static Calculator calculator;

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		calculator=new Calculator();
		System.out.println("Iam being called ");
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
		calculator=null;
		System.out.println("After all the test cases");
	}

	@Before
	public void setUp() throws Exception {
		System.out.println("Before a test");
	}

	@After
	public void tearDown() throws Exception {
		System.out.println("After a test");
	}

	@Test
	public void testadd() {
		
assertEquals(5,calculator.add(2, 3));	
}
	@Test
	public void testsubtract() {
		
assertEquals(1,calculator.subtract(3, 2));	
}
	@Test
	public void testEven() {
		assertTrue(calculator.evenCheck(10));
	}
	
	

}
