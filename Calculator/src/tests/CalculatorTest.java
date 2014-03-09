package tests;

import static org.junit.Assert.*;

import org.junit.Test;
import calculator.Calculator; 

public class CalculatorTest {

	@Test
	public void testGetRoots(){
		Calculator calc = new Calculator(); 
		
		assertEquals("1.0, -5.0", calc.getRoots(1, 4, -5)); 
		assertEquals("-1.0", calc.getRoots(1, 2, 1)); 
		assertEquals("No real roots.", calc.getRoots(1, 2, 5)); 
		assertEquals("7.0, -12.0", calc.getRoots(1,5,-84)); 
	}
	
	@Test
	public void testAdd(){
		Calculator calc = new Calculator(); 
		
		assertTrue(19.0 == calc.add(1.0, 5.0, 6.0, 7.0)); 
		assertTrue(10.0 == calc.add(5.0, 5.0));
	}

}
