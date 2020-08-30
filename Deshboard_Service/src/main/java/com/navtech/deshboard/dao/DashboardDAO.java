package com.navtech.deshboard.dao;

import java.util.List;

import com.navtech.deshboard.model.EmployeeModel;
import com.navtech.deshboard.model.TaskRestModel;


public interface DashboardDAO {
	
	List<EmployeeModel> getEmployeeList();
	EmployeeModel getEmployeeDetailByID(String empId);
	List<TaskRestModel> getTaskList();
	List<TaskRestModel> getTaskListByEmployeeID(String empId);
	

}
