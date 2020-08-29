package com.navtect.EmployeeService.dao;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.navtect.EmployeeService.constants.ErrorMessageConstant;
import com.navtect.EmployeeService.exception.custom.DatabaseGatewayNotFoundConnectionException;
import com.navtect.EmployeeService.model.EmployeeModel;

@Repository
public class EmployeeDAOImpl implements EmployeeDAO {

	@Override
	public List<EmployeeModel> getEmployeeList() {
		ObjectMapper mapper = new ObjectMapper();
		TypeReference<List<EmployeeModel>> typeReference = new TypeReference<List<EmployeeModel>>() {};
		InputStream input = TypeReference.class.getResourceAsStream("/json/employee.json");
		try {
			return mapper.readValue(input, typeReference);
		} catch (IOException exception) {
			throw new DatabaseGatewayNotFoundConnectionException(ErrorMessageConstant.DATABASE_CONNECTION_EXCEPTION);
		}
	}

}
