package com.navtech.deshboard.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.navtech.deshboard.model.EmployeeModel;
import com.navtech.deshboard.model.TaskRestModel;
import com.navtech.deshboard.service.proxy.EmployeeProxyService;
import com.navtech.deshboard.service.proxy.TaskProxyService;

@Repository
public class DashboardDAOImpl implements DashboardDAO {

	@Autowired
	private EmployeeProxyService employeeServiceProxy;

	@Autowired
	private TaskProxyService taskServiceProxy;

	@Override
	public List<EmployeeModel> getEmployeeList() {
		return this.employeeServiceProxy.getEmployeeList();
	}

	@Override
	public EmployeeModel getEmployeeDetailByID(String empId) {
		return this.employeeServiceProxy.getEmployeeDetailByID(empId);
	}

	@Override
	public List<TaskRestModel> getTaskList() {
		return this.taskServiceProxy.getTaskList();
	}

	@Override
	public List<TaskRestModel> getTaskListByEmployeeID(String empId) {
		return this.taskServiceProxy.getTaskListByEmployeeID(empId);
	}

}
