package com.navtech.deshboard.model;

import java.util.List;

public class EmployeeTaskModel {

	private EmployeeModel employeeDetail;
	private List<TaskModel> taskList;

	/* Default Constructor */
	public EmployeeTaskModel() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * 
	 * => Parameterized Constructor
	 * 
	 * @param employeeDetail
	 * @param taskList
	 */
	public EmployeeTaskModel(EmployeeModel employeeDetail, List<TaskModel> taskList) {
		super();
		this.employeeDetail = employeeDetail;
		this.taskList = taskList;
	}

	/* Getter/Setter */

	public EmployeeModel getEmployeeDetail() {
		return employeeDetail;
	}

	public void setEmployeeDetail(EmployeeModel employeeDetail) {
		this.employeeDetail = employeeDetail;
	}

	public List<TaskModel> getTaskList() {
		return taskList;
	}

	public void setTaskList(List<TaskModel> taskList) {
		this.taskList = taskList;
	}

}
