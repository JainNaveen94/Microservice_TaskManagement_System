package com.navtect.TaskService.dao;

import java.util.List;

import com.navtect.TaskService.model.TaskModel;

public interface TaskDAO {

	List<TaskModel> getTaskList();

}
