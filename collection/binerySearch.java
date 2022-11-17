package com.yash.collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class binerySearch {

//	//WAP to store all Collection elements in Array and perform the Binary Search
//
	public static void main(String[] args) {
        //by using list
		List<Integer> al = new ArrayList<Integer>();
		al.add(23);
		al.add(34);
		al.add(56);
		al.add(89);
		al.add(25);
		System.out.println(al);
		System.out.println("The index of given number is " + Collections.binarySearch(al, 56));

		
		//by using array
		int arr[] = { 45, 78, 44, 41, 57 };
		int key = 57;
		int result = Arrays.binarySearch(arr, key);
		if (result < 0)
			System.out.println("Element is not found!");
		else
			System.out.println("Element is found at index: " + result);
	}
}
