package com.navtech.deshboard.exception.custom;

@SuppressWarnings("serial")
public class TaskNotFoundException extends RuntimeException {

	public TaskNotFoundException(String message, Throwable cause) {
		super(message, cause);
		// TODO Auto-generated constructor stub
	}

	public TaskNotFoundException(String message) {
		super(message);
		// TODO Auto-generated constructor stub
	}

	public TaskNotFoundException(Throwable cause) {
		super(cause);
		// TODO Auto-generated constructor stub
	}

}
