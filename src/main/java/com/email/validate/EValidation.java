package com.email.validate;

import java.util.ArrayList;
import java.util.regex.Pattern;


public class EValidation 
{
	//to keep track of number of rules the email passed
    private static int num = 0;
    private static int atNum = 0;

    
    public static void main(String[]args){
    	String test = "abdullah@gmail.com";
    	System.out.println(validate(test));
    }
    
    public static int validate(String mail){
    	//array to store characters
    	char[] words = new char[mail.length()];
    	char[] rule = {'@', 'g', 'm', 'a', 'i', 'l', '.', 'c', 'o', 'm'}; 
    	
    	//stores mail characters into array
    	for(int i=0; i< mail.length(); i++){
    		words[i] = mail.charAt(i);
    	}
    	
    	//RULE: MUST use @gmail.com also checks for one period
    	if(mail.matches(".*@gmail.com")){
    		num += 2;
    	}

    	/*
    	 * RULE: # of character must be greater or equal to 6
    	 * AND less or equal to 16
    	*/
    	if(mail.length() >= 16 && mail.length() <= 22){
    		num++;
    	}
    	
    	
    	//RULE: checker for @
    	//makes sure there arent any more @ in the email other than the one before gmail.com
    	for(int k=0; k < mail.length(); k++){
    		if(words[k] == '@'){
    			atNum++;
    		}
    	}
    	if(atNum == 1)
    		num++;
    	return num;
   }
}
