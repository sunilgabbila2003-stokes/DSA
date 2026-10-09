package com.Strings;

import java.util.Scanner;

public class StringWords {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the String");
		String [] str = sc.nextLine().split(" ");
		
		StringBuilder sb = new StringBuilder();
		
		for(int i = 0; i < str.length; i++) {
			for(int j = str[i].length()-1;j >= 0; j--) {
				sb.append(str[i].charAt(j));
			}
			sb.append(" ");
		}
		
		System.out.println("Reversed string: " + sb);
	}

}
