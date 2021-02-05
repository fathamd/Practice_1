package com.demo2.test2;

import javax.persistence.Embeddable;

@Embeddable
public class Name {
	
	private String Fname;
	private String Lname;
	
	public String getFname() {
		return Fname;
	}
	public void setFname(String fname) {
		Fname = fname;
	}
	public String getLname() {
		return Lname;
	}
	public void setLname(String lname) {
		Lname = lname;
	}
	@Override
	public String toString() {
		return "StudentName [Fname=" + Fname + ", Lname=" + Lname + "]";
	}
}
