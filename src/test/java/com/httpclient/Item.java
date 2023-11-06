package com.httpclient;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

//@JsonIgnoreProperties(ignoreUnknown = true)
public class Item{
    public List<DepartmentReference> departmentReference;

	public List<DepartmentReference> getDepartmentReference() {
		return departmentReference;
	}
    
    
}