package com.navtect.TaskService.model;

public class ErrorModel {

	private int status;
	private String message;
	private long timestamp;

	/* Default Constructor */
	public ErrorModel() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * 
	 * @param status
	 * @param message
	 * @param timestamp
	 */
	public ErrorModel(int status, String message, long timestamp) {
		super();
		this.status = status;
		this.message = message;
		this.timestamp = timestamp;
	}

	/* Getter/Setter */

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

	public long getTimestamp() {
		return timestamp;
	}

	public void setTimestamp(long timestamp) {
		this.timestamp = timestamp;
	}

}
