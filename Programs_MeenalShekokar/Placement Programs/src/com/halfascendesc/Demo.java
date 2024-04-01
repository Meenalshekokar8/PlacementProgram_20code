package com.halfascendesc;

import java.util.Arrays;

public class Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		 int[] arr = {3, 2, 4, 1, 10, 30, 40, 20};
	      int n = arr.length;
	      printOrder(arr, n);
		
	}

	static void printOrder(int[] arr, int n)
    {
       // sorting the array
       Arrays.sort(arr);

      // printing first half in ascending order
      for (int i = 0; i < n / 2; i++) 
      { 
        System.out.print(arr[i] + " "); 
      } 
     // printing second half in descending order 
      for (int j = n - 1; j >= n / 2; j--)
      {
         System.out.print(arr[j] + " ");
      }

   }

	
}
