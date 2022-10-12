package com.vaibhav.Assignment11;

public class Height {
	
//	Create a class height feet and inches as instance variables add methods to display the hright in inches and add two heights

	//private int height;
	private int feet;
	private int inches;
	
	
	public Height(int feet, int inches) {
		super();
		this.feet = feet;
		this.inches = inches;
	}
	public Height() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public int disHeightInInches() {
		return feet*12;
	}
	
}
