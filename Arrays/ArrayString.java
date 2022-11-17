package com.yash.Arrays;

public class ArrayString {

//	You are having array of strings. Now you have to arrange strings in array on the 
//	basis of the length of each string. Smallest string will be first and so on.

	public static void main(String[] args) {
		String arr[] = { "vaibhav", "sujit", "swapnil", "nitin", "namdev" };
		System.out.println("The name in arrange by its length ");
		for (int i = 0; i < arr.length; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[i].length() >= arr[j].length()) {
					String temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}

			}

			System.out.println(arr[i] + " ");
		}
	}
}
