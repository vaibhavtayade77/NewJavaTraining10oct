package com.vaibhav.Assignment11;

public class Patient {
	protected String patientName;
	protected Double height;
	protected Double weight;
	public Patient(String patientName, Double height,Double weight) {
		super();
		this.patientName = patientName;
		this.height = height;
		this.weight = weight;
	}
	public Patient() {
		super();
		// TODO Auto-generated constructor stub
	}
	public String getPatientName() {
		return patientName;
	}
	public void setPatientName(String patientName) {
		this.patientName = patientName;
	}
	public Double getHeight() {
		return height;
	}
	public void setHeight(Double height) {
		this.height = height;
	}
	public Double getWeight() {
		return weight;
	}
	public void setWeight(Double weight) {
		this.weight = weight;
	}
	@Override
	public String toString() {
		return "Patient [patientName=" + patientName + ", height=" + height + ", weight=" + weight + "]";
	}
	
	public double computeBMI(){
		return weight/(height*height);
	}

}
