package com.reverse;

public class Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		 //variables initialization
        int num = 1234, reverse = 0, rem;


        //loop to find reverse number
        while (num != 0)
        {
            rem = num % 10;
            reverse = reverse * 10 + rem;
            num /= 10;
        };

        //output
        System.out.println ("Reversed Number: " + reverse);

	}

}
