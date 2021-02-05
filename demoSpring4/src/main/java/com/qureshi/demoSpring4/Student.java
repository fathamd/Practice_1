package com.qureshi.demoSpring4;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Student {
	
	private String name;
	private String rollNum;
	private String branch;
	@Autowired
	private Hostel hostel;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getRollNum() {
		return rollNum;
	}
	public void setRollNum(String rollNum) {
		this.rollNum = rollNum;
	}
	public String getBranch() {
		return branch;
	}
	public void setBranch(String branch) {
		this.branch = branch;
	}
	public Hostel getHostel() {
		return hostel;
	}
	public void setHostel(Hostel hostel) {
		this.hostel = hostel;
	}
	@Override
	public String toString() {
		return "Student [name=" + name + ", rollNum=" + rollNum + ", branch=" + branch + ", hostel=" + hostel + "]";
	}


}
