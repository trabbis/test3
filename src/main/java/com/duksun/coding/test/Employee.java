package com.duksun.coding.test;

public class Employee {
	private Integer empId;
	private String firstName;
	
	public Employee(Integer id, String f) {
		this.empId = id;
		this.firstName =f;
	}
	
	
	public Integer getEmpId() {
		return empId;
	}
	public void setEmpId(Integer empId) {
		this.empId = empId;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	
	

}
