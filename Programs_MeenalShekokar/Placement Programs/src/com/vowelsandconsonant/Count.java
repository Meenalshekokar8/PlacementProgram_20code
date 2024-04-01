package com.vowelsandconsonant;

public class Count {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "hello world welcome java";
		//char[] c = s.toCharArray();
		int vowel=0;
		int consonant=0;
		
		for (int i = 0; i < s.length(); i++) { 
            if(s.charAt(i)=='a' || s.charAt(i)=='e' || s.charAt(i)=='i' || s.charAt(i)=='o' || s.charAt(i)=='u') 
                vowel++; 
            
            else if(s.charAt(i) >= 'a' && s.charAt(i)<='z')
            	consonant++;
 
	}
		System.out.println("Vowels: " + vowel);
		System.out.println("Consonant: " + consonant);
	}

}
