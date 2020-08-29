package com.navtect.TaskService.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.navtect.TaskService.constant.ErrorConstant;
import com.navtect.TaskService.exception.custom.InvalidEmployeeIDException;
import com.navtect.TaskService.exception.custom.InvalidTaskIDException;
import com.navtect.TaskService.exception.custom.NoTaskFoundException;
import com.navtect.TaskService.exception.custom.TaskNotFoundException;
import com.navtect.TaskService.model.TaskModel;
import com.navtect.TaskService.service.TaskService;

@RestController
@RequestMapping("/task")
public class TaskController {

	@Autowired
	private TaskService taskService;

	@GetMapping("/{taskId}")
	public ResponseEntity<TaskModel> getTaskByID(@PathVariable String taskId) {
		if (taskId != null) {
			TaskModel task = this.taskService.getTaskByID(taskId);
			if (task != null) {
				return new ResponseEntity<TaskModel>(task, HttpStatus.OK);
			} else {
				throw new TaskNotFoundException(ErrorConstant.TASK_NOT_FOUND + taskId);
			}
		} else {
			throw new InvalidTaskIDException(taskId + " " + ErrorConstant.INVALID_TASK_ID);
		}

	}

	@GetMapping("/list")
	public ResponseEntity<List<TaskModel>> getTaskList() {

		List<TaskModel> taskList = this.taskService.getTaskList();
		if (taskList != null) {
			return new ResponseEntity<List<TaskModel>>(taskList, HttpStatus.OK);
		} else {
			throw new NoTaskFoundException(ErrorConstant.NO_TASK_FOUND);
		}

	}
	
	@GetMapping("/employee/{empId}")
	public ResponseEntity<List<TaskModel>> getTaskListByEmployeeId(@PathVariable String empId) {
		if(empId != null) {
			List<TaskModel> taskList = this.taskService.getTaskListByEmployeeId(empId);
			if(taskList != null) {
				return new ResponseEntity<List<TaskModel>>(taskList, HttpStatus.OK);
			} else {
				throw new NoTaskFoundException(ErrorConstant.NO_TASK_FOUND);
			}
		} else {
			throw new InvalidEmployeeIDException(empId + " " + ErrorConstant.INVALID_EMPLOYEE_ID);
		}
	}

}
