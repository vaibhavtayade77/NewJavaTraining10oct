package com.yash.ExceptionHandling.ExceptionChaining;

public class exceptionChaining {

	private int id_no;
	private String name;
	private int age;
	private String city;

	
	public exceptionChaining() {
		super();
		// TODO Auto-generated constructor stub
	}

	public exceptionChaining(int id_no, String name, int age, String city) {
		super();
		this.id_no = id_no;
		this.name = name;
		this.age = age;
		this.city = city;
	}

	public int getId_no() {
		return id_no;
	}

	public void setId_no(int id_no) {
		this.id_no = id_no;
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

	public void setAge(int age) throws AgeValidationException {
		if (age < 18)
			throw new AgeValidationException("not eligible for voting , age must be greater than 18 for voting");
		else
			this.age = age;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

//	@Override
//	public int hashCode() {
//		// TODO Auto-generated method stub
//		return super.hashCode();
//	}
//
//	@Override
//	public boolean equals(Object obj) {
//		// TODO Auto-generated method stub
//		return super.equals(obj);
//	}
//
//	@Override
//	public String toString() {
//		// TODO Auto-generated method stub
//		return super.toString();
//	}

	public static void main(String[] args) {
		exceptionChaining ec = new exceptionChaining();
		ec.setId_no(1);
		ec.setName("Amit");
		try {
			ec.setAge(17);
		} catch (AgeValidationException e) {
			System.out.println(e.getMessage());
		}
		ec.setCity("kolhapur");
 
		System.out.println(ec.toString());
		
	}
	

}
