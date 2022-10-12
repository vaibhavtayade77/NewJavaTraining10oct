package com.vaibhav.Assignment11;

import java.util.Scanner;

public class Employee {
	
//	Given that an EMPLOYEE class contains following members: data members: Employee number,
//	Employee name, Basic, DA, IT, Net Salary and print data members.
//	Write a Java program to read the data of N employee and compute Net salary of each employee
//	(DA=52% of Basic and Income Tax (IT) =30% of the gross salary)

	private int employee_number;
	private String employee_name;
	private double basic;
	private double DA;
	private double IT;
	private double net_salary;
	
	
	public Employee(int employee_number, String employee_name, double basic, double dA, double iT, double net_salary) {
		super();
		this.employee_number = employee_number;
		this.employee_name = employee_name;
		this.basic = basic;
		DA = dA;
		IT = iT;
		this.net_salary = net_salary;
	}
	
	
	public Employee() {
		super();
		
	}
	
	public void display() {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter employee number  ");
		int emp_num=sc.nextInt();
		
		System.out.println("Enter employee name ");
		String emp_name=sc.next();
		
		System.out.println("Enter basic salary ");
		double basic=sc.nextDouble();
		
		
		System.out.println(emp_num);
		System.out.println(emp_name);
		DA=basic*52/100;
		System.out.println("the dearness allowance is "+DA);
		double GS=basic+DA;
		System.out.println("The gross salary is "+GS);
		IT=GS*30/100;
		System.out.println(IT);
		
		net_salary=GS-IT;
		System.out.println("The net salary is "+net_salary);
		
		
		
		
		
		
		
		
		
		
		
	}


	
	
}

