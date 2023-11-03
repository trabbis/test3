package com.httpclient;

public class GraphqlRequestBody {

	private String query;
	private String variables;

	public GraphqlRequestBody() {
		super();
	}

	public GraphqlRequestBody(String query, String variables) {
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

	public String getVariables() {
		return variables;
	}

	public void setVariables(String variables) {
		this.variables = variables;
	}

}
