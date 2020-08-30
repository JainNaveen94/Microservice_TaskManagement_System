package com.navtech.deshboard.dto;

import java.util.List;

import com.navtech.deshboard.model.EmployeeModel;
import com.navtech.deshboard.model.EmployeeTaskModel;
import com.navtech.deshboard.model.TaskRestModel;

public interface DashboardDTO {

	EmployeeTaskModel getTaskListByEmployeeID(EmployeeModel employeeDetail, List<TaskRestModel> taskListOfEmployee);

}
