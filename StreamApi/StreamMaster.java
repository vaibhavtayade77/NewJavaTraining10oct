package com.yash.StreamApi;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class StreamMaster {
	public static void main(String[] args) {
		Integer arr[]= {1,4,5,55,6,7,8,7,99,88,10};
		List<Integer> mylist=Arrays.asList(arr);
		//mylist.stream().forEach((e)->System.out.print(e+"  "));
		System.out.println(mylist.stream().reduce(0,(a,b)->a+b));
		
		
		
		System.out.println(" ");
		
		//square of each
		//mylist.stream().map((e)->e*e).forEach((e)->System.out.print(e+"  "));
		
		
		//square of even numbers in list
		//mylist.stream().filter((e)->e%2==0).map((e)->e*e).forEach((e)->System.out.print(e+"  "));
		
		
		List<String> name=new ArrayList<String>();
		name.add("Jill");
		name.add("daivi");
		name.add("Jaran");
		name.add("taram");
		name.add("Jack");
		
//		List<String> nameSwithJ=name.stream().filter((n)->n.startsWith("J")).collect(Collectors.toList());
//		nameSwithJ.stream().forEach((n)->System.out.println(n+"  "));
		
//		List<String> sname=name.stream().filter((n)->n.startsWith("J")).map((n)->n.toUpperCase()).sorted().collect(Collectors.toList());
//		sname.stream().forEach((n)->System.out.println(n+"  "));
//		
		
		List<String> snames=name.stream().filter((n)->n.startsWith("J")).map((n)->n.toUpperCase()).sorted().collect(Collectors.toList());
        snames.stream().forEach((n)->System.out.print(n+"   "));
        
        System.out.println(name.stream().reduce("", (a,b)->a+"-"+b));
	
	}

}
