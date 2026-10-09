package com.Strings;

import java.util.Scanner;

public class ReverseString {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String str = sc.nextLine();
		
		String revStr = "";
		
		for(int i = 0; i < str.length(); i++) {
			revStr = str.charAt(i) + revStr;
		}
		
		System.out.println(revStr);

	}

}
