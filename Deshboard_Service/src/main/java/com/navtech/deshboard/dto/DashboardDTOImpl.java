package com.navtech.deshboard.dto;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;

import com.navtech.deshboard.model.EmployeeModel;
import com.navtech.deshboard.model.EmployeeTaskModel;
import com.navtech.deshboard.model.TaskModel;
import com.navtech.deshboard.model.TaskRestModel;

@Controller
public class DashboardDTOImpl implements DashboardDTO {

	/* Private Methods */
	
	// Convert the TaskRestModel to TaskModel
	private TaskModel convertTaskRestModelTOTaskModel(TaskRestModel taskRestModel) {
		if (taskRestModel != null) {
			return new TaskModel(taskRestModel.getTaskId(), taskRestModel.getTaskDesc(),
					taskRestModel.getTaskCategory(), taskRestModel.getTaskSubCategory(), taskRestModel.getTaskStatus(),
					taskRestModel.getTaskSubmissionDate());
		} else {
			return new TaskModel();
		}
	}

	// Convert the List of TaskRestModel to List of TaskModel
	private List<TaskModel> convertTaskRestModelListTOTaskModelList(List<TaskRestModel> taskRestModelList) {
		List<TaskModel> taskModelList = new ArrayList<TaskModel>();
		for (TaskRestModel taskRestModel : taskRestModelList) {
			taskModelList.add(this.convertTaskRestModelTOTaskModel(taskRestModel));
		}
		return taskModelList;
	}

	@Override
	public EmployeeTaskModel getTaskListByEmployeeID(EmployeeModel employeeDetail,
			List<TaskRestModel> taskListOfEmployee) {
		return new EmployeeTaskModel(employeeDetail, this.convertTaskRestModelListTOTaskModelList(taskListOfEmployee));
	}
}
