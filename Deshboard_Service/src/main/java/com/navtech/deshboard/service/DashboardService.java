package com.navtech.deshboard.service;

import java.util.List;

import com.navtech.deshboard.model.EmployeeTaskModel;

public interface DashboardService {

	EmployeeTaskModel getTaskListByEmployeeID(String empId);

	List<EmployeeTaskModel> getEmployeeWiseTaskList();

}
