package com.qureshi.demoSpring2;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Employee implements Details {
	
	private String eId;
	private String eName;
	private String eAddress;
	@Autowired
	private Book book;
	
	public Book getBook() {
		return book;
	}
	public void setBook(Book book) {
		this.book = book;
	}
	public String geteId() {
		return eId;
	}
	public void seteId(String eId) {
		this.eId = eId;
	}
	public String geteName() {
		return eName;
	}
	public void seteName(String eName) {
		this.eName = eName;
	}
	public String geteAddress() {
		return eAddress;
	}
	public void seteAddress(String eAddress) {
		this.eAddress = eAddress;
	}
	public String getDetails() {
		return  eId + "," + eName + "," + eAddress;
		}
	@Override
	public String toString() {
		return "Employee [eId=" + eId + ", eName=" + eName + ", eAddress=" + eAddress + ", book=" + "" + "]";
	}

}
