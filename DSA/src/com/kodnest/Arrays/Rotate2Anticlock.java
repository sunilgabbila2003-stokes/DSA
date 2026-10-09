package com.kodnest.Arrays;

import java.util.Scanner;

public class Rotate2Anticlock {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("enter the size");
		
		int [] arr = new int[sc.nextInt()];
		
		System.out.println("Enter the elements");
		
		for(int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
		}
		
		if(arr.length > 2) {
			int first = arr[0];
			int second = arr[1];
			
			for(int i = 2; i < arr.length;i++) {
				arr[i-2]= arr[i];
			}
			arr[arr.length-2]= first;
			arr[arr.length-1]= second;
		}
		
		for(int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}

	}

}
