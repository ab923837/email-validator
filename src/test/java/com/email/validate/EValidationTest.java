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
    	String correct = "hello123@gmail.com";
    	String test = "hello123@gmail.com";
    	if(email.validate(test) == 4){
    		actual = true;
    	}
        assertEquals(actual, expected);
    }
}
