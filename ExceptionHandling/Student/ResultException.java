package com.yash.ExceptionHandling.Student;

public class ResultException extends Exception {
	
	private String message;

	public ResultException(String message) {
		this.message = message;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}
	
	
	
	

}
