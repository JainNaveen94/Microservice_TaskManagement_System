package com.navtect.EmployeeService.model;

public class EmployeeModel {
	
	private String empId;
	private String empName;
	private String empMobile;
	private String empAddress;
	
	
	/**
	 * 
	 */
	public EmployeeModel() {
		// TODO Auto-generated constructor stub
	}
	
	/**
	 * 
	 * @param empId
	 * @param empName
	 * @param empMobile
	 * @param empAddress
	 */
	public EmployeeModel(String empId, String empName, String empMobile, String empAddress) {
		super();
		this.empId = empId;
		this.empName = empName;
		this.empMobile = empMobile;
		this.empAddress = empAddress;
	}

	/** Getter/Setter **/
	public String getEmpId() {
		return empId;
	}

	public void setEmpId(String empId) {
		this.empId = empId;
	}

	public String getEmpName() {
		return empName;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}

	public String getEmpMobile() {
		return empMobile;
	}

	public void setEmpMobile(String empMobile) {
		this.empMobile = empMobile;
	}

	public String getEmpAddress() {
		return empAddress;
	}

	public void setEmpAddress(String empAddress) {
		this.empAddress = empAddress;
	}

}
