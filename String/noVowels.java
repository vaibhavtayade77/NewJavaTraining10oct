package com.yash.String;

import java.util.Scanner;

public class noVowels{

//	WAP to remove all the vowels from the given string.

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the String");
		String s = sc.nextLine();
		for (int i = 0; i < s.length(); i++) {
			if (s.charAt(i) == 'a' || s.charAt(i) == 'e' || s.charAt(i) == 'i' || s.charAt(i) == 'o'
					|| s.charAt(i) == 'u') {

				continue;
			} else {
				System.out.println(s.charAt(i));
			}
		}

	}
}