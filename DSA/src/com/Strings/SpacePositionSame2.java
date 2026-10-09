package com.Strings;

import java.util.Scanner;

public class SpacePositionSame2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the String");
		
		String str = sc.nextLine();
		
		String result = reverseString(str);
		
		System.out.println(result);
		
		
		
		

	}
	public static String reverseString(String str) {
		char [] res = new char[str.length()];
		
		for(int i = 0; i < str.length(); i++) {
			if(str.charAt(i) == ' ') {
				res[i] = ' ';
			}
		}
		
		int j = str.length()-1;
		for(int i = 0; i < str.length(); i++) {
			if(str.charAt(i) != ' ') {
				while(res[j] == ' ') {
					j--;
				}
				res[j] = str.charAt(i);
				j--;
			}
		}
		
		String revStr = new String(res);
		return revStr;
	}

}
