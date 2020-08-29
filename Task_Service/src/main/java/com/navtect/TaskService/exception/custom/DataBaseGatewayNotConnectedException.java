package com.navtect.TaskService.exception.custom;

@SuppressWarnings("serial")
public class DataBaseGatewayNotConnectedException extends RuntimeException {

	public DataBaseGatewayNotConnectedException(String message, Throwable cause) {
		super(message, cause);
		// TODO Auto-generated constructor stub
	}

	public DataBaseGatewayNotConnectedException(String message) {
		super(message);
		// TODO Auto-generated constructor stub
	}

	public DataBaseGatewayNotConnectedException(Throwable cause) {
		super(cause);
		// TODO Auto-generated constructor stub
	}

}
