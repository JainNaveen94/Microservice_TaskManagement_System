package com.navtect.TaskService.model;

public class TaskModel {

	private String taskId;
	private String taskDesc;
	private String taskCategory;
	private String taskSubCategory;
	private String taskStatus;
	private String taskSubmissionDate;
	private String empId;

	/* Default Constructor */
	public TaskModel() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * 
	 * @param taskId
	 * @param taskDesc
	 * @param taskCategory
	 * @param taskSubCategory
	 * @param taskStatus
	 * @param taskSubmissionDate
	 * @param empId
	 */
	public TaskModel(String taskId, String taskDesc, String taskCategory, String taskSubCategory, String taskStatus,
			String taskSubmissionDate, String empId) {
		super();
		this.taskId = taskId;
		this.taskDesc = taskDesc;
		this.taskCategory = taskCategory;
		this.taskSubCategory = taskSubCategory;
		this.taskStatus = taskStatus;
		this.taskSubmissionDate = taskSubmissionDate;
		this.empId = empId;
	}

	/* Getter/Setter */
	
	public String getTaskId() {
		return taskId;
	}

	public void setTaskId(String taskId) {
		this.taskId = taskId;
	}

	public String getTaskDesc() {
		return taskDesc;
	}

	public void setTaskDesc(String taskDesc) {
		this.taskDesc = taskDesc;
	}

	public String getTaskCategory() {
		return taskCategory;
	}

	public void setTaskCategory(String taskCategory) {
		this.taskCategory = taskCategory;
	}

	public String getTaskSubCategory() {
		return taskSubCategory;
	}

	public void setTaskSubCategory(String taskSubCategory) {
		this.taskSubCategory = taskSubCategory;
	}

	public String getTaskStatus() {
		return taskStatus;
	}

	public void setTaskStatus(String taskStatus) {
		this.taskStatus = taskStatus;
	}

	public String getTaskSubmissionDate() {
		return taskSubmissionDate;
	}

	public void setTaskSubmissionDate(String taskSubmissionDate) {
		this.taskSubmissionDate = taskSubmissionDate;
	}

	public String getEmpId() {
		return empId;
	}

	public void setEmpId(String empId) {
		this.empId = empId;
	}

}
