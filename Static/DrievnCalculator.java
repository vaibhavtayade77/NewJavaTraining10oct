package com.yash.Static;

import java.util.Scanner;

public class DrievnCalculator {

	public static void main(String[] args) {

		char operator;
		Double a, b, result;

		Scanner input = new Scanner(System.in);

		
		System.out.println("Choose an operator: +, -, *, or /");
		operator = input.next().charAt(0);

		
		System.out.println("Enter first number");
		a = input.nextDouble();

		System.out.println("Enter second number");
		b = input.nextDouble();

		switch (operator) {

		//addition between numbers
		case '+':
			result = a + b;
			System.out.println(a + " + " + b + " = " + result);
			break;

		// substraction of given numbers
		case '-':
			result = a - b;
			System.out.println(a + " - " + b + " = " + result);
			break;

		//multiplication of given numbers
		case '*':
			result = a * b;
			System.out.println(a + " * " + b + " = " + result);
			break;

		//division of given numbers
		case '/':
			result = a / b;
			System.out.println(a + " / " + b + " = " + result);
			break;

		default:
			System.out.println("Invalid operator!");
			break;
		}

		input.close();
	}
}
