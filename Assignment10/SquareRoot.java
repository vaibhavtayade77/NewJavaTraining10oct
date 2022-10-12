package com.vaibhav.Assignment10;

import java.util.Scanner;

public class SquareRoot {
	public static void main(String[] args) {

		System.out.print("Please enter the number : ");

		Scanner input = new Scanner(System.in);

		float number = input.nextFloat();

		System.out.println("Square root of the  " + number + " is: " + Math.sqrt(number));

	}
}
	