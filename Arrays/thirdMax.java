package com.yash.Arrays;

public class thirdMax {
	
//	WAP to find third maximum number from list of numbers.

	public static int getThirdLargest(int[] a,int total) {
		int temp;
		
		for (int i = 0; i < total; i++) {
			for (int j = i + 1; j < total; j++) {
				if (a[i] > a[j]) {
					temp = a[i];
					a[i] = a[j];
					a[j] = temp;
				}
			}
		}
		return a[total-1];
	}
	public static void main(String[] args) {
		int[] arr = { 10, 20, 33, 49, 55, 6 };
		System.out.println("The third maximun number in array is : "+getThirdLargest(arr, 6));
	}
}
