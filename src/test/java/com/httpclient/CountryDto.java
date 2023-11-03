package com.httpclient;

public class CountryDto {
	  private CountryData data;

	  public class CountryData {

	    private Country country;

	    public class Country {

	      private String name;
	      private String capital;
	      private String currency;
	      
	  	public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public String getCapital() {
			return capital;
		}
		public void setCapital(String capital) {
			this.capital = capital;
		}
		public String getCurrency() {
			return currency;
		}
		public void setCurrency(String currency) {
			this.currency = currency;
		}
	      
	      
	    }

	    
	  }
	  
}
