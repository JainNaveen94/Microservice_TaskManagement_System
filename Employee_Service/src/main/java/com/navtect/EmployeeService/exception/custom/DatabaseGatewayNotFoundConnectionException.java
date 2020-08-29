package com.navtect.EmployeeService.exception.custom;

@SuppressWarnings("serial")
public class DatabaseGatewayNotFoundConnectionException extends RuntimeException {

	public DatabaseGatewayNotFoundConnectionException(String message, Throwable cause) {
		super(message, cause);
		// TODO Auto-generated constructor stub
	}

	public DatabaseGatewayNotFoundConnectionException(String message) {
		super(message);
		// TODO Auto-generated constructor stub
	}

	public DatabaseGatewayNotFoundConnectionException(Throwable cause) {
		super(cause);
		// TODO Auto-generated constructor stub
	}

}
