package com.alphabetstring;

public class Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		 	String s = "$H*e;l.l.o/ Wo, r'l^?d";
	        removeSpecialCharacter(s);
	}

	static void removeSpecialCharacter(String s)
    {
        for (int i = 0; i < s.length(); i++)
        {
            if (s.charAt(i) < 'A' || s.charAt(i) > 'Z' && s.charAt(i) < 'a' || s.charAt(i) > 'z')
            {
                s = s.substring(0, i) + s.substring(i + 1);
                i--;
            }
        }
        System.out.print(s);
    }
	
}
