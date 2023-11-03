package com.httpclient;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class DcDealerList{
    public List<Item> items;

	public List<Item> getItems() {
		return items;
	}
    
    
}





