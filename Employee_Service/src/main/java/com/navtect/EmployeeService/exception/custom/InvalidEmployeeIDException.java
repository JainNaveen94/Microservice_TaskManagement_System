package com.navtect.EmployeeService.exception.custom;


@SuppressWarnings("serial")
public class InvalidEmployeeIDException extends RuntimeException {

	public InvalidEmployeeIDException(String message, Throwable cause) {
		super(message, cause);
		// TODO Auto-generated constructor stub
	}

	public InvalidEmployeeIDException(String message) {
		super(message);
		// TODO Auto-generated constructor stub
	}

	public InvalidEmployeeIDException(Throwable cause) {
		super(cause);
		// TODO Auto-generated constructor stub
	}
	
	

}
