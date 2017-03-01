package com.email.validate;

import java.util.ArrayList;
import java.util.regex.Pattern;


public class EValidation 
{
	//to keep track of number of rules the email passed
    private static int atRule=0;
    private static int PRule=0;

    
    public static int validate(String mail){
    	int total, Atnum = 0, Pnum = 0;
    	//array to store characters
    	char[] words = new char[mail.length()];
    	//storing the characters in order in array
    	for(int i=0; i< mail.length(); i++){
    		words[i] = mail.charAt(i);
    	}
    	//checker for @
    	for(int k=0; k < mail.length(); k++){
    		if(words[k] == '@'){
    			Atnum++;
    		}
    	}
    	if(Atnum == 0 || Atnum > 1){
    		atRule = 1;
    	}
    	//checker for .
    	for(int k=0; k < mail.length(); k++){
    		if(words[k] == '.'){
    			Pnum++;
    		}
    	}
    	if(Pnum < 1){
    		PRule = 1;
    	}
    	total = atRule + PRule;
    	return total;
    }
}
