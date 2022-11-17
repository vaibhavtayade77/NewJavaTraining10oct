package com.yash.collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ascendingOrder {

	// WAP to sort Collection elements in ascending order

	public static void main(String[] args) {

		List<Integer> al = new ArrayList<Integer>();
		al.add(12);
		al.add(34);
		al.add(78);
		al.add(45);
		al.add(56);

		System.out.println("The given list : " + al);

		Collections.sort(al);

		System.out.println("The given list after sorting : " + al);

	}
}
