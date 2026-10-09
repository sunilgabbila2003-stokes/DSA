package com.kodnest.Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class SelectionSort {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size");
		int [] arr = new int[sc.nextInt()];
		
		for(int i = 0; i < arr.length; i++) {
			arr[i] =  sc.nextInt();
		}
		
		selectionSort(arr);
		
		System.out.println("SorttedArray : " + Arrays.toString(arr));
		
	}
	
	static void selectionSort(int [] arr) {
		for(int i = 0; i < arr.length-1; i++) {
			int min = arr[i];
			int minIndex = i;
			for(int j = i+1; j < arr.length; j++) {
				if(min > arr[j]) {
					min = arr[j];
					minIndex = j;
				}
			}
			int temp = arr[i];
			arr[i] = arr[minIndex];
			arr[minIndex] = temp;
		}
	}

}

