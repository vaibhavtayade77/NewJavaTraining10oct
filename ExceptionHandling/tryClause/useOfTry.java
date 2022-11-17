package com.yash.ExceptionHandling.tryClause;

public class useOfTry {

	public static void main(String args[]) {
		int a = 10;
		int b = 2;

		System.out.println("Try with resources with catch block");

		// Using try-with-resources
		try {
			System.out.println("The a divide by b is " + a / b);
		} catch (ArithmeticException e) {
			System.out.println(e.getMessage());

		}

		System.out.println("...................................");

		int s = 20;
		int l = 0;
		int arr[] = { 23, 34, 45, 56, 67 };
		String name = " ";

		System.out.println("Try-Catch block with multiple resources");
		try {
			System.out.println("The s multiply by l is " + s / l);
			System.out.println(arr[6]);
			System.out.println(name);
		} catch (ArithmeticException e) {
			System.out.println(e.getMessage());
		} catch (IndexOutOfBoundsException e1) {
			System.out.println(e1.getMessage());
		} catch (NullPointerException e2) {
			System.out.println();
		}

		System.out.println("..............................................");

		int arr1[] = { 12, 67, 89, 45, 34, 3 };

		System.out.println("Try Catch Finally with resources");

		try {
			System.out.println(arr1[3]);
		} catch (Exception e3) {
			System.out.println(e3.getMessage());
		} finally { // finally block always execute if their is exception or not.
			System.out.println("Try with resources completed ");

		}

	}

}
