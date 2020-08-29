package com.navtect.EmployeeService.model;

public class ErrorModel {
	
	private int status;
	private String message;
	private long timeStamp;
	
	/**
	 * 
	 */
	public ErrorModel() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * 
	 * @param status
	 * @param message
	 * @param timeStamp
	 */
	public ErrorModel(int status, String message, long timeStamp) {
		super();
		this.status = status;
		this.message = message;
		this.timeStamp = timeStamp;
	}
	
	
	/** Getter/Setter **/
	
	public int getStatus() {
		return status;
	}

	public void setStatus(int status) {
		this.status = status;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public long getTimeStamp() {
		return timeStamp;
	}

	public void setTimeStamp(long timeStamp) {
		this.timeStamp = timeStamp;
	}
	
}
