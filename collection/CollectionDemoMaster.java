package com.yash.collection;

import java.util.ArrayList;
import java.util.List;

class Student {
	private int id;
	private String name;
	private int age;

	Student() {
	}

	Student(int id, String name, int age) {
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
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", age=" + age + "]";
	}

	@Override
	public boolean equals(Object t) {
		Student s = (Student) t;
		if (s.id == this.id && s.getName().equals(this.getName()) && s.age == this.age)
			return true;
		else
			return false;

	}

}

class StudentMaster {
	List<Student> arr = new ArrayList<Student>();

	StudentMaster() {
		arr.add(new Student(1, "vaibhav", 25));
		arr.add(new Student(2, "swapnil", 24));

	}

	public boolean doesExists(Student s) {
		boolean exists = false;
		for (Student st : this.arr) {
			if (st.equals(s)) {
				exists = true;
				break;
			}
		}
		return exists;
	}

	public void deleteStudent(Student s) {
		for (int i = 0; i < this.arr.size(); i++) {
			if (arr.get(i).equals(s))
				arr.remove(i);
		}
	}

	public void displayStudents() {
		for (Student s : arr)
			System.out.println(s);
	}

	public void updateStudent(Student s) {
		for (int i = 0; i < this.arr.size(); i++) {
			if (arr.get(i).getId() == s.getId())
				arr.set(i, s);
		}
	}

	public void maxAge(Student s) {
		for (int i = 0; i < this.arr.size(); i++) {

		}
	}

	public class CollectionDemoMaster {
		public void main(String[] args) {
			StudentMaster master = new StudentMaster();
			// master.deleteStudent(new Student(1, "vaibhav", 25));
			master.updateStudent(new Student(1, "amitabh", 45));
			master.displayStudents();
		}

	}

}
