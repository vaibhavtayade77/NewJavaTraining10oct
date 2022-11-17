package com.yash.String;

import java.util.Arrays;
import java.util.Scanner;

public class StringOrder {
	
//	WAP to print the all alphabets of string in ascending and descending order.
		
	public static void main(String[] args)
	{
		String str;
		Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string : ");
		str = sc.nextLine();
		int j = 0;
		char temp = 0;
		char[] chars = str.toCharArray();
		for (int i = 0; i < chars.length; i++) {
				for (j = 0; j < chars.length; j++) {
						if (chars[j] > chars[i]) {
								temp = chars[i];
								chars[i] = chars[j];
								chars[j] = temp;
						}
				}
		}
	System.out.println("The string in asending order is  : ");
	for (int i = 0; i < chars.length; i++) {
		System.out.print(chars[i]);
		}
	
	System.out.println(" ");

	
	
	for (int i = 0; i < chars.length; i++) {
			for (j = 0; j < chars.length; j++) {
					if (chars[j] < chars[i]) {
							temp = chars[i];
							chars[i] = chars[j];
							chars[j] = temp;
					}
			}
	}
	System.out.println("The string in decending order is : ");
	for (int i = 0; i < chars.length; i++) {
		System.out.print(chars[i]);
	}
	}}
	
	

