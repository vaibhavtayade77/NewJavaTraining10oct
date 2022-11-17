package com.yash.ExceptionHandling.Student;

public class failException extends Exception {
	private String message;

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public failException(String message) {
		super();
		this.message = message;
	}

}
