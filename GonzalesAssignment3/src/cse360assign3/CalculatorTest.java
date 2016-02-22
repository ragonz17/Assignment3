package cse360assign3;

import static org.junit.Assert.*;

import org.junit.Test;

public class CalculatorTest 
{

	@Test
	public void testCalculator() 
	{
		Calculator myCalculator = new Calculator();
		assertNotNull(myCalculator);
	}
	@Test
	public void testgetTotal() 
	{
		Calculator myCalculator = new Calculator();
		assertEquals(myCalculator.getTotal(),0);
	}
	
	@Test
	public void testadd() 
	{
		Calculator myCalculator = new Calculator();
		myCalculator.add(3);
		assertEquals(myCalculator.getTotal(),3);
	}
	
	@Test
	public void testsubtract() 
	{
		Calculator myCalculator = new Calculator();
		myCalculator.add(3);
		myCalculator.subtract(2);
		assertEquals(myCalculator.getTotal(),1);
	}
	
	@Test
	public void testmultiply() 
	{
		Calculator myCalculator = new Calculator();
		myCalculator.add(3);
		myCalculator.multiply(2);
		assertEquals(myCalculator.getTotal(),6);
	}
	
	@Test
	public void testdivide() 
	{
		Calculator myCalculator = new Calculator();
		myCalculator.add(3);
		myCalculator.divide(3);
		assertEquals(myCalculator.getTotal(),1);
	}
	
	@Test
	public void testdivideZero()
	{
		Calculator myCalculator = new Calculator();
		myCalculator.add(3);
		myCalculator.divide(0);
		assertEquals(myCalculator.getTotal(),0);
	}
	
	@Test 
	public void testgetHistory() 
	{
		fail("Not yet implemented");
	}

	
}
