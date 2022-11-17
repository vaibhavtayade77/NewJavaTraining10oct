package com.yash.collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class Employee implements Comparable<Employee> {
	int id;
	String name;
	int age;

	public Employee() {
	}

	public Employee(int id, String name, int age) {
		super();
		this.id = id;
		this.name = name;
		this.age = age;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	@Override
	public int compareTo(Employee o) {
		if(this.getAge()==o.getAge())
			return this.getName().compareTo(getName());
		else if (this.getAge() > o.getAge())
			return 1;
		else
			return -1;
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", age=" + age + "]";
	}

}

public class EmployeeCompareMaster {
	public static void main(String[] args) {
		List<Employee> employees = new ArrayList<Employee>();
		employees.add(new Employee(2, "jatin", 20));
		employees.add(new Employee(1, "vishal", 20));
		employees.add(new Employee(3, "neha", 21));

		Collections.sort(employees);
		for(Employee e:employees)
			System.out.println(e);
		
		System.out.println(employees.get(employees.size()-2).getName()+" age is second maximum in data.");
		
	}
}
