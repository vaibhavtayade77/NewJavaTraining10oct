package com.yash.String;

public class StringBAndB {

	public static void main(String[] args) {
		long timeStart = System.currentTimeMillis();
		StringBuffer sb = new StringBuffer("Vaibhav");
		for (int i = 0; i < 10000; i++) {
			sb.append("Tayade");
		}
		System.out.println("Time taken by StringBuffer: " + (System.currentTimeMillis() - timeStart) + "ms");
		timeStart = System.currentTimeMillis();
		StringBuilder sb2 = new StringBuilder("Vaibhav");
		for (int i = 0; i < 10000; i++) {
			sb2.append("Tayade");
		}
		System.out.println("Time taken by StringBuilder: " + (System.currentTimeMillis() - timeStart) + "ms");
	}
}
