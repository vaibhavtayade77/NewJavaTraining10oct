package com.yash.Arrays;

import java.util.Scanner;

public class classifyArray {
//	An Array Contain different numbers you have
//	to find how many are even, odd, perfect and prime

	public static void main(String[] args) {
		int[] arr = { 2, 5, 45, 67, 87, 88, 90, 1, 91 };

		System.out.println(" ");

		System.out.println("The Even Elements in array are...");
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] % 2 == 0) {
				System.out.print(arr[i] + " ");
			}
		}
		System.out.println(" ");

		System.out.println("The Odd Elements in array are...");
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] % 2 != 0) {
				System.out.print(arr[i] + " ");
			}
		}
	}
}
