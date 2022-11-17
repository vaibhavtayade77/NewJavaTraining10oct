package com.yash.ExceptionHandling.userPassword;

import java.util.Scanner;

public class PasswordChecker {
	public static void isValid(String password) throws InvalidPasswordException {
		if (!((password.length() >= 8) && (password.length() <= 14))) {
			throw new InvalidPasswordException(1);
		}

		if (true) {
			int count = 0;

			for (int i = 0; i <= 9; i++) {

				String str1 = Integer.toString(i);

				if (password.contains(str1)) {
					count = 2;
				}
			}
			if (count == 0) {
				throw new InvalidPasswordException(2);
			}
		}

		if (!(password.contains("@") || password.contains("#") || password.contains("!") || password.contains("~")
				|| password.contains("$") || password.contains("%") || password.contains("^") || password.contains("&")
				|| password.contains("*") || password.contains("(") || password.contains(")") || password.contains("-")
				|| password.contains("+") || password.contains("/") || password.contains(":") || password.contains(".")
				|| password.contains(", ") || password.contains("<") || password.contains(">") || password.contains("?")
				|| password.contains("|"))) {
			throw new InvalidPasswordException(3);
		}

		if (true) {
			int count = 0;

			for (int i = 65; i <= 90; i++) {

				char c = (char) i;

				String str1 = Character.toString(c);
				if (password.contains(str1)) {
					count = 2;
				}
			}
			if (count == 0) {
				throw new InvalidPasswordException(4);
			}
		}

		if (true) {
			int count = 0;

			for (int i = 90; i <= 122; i++) {

				char c = (char) i;
				String str1 = Character.toString(c);

				if (password.contains(str1)) {
					count = 2;
				}
			}
			if (count == 0) {
				throw new InvalidPasswordException(5);
			}
		}

	}

	public static void main(String[] args) {

		System.out.println("Enter valid password...");
		Scanner sc = new Scanner(System.in);
		String password1 = sc.next();
		try {

			isValid(password1);
			System.out.println(password1 + " is Valid Password");
		} catch (InvalidPasswordException e) {
			System.out.print(e.getMessage());
			System.out.println(e.printMessage());
		}

		System.out.println("Enter another valid Password.......");
		Scanner sc1 = new Scanner(System.in);
		String password2 = sc1.next();

		try {

			isValid(password2);
			System.out.println(password2 + "  is Valid Password");
		} catch (InvalidPasswordException e) {
			System.out.print(e.getMessage());
			System.out.println(e.printMessage());
		}
	}
}
