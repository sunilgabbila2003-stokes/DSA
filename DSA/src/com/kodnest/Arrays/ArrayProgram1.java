package com.kodnest.Arrays;

import java.util.Scanner;

public class ArrayProgram1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size");
		int n = sc.nextInt();
		
		int [] arr = new int[n];
		System.err.println("Enter the values");
		for(int i = 0;  i < arr.length;i++) {
			arr[i] = sc.nextInt();
		}
		
		int[] visted = new int[n];
		
		for(int i = 0; i < arr.length; i++) {
			if(visted[i] == 1) {
				continue;
			}
			int count = 1; 
			for(int j = i+1; j < arr.length; j++) {
				if(arr[i] == arr[j]) {
					count++;
					visted[j] = 1;
				}
			}
			System.out.println(arr[i] +" " +  count);
		}

	}

}
