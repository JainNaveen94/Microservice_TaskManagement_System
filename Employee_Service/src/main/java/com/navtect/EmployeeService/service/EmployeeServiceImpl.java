package com.navtect.EmployeeService.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.navtect.EmployeeService.dao.EmployeeDAO;
import com.navtect.EmployeeService.model.EmployeeModel;

@Service
public class EmployeeServiceImpl implements EmployeeService {
	
	@Autowired
	private EmployeeDAO employeeDao;

	@Override
	public EmployeeModel getEmployeeDetail(String empId) {
		List<EmployeeModel> employees = this.employeeDao.getEmployeeList();
		if(employees != null) {
			return this.getEmployeeDetail(employees, empId);
		} else {
			return null;
		}
	}

	@Override
	public List<EmployeeModel> getEmployeeList() {
		return this.employeeDao.getEmployeeList();
	}
	
	/* Private Method */
	
	private EmployeeModel getEmployeeDetail(List<EmployeeModel> employeeList, String empId) {
		for(EmployeeModel employee: employeeList) {
			if(employee.getEmpId().equals(empId)){
				return employee;
			}
		}
		return null;
	}
	
	

}
