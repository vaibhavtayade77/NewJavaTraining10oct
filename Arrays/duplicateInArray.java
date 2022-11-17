package com.yash.Arrays;

public class duplicateInArray {

//	WAP to find duplicate numbers and there counting from list of numbers.
	public static void main(String[] args) {

		int[] arr = new int[] { 1, 2, 3, 4, 2, 7, 8, 8, 3 };

		System.out.println("Duplicate elements in given array: ");

		int count = 0;
		for (int i = 0; i < arr.length; i++) {
			count = 1;
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[i] != -1)
					if (arr[i] == arr[j]) {
						arr[j] = -1;
						count++;
					}

			}
			if (count > 1) {
				System.out.println(arr[i] + " is " + count+" times.");
			}

		}
	}
}
