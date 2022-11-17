package com.yash.String;

public class GarbageCollector {
	
//	 WAP to demonstrate how garbage collector work 
//	 when any memory is not referenced by string object.
//	
//	initailly when there are certain unclaimed objects identified by jvm , it invokes
//	finalize method which is responsible for collection of those unused objects and informing 
//	to the .gc() of garbage collector. This method then removes all such unused objects
//	which is helpful in memory management.
	
	public void finalize() {
		System.out.println("vaibhav tayade");
	}
	
	public void m1() {
		System.out.println("i am in m1 method");
	}
	
	public static void main(String[] args) {
		GarbageCollector str1=new GarbageCollector();
		str1=null;
		System.gc();
//		finalise method will call just before 
	}

}
