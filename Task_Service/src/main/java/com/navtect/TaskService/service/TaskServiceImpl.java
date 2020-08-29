package com.navtect.TaskService.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.navtect.TaskService.dao.TaskDAO;
import com.navtect.TaskService.model.TaskModel;

@Service
public class TaskServiceImpl implements TaskService {

	@Autowired
	private TaskDAO taskDao;

	@Override
	public TaskModel getTaskByID(String taskId) {
		List<TaskModel> taskList = this.taskDao.getTaskList();
		if (taskList != null) {
			return this.getTaskByID(taskList, taskId);
		} else {
			return null;
		}
	}

	@Override
	public List<TaskModel> getTaskList() {
		return this.taskDao.getTaskList();
	}

	@Override
	public List<TaskModel> getTaskListByEmployeeId(String empId) {
		List<TaskModel> taskList = this.taskDao.getTaskList();
		if (taskList != null) {
			return this.getTaskListByEmployeeId(taskList, empId);
		}
		return null;
	}

	/* Private Method */

	/**
	 * 
	 * -> Get a Task From Its ID
	 * 
	 * @param taskList
	 * @param taskId
	 * @return
	 */
	private TaskModel getTaskByID(List<TaskModel> taskList, String taskId) {
		for (TaskModel task : taskList) {
			if (task.getTaskId().equals(taskId)) {
				return task;
			}
		}
		return null;
	}

	/**
	 * 
	 * -> Get the Task List of a Particular Employee Id
	 * 
	 * @param taskList
	 * @param empId
	 * @return
	 */
	private List<TaskModel> getTaskListByEmployeeId(List<TaskModel> taskList, String empId) {
		List<TaskModel> taskListOfEmployee = new ArrayList<TaskModel>();
		for (TaskModel task : taskList) {
			if (task.getEmpId().equals(empId)) {
				taskListOfEmployee.add(task);
			}
		}
		return taskListOfEmployee;
	}

}
