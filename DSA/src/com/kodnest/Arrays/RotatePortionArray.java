package com.kodnest.Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class RotatePortionArray {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size");
		int n  = sc.nextInt();
		
		int[] arr = new int[n];
		System.out.println("Enter the elements");
		for(int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
		}
		System.out.println("Enter the key");
		int key = sc.nextInt();
		
		System.out.println(Arrays.toString(arr));
		
	    rotate(arr, key);
	    
	    for(int i = 0; i < arr.length; i++) {
	    	System.out.print(arr[i] + " ");
	    }

	}
	
	public static void rotate(int [] arr, int key) {
		// rotate entire array o to end;
		int n = arr.length;
		reverse(arr,0, n-1);
		// rotate the first half 0 to key -1
		reverse(arr, 0, key-1);
		// rotate from half to end key to n-1
		reverse(arr, key, n-1);
	}
	
	public static void reverse(int [] arr, int start, int end) {
		while(start < end) {
			int temp = arr[start];
			arr[start] = arr[end];
			arr[end] = temp;
			start++;
			end--;
		}
	}

}
