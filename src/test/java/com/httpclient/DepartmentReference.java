package com.httpclient;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class DepartmentReference {
    public String emailAddress;
    public String department;
    
    public String phoneNumber;
    public String city;
    public String postalCode;
    public String province;
    
	public String getEmailAddress() {
		return emailAddress;
	}
	public String getDepartment() {
		return department;
	}
	public String getPhoneNumber() {
		return phoneNumber;
	}
	public String getCity() {
		return city;
	}
	public String getPostalCode() {
		return postalCode;
	}
	public String getProvince() {
		return province;
	}
    
    
    
    
    
}