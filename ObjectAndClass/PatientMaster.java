package com.yash.ObjectAndClass;

public class PatientMaster {
	public static void main(String[] args) {
		
		Patient p=new Patient("Vaibhav Tayade", 1.7, 80.0);
		System.out.println("BMI of me is "+p.computeBMI());
	}
	
}
