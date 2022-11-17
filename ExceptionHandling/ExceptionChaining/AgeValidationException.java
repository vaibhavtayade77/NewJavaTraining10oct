package com.yash.ExceptionHandling.ExceptionChaining;

public class AgeValidationException extends Exception {

	private String message;

	public AgeValidationException(String message) {
		super();
		this.message = message;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

}
