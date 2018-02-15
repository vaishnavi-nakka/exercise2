package com.stackroute;

import org.junit.*;
import static org.junit.Assert.*;

public class PalindromeCheckTest {
    PalindromeChecker palinCheck;
  
    
    @Before
    public void setup(){
       palinCheck = new PalindromeChecker();
    }
    
    @After
    public void cleanup()
    {
        palinCheck = null;
    }
    
    @Test
    public void methodShouldReturnTrueWhenPalindrome(){
    	//arrange
    	String str = "12321";
    	
    	//act
    	Boolean bool = palinCheck.palindromecheck(str);
    	
    	//assert
    	assertTrue(bool);
    }
    
    @Test
    public void methodShouldReturnFalseWhenPalindrome(){
    	//arrange
    	String str = "12345";
    	
    	//act
    	Boolean bool = palinCheck.palindromecheck(str);
    	
    	//assert
    	assertFalse(bool);
    }
    
    @Test
    public void methodShouldReturnNull(){
    	//arrange
    	String str = "";
    	
    	//act
    	Boolean bool = palinCheck.palindromecheck(str);
    	
    	//assert
    	assertFalse(bool);
    }
    
}

