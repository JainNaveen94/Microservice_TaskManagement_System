package com.navtech.deshboard.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Repository;
import org.springframework.web.client.RestTemplate;

import com.navtech.deshboard.constant.ErrorConstants;
import com.navtech.deshboard.exception.custom.EmployeeNotFoundException;
import com.navtech.deshboard.exception.custom.TaskNotFoundException;
import com.navtech.deshboard.model.EmployeeModel;
import com.navtech.deshboard.model.TaskRestModel;

@Repository
public class DashboardDAOImpl implements DashboardDAO {

	@Value("${app.employeeServiceUrl}")
	private String employeeServiceURI;

	@Value("${app.taskServiceUrl}")
	private String taskServiceURI;

	@Autowired
	private RestTemplate restTemplate;

	@Override
	public List<EmployeeModel> getEmployeeList() {
		try {
			ResponseEntity<List<EmployeeModel>> response = this.restTemplate.exchange(
					employeeServiceURI + "employee/list", HttpMethod.GET, null,
					new ParameterizedTypeReference<List<EmployeeModel>>() {
					});
			return response.getBody();

		} catch (Exception exception) {
			throw new EmployeeNotFoundException(ErrorConstants.EMPLOYEE_SERVICE_CONNECTION_ISSUE);
		}
	}

	@Override
	public EmployeeModel getEmployeeDetailByID(String empId) {
		try {
			ResponseEntity<EmployeeModel> response = this.restTemplate.exchange(
					employeeServiceURI + "employee/" + empId, HttpMethod.GET, null,
					new ParameterizedTypeReference<EmployeeModel>() {
					});
			return response.getBody();

		} catch (Exception exception) {
			throw new EmployeeNotFoundException(ErrorConstants.EMPLOYEE_SERVICE_CONNECTION_ISSUE);
		}
	}

	@Override
	public List<TaskRestModel> getTaskList() {
		try {
			ResponseEntity<List<TaskRestModel>> response = this.restTemplate.exchange(
					taskServiceURI + "task/list", HttpMethod.GET, null,
					new ParameterizedTypeReference<List<TaskRestModel>>() {
					});
			return response.getBody();

		} catch (Exception exception) {
			throw new TaskNotFoundException(ErrorConstants.TASK_SERVICE_CONNECTION_ISSUE);
		}
	}

	@Override
	public List<TaskRestModel> getTaskListByEmployeeID(String empId) {
		try {
			ResponseEntity<List<TaskRestModel>> response = this.restTemplate.exchange(
					taskServiceURI + "task/employee/" + empId, HttpMethod.GET, null,
					new ParameterizedTypeReference<List<TaskRestModel>>() {
					});
			return response.getBody();

		} catch (Exception exception) {
			throw new TaskNotFoundException(ErrorConstants.TASK_SERVICE_CONNECTION_ISSUE);
		}
	}

}
