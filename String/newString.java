package com.yash.String;

import java.util.Scanner;

public class newString {
	public static void main(String[] args) {

//	 Create a program in which two string is input by the user and after that 
//	 user will enter index in first string where we want to insert the second string 
//	 and insert the second string at that index and create a new string

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter First String :");
		String s1 = sc.next();
		System.out.println("Enter Second String :");
		String s2 = sc.next();
		String s3 = " ";

		System.out.println("Enter the index : ");
		int a = sc.nextInt();

		for (int i = 0; i < s1.length(); i++) {
			if (i < a) {
				s3 = s3 + s1.charAt(i);
			}
		}
		s3 = s3 + s2;
		for (int i = a + s2.length() - 2; i < s1.length(); i++) {
			s3 = s3 + s1.charAt(i);
		}
		System.out.println("The New String is "+s3);

	}

}
