package com.yash.String;

public class repeatedAlphabet {

//	WAP to print the number of alphabets repeated in the given string.

	public static void main(String[] args) {
		String string1 = "vaibhavtayade";
		int count;

		char string[] = string1.toCharArray();

		System.out.println("Duplicate characters in a given string are : ");

		for (int i = 0; i < string.length; i++) {
			count = 1;
			for (int j = i + 1; j < string.length; j++) {
				if (string[i] == string[j] && string[i] != ' ') {
					count++;

					string[j] = '0';

				}

				// System.out.println(count);
			}
			if (count > 1 && string[i] != '0')

				System.out.println(string[i]+count);

		}
	}
}
