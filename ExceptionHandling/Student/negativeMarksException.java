package com.yash.ExceptionHandling.Student;

public class negativeMarksException extends ResultException {
	private String message;

	public negativeMarksException(String message) {
		super(message);
		this.message = message;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

}
