package com.stackroute;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;



public class PowerOfFourTest {

	PowerOf4 powerOfFour;
		
	 @Before
	    public void setup() {
		 powerOfFour = new PowerOf4();	        
	 }

	 @After
	 	public void cleanup() {
		 powerOfFour = null;
	 }
	
	@Test
	public void methodShouldReturnTrueForPowerOfFour() {
		//arrange
		
		String d1 = "16777216";
		String d2 = "1";
		
		//act 
		boolean actual1 = powerOfFour.checkPower(d1);
		boolean actual2 = powerOfFour.checkPower(d2);
		
		//assert
		
		assertTrue("The number " + d1 + " is a power of 4.", actual1);	
		assertTrue("The number " + d2 + " is a power of 4.", actual2);	
		
	}
	
	@Test
	public void methodShouldReturnFalseForNonPowerOfFour() {
		//arrange
		
		String d1 = "1219";
		String d2 = "0";
		//act 
		boolean actual1 = powerOfFour.checkPower(d1);
		boolean actual2 = powerOfFour.checkPower(d2);
		
		//assert
		
		assertFalse("The number " + d1 + " is not a power of 4.", actual1);	
		assertFalse("The number " + d2 + " is not a power of 4.", actual2);	
		
	}

	
	@Test(expected = NumberFormatException.class)
	public void methodShouldThrowFormatException() {
		//arrange
		String d1 = "abc";
		
		//act 
		powerOfFour.checkPower(d1);
			
	}
	
	@Test(expected = NullPointerException.class)
	public void methodShouldThrowNullPointerException() {
		//arrange	
		String d1 = null;
		
		//act 
		powerOfFour.checkPower(d1);
	
	}
}