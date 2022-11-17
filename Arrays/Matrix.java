package com.yash.Arrays;

import java.util.Scanner;

public class Matrix {

	public static void main(String[] args) {
		int m, i, j, temp;

		Scanner sc = new Scanner(System.in);
		System.out.println("enter the number of rows : ");
		m = sc.nextInt();

		System.out.println("enter the number of columns :");
		m = sc.nextInt();

		int a[][] = new int[m][m];

		if (m == m) {
			System.out.println("enter all the values of matrix ");

			for (i = 0; i < m; i++) {
				for (j = 0; j < m; j++) {
					a[i][j] = sc.nextInt();
				}
			}

			System.out.println("original matrix ");

			for (i = 0; i < m; i++) {
				for (j = 0; j < m; j++) {
					System.out.print(a[i][j] + " ");
				}
				System.out.println(" ");
			}
			System.out.println("matrix after change");

			for (i = 0; i < m; i++) {
				for (j = 0; j < m; j++) {
					if ((i != 0 && j != 0) && (i != m - 1 && j != m - 1)) {
						System.out.print("  ");
						continue;
					}
					System.out.print(a[i][j] + " ");
				}
				System.out.println();
			}
		} else {
			System.out.println("Rows not equal to columns");
		}
	}

}
