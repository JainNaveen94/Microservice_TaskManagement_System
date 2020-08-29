package com.navtect.TaskService.dao;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.navtect.TaskService.constant.ErrorConstant;
import com.navtect.TaskService.exception.custom.DataBaseGatewayNotConnectedException;
import com.navtect.TaskService.model.TaskModel;

@Repository
public class TaskDAOImpl implements TaskDAO {

	@Override
	public List<TaskModel> getTaskList() {
		ObjectMapper mapper = new ObjectMapper();
		TypeReference<List<TaskModel>> typeReference = new TypeReference<List<TaskModel>>() {
		};
		InputStream input = TypeReference.class.getResourceAsStream("/json/task.json");

		try {
			return mapper.readValue(input, typeReference);
		} catch (IOException exception) {
			throw new DataBaseGatewayNotConnectedException(ErrorConstant.DATABASE_GATEWAY_CONNECTION_REFUSE);
		}
	}

}
