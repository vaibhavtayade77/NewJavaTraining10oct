package com.yash.ExceptionHandling.ArrayQ10;

public class maxInArrayController extends maxInArray {

	public static double calculateMaximum(int a[], int total) {

		int length = a.length;

		int sum = 0;

		for (int i = 0; i < a.length; i++) {
			sum += a[i];
		}

		double average = sum / length;

		return average;

	}

	public static void main(String[] args) {

		maxInArray m = new maxInArrayController();

		int a[] = { 23, 90, 78, 78, 67, 65 };
		int n = a.length - 1;

		try {
			double s = maxInArray.calculateMaximum(a, 7);
			System.out.println("Maximum number of array is : " + s);
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println(e.getMessage());
		}

		try {
			double average = maxInArrayController.calculateMaximum(a, 7);
			System.out.println("Average of array numbers is : " + average);
		} catch (NullPointerException ex) {
			System.out.println(ex.getMessage());
		}

	}

}
