package com.navtech.deshboard.service.proxy;

import java.util.List;

import com.navtech.deshboard.model.TaskRestModel;

public interface TaskProxyService {

	List<TaskRestModel> getTaskList();

	List<TaskRestModel> getTaskListByEmployeeID(String empId);

}
