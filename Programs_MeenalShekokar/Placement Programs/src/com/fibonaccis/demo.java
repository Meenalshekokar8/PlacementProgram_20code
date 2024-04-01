package com.fibonaccis;

public class demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int num = 20;
	     int a = 0, b = 1;

	     // Here we are printing 0th and 1st terms
	       System.out.print (a + " , " + b + " , ");

	     int n;

	     // printing the rest of the terms here
	     for (int i = 2; i < num; i++)
	       {
	      n = a + b;
	      a = b;
	          b = n;
	          System.out.print (n + " , ");
	       }
	}

}
