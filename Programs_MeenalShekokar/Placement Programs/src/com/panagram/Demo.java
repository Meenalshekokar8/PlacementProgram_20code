package com.panagram;

public class Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
  
		String str = "Abcdefghijklmnvwxyz";  
		//determines the length of the given string  
		int len = str.length();  
		//function calling  
		if (containsAllLetters(str, len))  
		System.out.println("The given string is a pangram string.");  
		else  
		System.out.println("The given string is not a pangram string.");  
		
	}

	static int size = 26;  
	//function to check if character is a letter or not  
	static boolean isLetter(char ch)  
	{  
	if (!Character.isLetter(ch))     
	return false;  
	return true;  
	}  
	
	
	//function to check all the letters (a to z) are presented in the given string or not  
	static boolean containsAllLetters(String str, int len)  
	{  
	//converts the given string into lowercase  
	str = str.toLowerCase();  
	//creating a boolean array that stores the presence of letters  
	boolean[] present = new boolean[size];  
	//loop traverse over each character of the string  
	for (int i = 0; i < len; i++)   
	{  
	//checks if the current character is a letter  
	if (isLetter(str.charAt(i)))   
	{  
		int letter = str.charAt(i) - 'a';    
		present[letter] = true;  
	}  
	}  
	
	
	//loop iterate over every letter of the given string   
	for (int i = 0; i < size; i++)   
	{  
		if (!present[i])   
			return false;  
	}  
			return true;  
	}  
	
}
