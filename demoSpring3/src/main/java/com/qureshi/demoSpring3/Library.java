package com.qureshi.demoSpring3;

public class Library {
	
	private String rollNum;
	private String Book;
	
	public String getRollNum() {
		return rollNum;
	}
	public void setRollNum(String rollNum) {
		this.rollNum = rollNum;
	}
	public String getBook() {
		return Book;
	}
	public void setBook(String book) {
		Book = book;
	}
	@Override
	public String toString() {
		return "Library [rollNum=" + rollNum + ", Book=" + Book + "]";
	}
}
