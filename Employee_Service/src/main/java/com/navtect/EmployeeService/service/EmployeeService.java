package com.navtect.EmployeeService.service;

import java.util.List;

import com.navtect.EmployeeService.model.EmployeeModel;

public interface EmployeeService {

	EmployeeModel getEmployeeDetail(String empId);

	List<EmployeeModel> getEmployeeList();

}
