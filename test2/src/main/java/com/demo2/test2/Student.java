package com.demo2.test2;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
public class Student {
	
	@Id
	private String rollNum;
	private Name sName;
	private String batchNumber;
	
	public Name getsName() {
		return sName;
	}
	public void setsName(Name sName) {
		this.sName = sName;
	}
	public String getRollNum() {
		return rollNum;
	}
	public void setRollNum(String rollNum) {
		this.rollNum = rollNum;
	}
	public String getBatchNumber() {
		return batchNumber;
	}
	public void setBatchNumber(String batchNumber) {
		this.batchNumber = batchNumber;
	}
	@Override
	public String toString() {
		return "Student [sName=" + sName + ", rollNum=" + rollNum + ", batchNumber=" + batchNumber + "]";
	}

}
