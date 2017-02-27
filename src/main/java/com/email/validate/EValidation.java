package com.email.validate;

import java.util.ArrayList;
import java.util.regex.Pattern;


public class EValidation 
{
	//to keep track of number of rules the email passed
    private static int num=0;
    
    public static int validate(String mail){
    	//array to store characters
    	char[] words = new char[mail.length()];
    	//storing the characters in order in array
    	for(int i=0; i< mail.length(); i++){
    		words[i] = mail.charAt(i);
    	}
    	//checker for @
    	for(int k=0; k < mail.length(); k++){
    		if(words[k] == '@'){
    			num++;
    		}
    	}
    	//checker for .
    	for(int k=0; k < mail.length(); k++){
    		if(words[k] == '.'){
    			num++;
    		}
    	}
    	return num;
    }
}
