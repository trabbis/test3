package com.jackson;

import com.fasterxml.jackson.annotation.JsonRawValue;

public class RawBean {
    public RawBean(String string, String string2) {
		// TODO Auto-generated constructor stub
    	this.name = string;
    	this.json = string2;
	}

	public String name;

    @JsonRawValue
    public String json;

}
