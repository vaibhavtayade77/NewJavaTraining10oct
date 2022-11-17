package com.yash.String;

public class HeapNAdString {
//	 WAP to demonstrate how memory is allocated to string objects in memory heap and 
//	string constant pool.
	public static void main(String[] args) {
	

	
	String s1="vaibhav";
	String s2="vaibhav";
	System.out.println(s1+" "+s2+" : this stored in string constant pool.");
	
//	when we declared same string in two variables then it stored in string constant 
//	pool in same content
//	s1---------vaibhav
//	s2----------^
	
	
	String s3=new String("vaibhav");
	String s4=new String("vaibhav");
//	when we create object of string with new keyword and stored string in it ,
//	then it stored in 
//	heap memory , when the string object are same then also it stored in differently.
//	s3-------------vaibhav
//	s4-------------vaibhav   in heap memory 
	System.out.println(s3);
	System.out.println(s4);
	
	
//	if we want to create string object and and stored in constant pool here we have
//	to use intern() method.
	
	String s5=new String("vaibhav").intern();
	System.out.println(s5);
	//s5.intern(); //due to this this will store in constant pool.
	
	
	
}
	
}

