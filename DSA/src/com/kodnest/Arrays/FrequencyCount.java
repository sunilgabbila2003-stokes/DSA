package com.kodnest.Arrays;

import java.util.Scanner;

public class FrequencyCount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size");
		int n = sc.nextInt();
		
		int [] arr = new int[n];
		
		System.out.println("Enter the elements");
		for(int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
		}
		
		int [] visited = new int[arr.length];
		
		for(int i = 0; i < arr.length; i++) {
			if(visited[i] == 1) {
				continue;
			}
			int count = 1;
			for(int j = i+1; j < visited.length; j++ ) {
				if(arr[i] == arr[j]) {
					count++;
					visited[j] = 1;
				}
			}
			System.out.println(arr[i] + " -> " + count);
		}
		

	}

}
