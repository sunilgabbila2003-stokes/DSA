package KodNest.TwoPointers;

import java.util.Scanner;

public class ProductFinding {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Size");
		int [] arr = new int[sc.nextInt()];
		System.out.println("Enter elements");
		for(int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
		}
		System.out.println("Enter target");
		int target = sc.nextInt();
		
		int i = 0;
		int j = arr.length-1;
		while(i <= j) {
			int product = arr[i] * arr[j];
			if(product == target) {
				System.out.println(arr[i] + " " + arr[j]);
				return;
			}
			else if(product < target) {
				j--;
			}
			else {
				i++;
			}
		}
		
		System.out.println("Traget not found");

	}

}
