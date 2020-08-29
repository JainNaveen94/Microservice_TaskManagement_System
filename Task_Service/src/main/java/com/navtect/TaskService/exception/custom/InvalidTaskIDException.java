package com.navtect.TaskService.exception.custom;

@SuppressWarnings("serial")
public class InvalidTaskIDException extends RuntimeException {

	public InvalidTaskIDException(String message, Throwable cause) {
		super(message, cause);
		// TODO Auto-generated constructor stub
	}

	public InvalidTaskIDException(String message) {
		super(message);
		// TODO Auto-generated constructor stub
	}

	public InvalidTaskIDException(Throwable cause) {
		super(cause);
		// TODO Auto-generated constructor stub
	}

}
