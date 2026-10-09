package com.kodnest.Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayReverse {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		// just reverse to arrays
//		int n = sc.nextInt();
//        int [] arr = new int[n];
//        for(int i = 0; i < arr.length; i++) {
//            arr[i] = sc.nextInt();
//        }
//
//        int [] revArr = new int[n];
//        
//        int j = rev.length-1;
//        for(int i = 0; i < arr.length; i++) {
//            revArr[j] = arr[i];
//            j--;    
//        }
//		
		
		System.out.println("Enter the size");
		int n = sc.nextInt();
		
		int [] arr = new int[n];
		
		for(int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}	
		
		System.out.println(Arrays.toString(arr));
		
		System.out.println("Enter the size to rotate");
		int k = sc.nextInt();
		
		rotate(arr,k);
		
		System.out.println(Arrays.toString(arr));
	}
	
	public static void reverseArray(int [] arr, int start, int end) {
		while(start < end) {
			int temp = arr[start];
			arr[start] = arr[end];
			arr[end] = temp;
			start++;
			end--;
		}
	}
	public static void rotate(int [] arr, int k) {
		int n = arr.length;
		// reversing the entire an array from 0 to n-1;
		reverseArray(arr,0, n-1);
		
		// reverse the second array from 0 to k-1;
		reverseArray(arr, 0, k-1);
		
		// reverse the third portion from k to n-1
		reverseArray(arr, k, n-1);
	}

}
