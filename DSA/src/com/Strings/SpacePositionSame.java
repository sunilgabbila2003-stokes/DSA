package com.Strings;

import java.util.Scanner;

public class SpacePositionSame {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the String");
		
		String str = sc.nextLine();
		
		char [] ch = str.toCharArray();
		
		int j = str.length()-1;
		for(int i = 0; i < ch.length; i++) {
			if(str.charAt(i) == ' ') {
				i++;
			} else if(str.charAt(j)== ' ') {
				j--;
			}
			ch[i] = str.charAt(j);
			j--;
		}
		String res = new String(ch);
		
		System.out.println(res);
	}

}
