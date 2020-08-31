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
import com.navtech.deshboard.exception.custom.EmployeeNotFoundException;
import com.navtech.deshboard.model.EmployeeModel;

@Component
@RibbonClient(name = "EmployeeService")
public class EmployeeProxyServiceImpl implements EmployeeProxyService {

	@Value("${app.employeeServiceUrl}")
	private String employeeServiceURI;

	@Autowired
	private RestTemplate restTemplate;

	@Override
	public List<EmployeeModel> getEmployeeList() {
		try {
//			System.out.println("++++++++++>" + employeeServiceURI);
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
//			System.out.println("++++++++++>" + employeeServiceURI);
			ResponseEntity<EmployeeModel> response = this.restTemplate.exchange(
					employeeServiceURI + "employee/" + empId, HttpMethod.GET, null,
					new ParameterizedTypeReference<EmployeeModel>() {
					});
			return response.getBody();

		} catch (Exception exception) {
			throw new EmployeeNotFoundException(ErrorConstants.EMPLOYEE_SERVICE_CONNECTION_ISSUE);
		}
	}

}
