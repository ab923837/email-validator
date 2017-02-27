package com.email.validate;

import static org.junit.Assert.*;
import java.util.*;
import org.junit.Test;
/**
 * Unit test for email validation.
 */
public class EValidationTest
{
    
	private EValidation email = new EValidation();
	

	@Test
    public void test()
    {
		boolean actual = false;
		boolean expected = true;
    	String correct = "hello@gmail.com";
    	String wrong = "hello";
    	if(email.validate(correct) == 2){
    		actual = true;
    	}
        assertEquals(actual, expected);
    }
}
