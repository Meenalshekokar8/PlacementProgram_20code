package com.missing;

public class count {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		 int[] arr1={5,6,4,3,2};
	        System.out.println("Missing number from array arr1: "+missingNumber(arr1));
	        int[] arr2={5,3,1,2};
	        System.out.println("Missing number from array arr2: "+missingNumber(arr2));
	 
		
	}

	 public static int missingNumber(int[] arr)
	    {
	        int n=arr.length+1;
	        int sum=n*(n+1)/2;
	        int temp=0;
	        for (int i = 0; i < arr.length; i++) {
	            temp+=arr[i];
	        }
	        int missingNumber=sum-temp;
	        return missingNumber;
	    }
}
