package com.rotatearrayleft;

public class rotatekpos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int arr[] = { 1, 2, 3, 4, 5, 6, 7 };
        int N = arr.length;
        // Rotate 2 times
        int k = 2;
        solve(arr, k, N);
	}
	public static void solve(int arr[], int k, int n)
    {
        int p = 1;
        while (p <= k) {
            int temp = arr[0];
            for (int i = 0; i < n - 1; i++) {
                arr[i] = arr[i + 1];
            }
            arr[n - 1] = temp;
            p++;
        }
 
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
