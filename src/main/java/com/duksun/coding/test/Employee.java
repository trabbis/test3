package com.duksun.coding.test;

public class Employee {
	private Integer empId;
	private String firstName;
	private Long salary;
	
	
	public Long getSalary() {
		return salary;
	}

	public void setSalary(Long salary) {
		this.salary = salary;
	}

	public Employee(Integer id, String f) {
		this.empId = id;
		this.firstName =f;
	}
	
	public Employee(Integer id, String f, Long s) {
		this.empId = id;
		this.firstName =f;
		this.salary = s;
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
