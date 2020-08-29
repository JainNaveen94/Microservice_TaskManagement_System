package com.navtect.TaskService.exception.custom;

@SuppressWarnings("serial")
public class NoTaskFoundException extends RuntimeException {

	public NoTaskFoundException(String message, Throwable cause) {
		super(message, cause);
		// TODO Auto-generated constructor stub
	}

	public NoTaskFoundException(String message) {
		super(message);
		// TODO Auto-generated constructor stub
	}

	public NoTaskFoundException(Throwable cause) {
		super(cause);
		// TODO Auto-generated constructor stub
	}

}
