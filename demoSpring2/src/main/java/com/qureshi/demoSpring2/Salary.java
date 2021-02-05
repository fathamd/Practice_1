package com.qureshi.demoSpring2;

import org.springframework.stereotype.Component;

@Component
public class Salary implements Details {
	
	private double basicSal;
	private int tds;
	
	public double getBasicSal() {
		return basicSal;
	}
	public void setBasicSal(double d) {
		this.basicSal = d;
	}
	public int getTds() {
		return tds;
	}
	public void setTds(int tds) {
		this.tds = tds;
	}
	public String getDetails() {
		return  basicSal + "+" + tds;
	}
	@Override
	public String toString() {
		return "Salary [basicSal=" + basicSal + ", tds=" + tds + "]";
	}

}
