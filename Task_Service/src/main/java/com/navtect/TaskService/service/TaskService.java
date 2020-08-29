package com.navtect.TaskService.service;

import java.util.List;

import com.navtect.TaskService.model.TaskModel;

public interface TaskService {

	TaskModel getTaskByID(String taskId);

	List<TaskModel> getTaskList();

	List<TaskModel> getTaskListByEmployeeId(String empId);

}
