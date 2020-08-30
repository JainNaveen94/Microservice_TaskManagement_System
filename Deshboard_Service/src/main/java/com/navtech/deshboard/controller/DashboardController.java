package com.navtech.deshboard.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.navtech.deshboard.constant.ErrorConstants;
import com.navtech.deshboard.exception.custom.DatabaseGatewayNotFoundConnectionException;
import com.navtech.deshboard.exception.custom.InvalidEmployeeIDException;
import com.navtech.deshboard.model.EmployeeTaskModel;
import com.navtech.deshboard.service.DashboardService;

@RestController
@RequestMapping("/dashboard/")
public class DashboardController {
	
	@Autowired
	private DashboardService dashboardService;
	
	@GetMapping("/employee/task_list/{empId}")
	public ResponseEntity<EmployeeTaskModel> getTaskListByEmployeeID(@PathVariable String empId) {
		if(empId != null) {
			EmployeeTaskModel employeeTaskInfo = this.dashboardService.getTaskListByEmployeeID(empId);
			if(employeeTaskInfo != null) {
				return new ResponseEntity<EmployeeTaskModel>(employeeTaskInfo, HttpStatus.OK);
			} else {
				throw new DatabaseGatewayNotFoundConnectionException(ErrorConstants.SERVICE_CONNECTION_ISSUE);
			}
		} else {
			throw new InvalidEmployeeIDException(ErrorConstants.EMPLOYEE_NOT_FOUND + empId);
		}
	}
	
	@GetMapping("/employee/task_list")
	public ResponseEntity<List<EmployeeTaskModel>> getEmployeeWiseTaskList() {
		List<EmployeeTaskModel> employeeTaskModelList = this.dashboardService.getEmployeeWiseTaskList();
		if(employeeTaskModelList != null) {
			return new ResponseEntity<List<EmployeeTaskModel>>(employeeTaskModelList, HttpStatus.OK);
		} else {
			throw new DatabaseGatewayNotFoundConnectionException(ErrorConstants.SERVICE_CONNECTION_ISSUE);
		}
	}

}
