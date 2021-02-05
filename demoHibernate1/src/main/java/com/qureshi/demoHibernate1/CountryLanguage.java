package com.qureshi.demoHibernate1;

public class CountryLanguage {
	private String CountryCode;
	private String Language;
	
	public String getCountryCode() {
		return CountryCode;
	}
	public void setCountryCode(String countryCode) {
		CountryCode = countryCode;
	}
	public String getLanguage() {
		return Language;
	}
	public void setLanguage(String language) {
		Language = language;
	}
	@Override
	public String toString() {
		return "CountryLanguage [CountryCode=" + CountryCode + ", Language=" + Language + "]";
	}

}
