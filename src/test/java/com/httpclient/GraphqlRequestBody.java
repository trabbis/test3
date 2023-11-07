package com.httpclient;

public class GraphqlRequestBody {

	private String query;
	private Object variables;

	public GraphqlRequestBody() {
		super();
	}

	public GraphqlRequestBody(String query, Object variables) {
		super();
		this.query = query;
		this.variables = variables;
	}

	public String getQuery() {
		return query;
	}

	public void setQuery(String query) {
		this.query = query;
	}

	public Object getVariables() {
		return variables;
	}

	public void setVariables(Object variables) {
		this.variables = variables;
	}
	
	@Override
	public String toString() {
		
		String str = "{ \"query\" : \"" + query + "\", \"variables\" : " + variables + "}";
		str = str.replaceAll("\\r\\n|\\r|\\n|\\t", " ");
		return str;
	}

	

}
