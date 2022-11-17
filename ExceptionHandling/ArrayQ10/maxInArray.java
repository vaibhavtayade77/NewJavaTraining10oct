
package com.yash.ExceptionHandling.ArrayQ10;

public class maxInArray {

	public static double calculateMaximum(int[] a, int total)
			throws NullPointerException, ArrayIndexOutOfBoundsException {

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
		if(total==a.length)
			throw new ArrayIndexOutOfBoundsException("index out of bound");
		else
			return a[total - 1];
	}

//	public static void main(String[] args) {
//		int arr[]= {12,87,56,87,9,87,56};
//		System.out.println("The maximum number in array is : "+maxInArray.calculateMaximum(arr, 7));
//		
//		
//	}

}
