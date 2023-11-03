package com.httpclient;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class DealersGraphQLResponse{
    public Data data;

	public Data getData() {
		return data;
	}
    
    
}

