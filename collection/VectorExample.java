package com.yash.collection;

import java.util.Collections;
import java.util.Vector;

public class VectorExample {

	public static void main(String[] args) {
		Vector<String> vec = new Vector<>();
		vec.add("vaibhav");
		vec.add("nitin");
		vec.add("swapnil");
		vec.add("sujit");
		vec.add("amit");
		vec.add("rohan");
		vec.add("amar");
		System.out.println(vec);

		Collections.sort(vec);

		System.out.println(vec);
	}

}
