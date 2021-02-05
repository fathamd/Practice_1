package com.qureshi.demoHibernate1;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class City {
	@Id
	private Integer ID;
	private String Name;
	private String CountryCode;
	private String District;
	private String Population;
	public Integer getID() {
		return ID;
	}
	public void setID(Integer iD) {
		ID = iD;
	}
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public String getCountryCode() {
		return CountryCode;
	}
	public void setCountryCode(String countryCode) {
		CountryCode = countryCode;
	}
	public String getDistrict() {
		return District;
	}
	public void setDistrict(String district) {
		District = district;
	}
	public String getPopulation() {
		return Population;
	}
	public void setPopulation(String population) {
		Population = population;
	}
	@Override
	public String toString() {
		return "City [ID=" + ID + ", Name=" + Name + ", CountryCode=" + CountryCode + ", District=" + District
				+ ", Population=" + Population + "]";
	}

}
