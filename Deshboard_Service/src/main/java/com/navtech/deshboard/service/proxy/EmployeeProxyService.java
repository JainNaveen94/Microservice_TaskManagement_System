package com.navtech.deshboard.service.proxy;

import java.util.List;

import com.navtech.deshboard.model.EmployeeModel;

public interface EmployeeProxyService {

	List<EmployeeModel> getEmployeeList();

	EmployeeModel getEmployeeDetailByID(String empId);

}
