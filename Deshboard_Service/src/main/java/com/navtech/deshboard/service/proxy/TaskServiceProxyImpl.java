package com.navtech.deshboard.service.proxy;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.netflix.ribbon.RibbonClient;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

import com.navtech.deshboard.constant.ErrorConstants;
import com.navtech.deshboard.exception.custom.TaskNotFoundException;
import com.navtech.deshboard.model.TaskRestModel;

@Component
@RibbonClient(name = "TaskService")
public class TaskServiceProxyImpl implements TaskProxyService {

	@Value("${app.taskServiceUrl}")
	private String taskServiceURI;

	@Autowired
	private RestTemplate restTemplate;

	@Override
	public List<TaskRestModel> getTaskList() {
		try {
//			System.out.println("++++++++++>" + taskServiceURI);
			ResponseEntity<List<TaskRestModel>> response = this.restTemplate.exchange(taskServiceURI + "task/list",
					HttpMethod.GET, null, new ParameterizedTypeReference<List<TaskRestModel>>() {
					});
			return response.getBody();

		} catch (Exception exception) {
			throw new TaskNotFoundException(ErrorConstants.TASK_SERVICE_CONNECTION_ISSUE);
		}
	}

	@Override
	public List<TaskRestModel> getTaskListByEmployeeID(String empId) {
		try {
//			System.out.println("++++++++++>" + taskServiceURI);
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
