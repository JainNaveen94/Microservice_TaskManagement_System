package com.navtech.deshboard.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.navtech.deshboard.constant.ErrorConstants;
import com.navtech.deshboard.dao.DashboardDAO;
import com.navtech.deshboard.dto.DashboardDTO;
import com.navtech.deshboard.exception.custom.EmployeeNotFoundException;
import com.navtech.deshboard.exception.custom.TaskNotFoundException;
import com.navtech.deshboard.model.EmployeeModel;
import com.navtech.deshboard.model.EmployeeTaskModel;
import com.navtech.deshboard.model.TaskRestModel;

@Service
public class DashboardServiceImpl implements DashboardService {

	@Autowired
	private DashboardDAO dashboardDao;

	@Autowired
	private DashboardDTO dashboardDto;

	@Override
	public EmployeeTaskModel getTaskListByEmployeeID(String empId) {
		EmployeeModel employeeDetail = this.dashboardDao.getEmployeeDetailByID(empId);
		if (employeeDetail != null) {
			List<TaskRestModel> taskListOfEmployee = this.dashboardDao.getTaskListByEmployeeID(empId);
			if (taskListOfEmployee != null) {
				return this.dashboardDto.getTaskListByEmployeeID(employeeDetail, taskListOfEmployee);
			} else {
				throw new TaskNotFoundException(ErrorConstants.TASK_NOT_FOUND + empId);
			}
		} else {
			throw new EmployeeNotFoundException(ErrorConstants.EMPLOYEE_NOT_FOUND + empId);
		}
	}

	@Override
	public List<EmployeeTaskModel> getEmployeeWiseTaskList() {
		List<EmployeeModel> employeeList = this.dashboardDao.getEmployeeList();
		if (employeeList != null) {
			List<TaskRestModel> taskList = this.dashboardDao.getTaskList();
			if (taskList != null) {
				return this.getEmployeeWiseTaskList(employeeList, taskList);
			} else {
				throw new TaskNotFoundException(ErrorConstants.NO_TASK_FOUND);
			}
		} else {
			throw new EmployeeNotFoundException(ErrorConstants.NO_EMPLOYEE_FOUND);
		}
	}

	/* Private Methods */
	
	// Generate the Employee Wise Task List with Employee Details
	private List<EmployeeTaskModel> getEmployeeWiseTaskList(List<EmployeeModel> employeeList,
			List<TaskRestModel> taskList) {
		List<EmployeeTaskModel> employeeWiseTaskList = new ArrayList<EmployeeTaskModel>();
		for (EmployeeModel employee : employeeList) {
			employeeWiseTaskList.add(this.dashboardDto.getTaskListByEmployeeID(employee,
					this.getTaskListOfEmployee(employee.getEmpId(), taskList)));
		}
		return employeeWiseTaskList;
	}

	// Get the List Of Task for Specific Employee by its ID
	private List<TaskRestModel> getTaskListOfEmployee(String empId, List<TaskRestModel> taskList) {
		List<TaskRestModel> taskRestModelList = new ArrayList<TaskRestModel>();
		for (TaskRestModel task : taskList) {
			if (task.getEmpId().equals(empId)) {
				taskRestModelList.add(task);
			}
		}
		return taskRestModelList;
	}

}
