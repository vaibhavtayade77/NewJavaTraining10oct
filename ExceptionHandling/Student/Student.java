package com.yash.ExceptionHandling.Student;

import java.util.Objects;



public class Student {

	private int rollno;
	private String sname;
	private String saddress;

	StudentResult srobj;

	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Student(int rollno, String sname, String saddress, StudentResult srobj) {
		super();
		this.rollno = rollno;
		this.sname = sname;
		this.saddress = saddress;
		this.srobj = srobj;
	}

	public int getRollno() {
		return rollno;
	}

	public void setRollno(int rollno) {
		this.rollno = rollno;
	}

	public String getSname() {
		return sname;
	}

	public void setSname(String sname) {
		this.sname = sname;
	}

	public String getSaddress() {
		return saddress;
	}

	public void setSaddress(String saddress) {
		this.saddress = saddress;
	}

	public StudentResult getSrobj() {
		return srobj;
	}

	public void setSrobj(StudentResult srobj) {

		this.srobj = srobj;
	}

	@Override
	public String toString() {
		return "Student [rollno=" + rollno + ", sname=" + sname + ", saddress=" + saddress + ", srobj=" + srobj + "]";
	}

	public static void main(String[] args) {
		StudentResult sr = new StudentResult();
		try {
			sr.setMath(80);
		} catch (negativeMarksException e) {
			System.out.println(e.getMessage());
		} catch (ResultException e1) {
			System.out.println(e1.getMessage());
		}
		try {
			sr.setSci(90);
		} catch (negativeMarksException e1) {
			System.out.println(e1.getMessage());
		} catch (ResultException e) {
			System.out.println(e.getMessage());
		}
		try {
			sr.setIt(70);
		
		} catch (negativeMarksException e) {
			System.out.println(e.getMessage());
		} catch (ResultException e1) {
			System.out.println(e1.getMessage());
		}
		try {
			sr.setTom(60);
		} catch (negativeMarksException e1) {
			System.out.println(e1.getMessage());
		} catch (ResultException e) {
			System.out.println(e.getMessage());
		}
		try {
			sr.setMp(-30);
		} catch (negativeMarksException e1) {
			System.out.println(e1.getMessage());
		} catch (ResultException e) {
			System.out.println(e.getMessage());
		}

		try {
			System.out.println(StudentResult.totalMarks());
		} catch (failException e) {
			System.out.println(e.getMessage());
		}
		System.out.println(sr);
	}

}
